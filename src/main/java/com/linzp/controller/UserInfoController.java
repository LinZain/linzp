package com.linzp.controller;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.linzp.entity.AddressRole;
import com.linzp.entity.DiscountRole;
import com.linzp.service.AddressInfoService;
import com.linzp.service.DiscountInfoService;
import com.linzp.util.DateUtils;

import net.sf.json.JSONObject;

@Controller
@RequestMapping(value = "/user")
public class UserInfoController {
	@Autowired
	private AddressInfoService addressInfoService;
	// @Autowired
	// private WechatUserInfoService wechatUserInfoService;
	@Autowired
	private DiscountInfoService discountInfoService;

	@ResponseBody
	@RequestMapping(value = { "/getAddressList" }, method = { RequestMethod.GET })
	public String getAddressList(String userId, HttpServletRequest request, HttpServletResponse response) throws IOException {
		JSONObject jsonObject = new JSONObject();
		List<AddressRole> list = addressInfoService.getAddressList(userId);
		if (list == null || list.isEmpty()) {
			return null;
		}
		long conut = list.size();
		jsonObject.put("rows", list);
		jsonObject.put("total", conut);
		return jsonObject.toString();
	}

	@ResponseBody
	@RequestMapping(value = { "/getDefaultAddress" }, method = { RequestMethod.GET })
	public String getDefaultAddress(String userId, HttpServletRequest request, HttpServletResponse response) throws IOException {
		JSONObject jsonObject = new JSONObject();
		AddressRole role = addressInfoService.getDefaultAddress(userId);

		jsonObject = JSONObject.fromObject(role);
		return jsonObject.toString();
	}

	// @ResponseBody
	// @RequestMapping(value = { "/getUserRegister" }, method = {
	// RequestMethod.GET })
	// public String getUserRegister(WechatUserRole role, HttpServletRequest
	// request, HttpServletResponse response) throws IOException {
	// UserRole userRole = null;
	//
	// JSONObject jsonObject = new JSONObject();
	// WechatUserRole roleFromDb =
	// wechatUserInfoService.getWechatUser(role.getOpenId());
	// if (roleFromDb != null) {
	// roleFromDb.setSessionKey(role.getSessionKey());
	// roleFromDb.setNickName(role.getNickName());
	// roleFromDb.setAvatarUrl(role.getAvatarUrl());
	// roleFromDb.setGender(role.getGender());
	// roleFromDb.setCity(role.getCity());
	// roleFromDb.setProvince(role.getProvince());
	// roleFromDb.setCountry(role.getCountry());
	// roleFromDb.setLanguage(role.getLanguage());
	// roleFromDb.setImpowerStatus(role.getImpowerStatus());
	// wechatUserInfoService.save(roleFromDb);
	// } else {
	// userRole = wechatUserInfoService.getUserRegister(role);
	// }
	//
	// if (userRole != null) {
	// jsonObject.put("userId", userRole.getUserId());
	// return jsonObject.toString();
	// }
	//
	// jsonObject = JSONObject.fromObject(role);
	// return jsonObject.toString();
	// }

	@ResponseBody
	@RequestMapping(value = { "/getDiscountPrice" }, method = { RequestMethod.GET })
	public String getDiscountPrice(String discountCode, String totalPrice, String fromApp, HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		JSONObject jsonObject = new JSONObject();
		String resultPrice = "0";
		DiscountRole role = discountInfoService.getDiscountPrice(discountCode, fromApp);
		if (role != null) {
			resultPrice = getDiscountPrice(totalPrice, role);
			jsonObject.put("discountPrice", resultPrice);
		}
		jsonObject.put("discountPrice", resultPrice);
		return jsonObject.toString();
	}

	private String getDiscountPrice(String totalPrice, DiscountRole role) {
		String result = role.getDiscountPrice();
		try {
			Date useDate = DateUtils.YYYY_MM_DD(role.getUseDate());
			Date currDate = DateUtils.getCurrDate_YYYY_MM_DD();

			if ("0".equals(role.getUseThreshold())) {
				result = "-3";
			} else if (Double.valueOf(totalPrice) <= Double.valueOf(role.getUseThreshold())) {
				result = "-1";
			} else if (useDate.before(currDate)) {
				result = "-2";
			}
		} catch (ParseException e) {
			result = "0";
		}
		return result;
	}
}
