package com.linzp.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.linzp.entity.AddressRole;
import com.linzp.entity.WechatUserRole;
import com.linzp.service.AddressInfoService;
import com.linzp.service.UserInfoService;
import com.linzp.service.WechatUserInfoService;

import net.sf.json.JSONObject;

@Controller
@RequestMapping(value = "/user")
public class UserInfoController {
	@Autowired
	private AddressInfoService addressInfoService;
	@Autowired
	private WechatUserInfoService wechatUserInfoService;
	@Autowired
	private UserInfoService userInfoService;

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

	@ResponseBody
	@RequestMapping(value = { "/getUserRegister" }, method = { RequestMethod.GET })
	public String getUserRegister(WechatUserRole role, HttpServletRequest request, HttpServletResponse response) throws IOException {
		JSONObject jsonObject = new JSONObject();
		WechatUserRole roleFromDb = wechatUserInfoService.getWechatUser(role.getOpenId());
		if (roleFromDb != null) {
			roleFromDb.setSessionKey(role.getSessionKey());
			roleFromDb.setNickName(role.getNickName());
			roleFromDb.setAvatarUrl(role.getAvatarUrl());
			roleFromDb.setGender(role.getGender());
			roleFromDb.setCity(role.getCity());
			roleFromDb.setProvince(role.getProvince());
			roleFromDb.setCountry(role.getCountry());
			roleFromDb.setLanguage(role.getLanguage());
			roleFromDb.setImpowerStatus(role.getImpowerStatus());
			wechatUserInfoService.save(roleFromDb);
		}else{
			
		}

		jsonObject = JSONObject.fromObject(role);
		return jsonObject.toString();
	}
}
