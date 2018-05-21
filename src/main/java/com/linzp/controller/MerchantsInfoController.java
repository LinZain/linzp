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

import com.linzp.entity.MerchantsRole;
import com.linzp.service.MerchantsInfoService;

import net.sf.json.JSONObject;

@Controller
@RequestMapping(value = "/merchants")
public class MerchantsInfoController {
	@Autowired
	private MerchantsInfoService merchantsInfoService;

	@ResponseBody
	@RequestMapping(value = { "/getMerchants" }, method = { RequestMethod.GET })
	public String getAddressList(String fromApp, String merchantsId, HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		JSONObject jsonObject = new JSONObject();
		MerchantsRole role = merchantsInfoService.getMerchants(fromApp, merchantsId);
		if (role != null) {
			jsonObject = JSONObject.fromObject(role);
			return jsonObject.toString();
		}
		return null;
	}

	@ResponseBody
	@RequestMapping(value = { "/getMerchantsListById" }, method = { RequestMethod.GET })
	public String getMerchantsListById(String merchantsIds, HttpServletRequest request, HttpServletResponse response) throws IOException {
		JSONObject jsonObject = new JSONObject();
		List<MerchantsRole> list = merchantsInfoService.getMerchantsListById(merchantsIds);
		if (list == null || list.isEmpty()) {
			return null;
		}
		long conut = list.size();
		jsonObject.put("rows", list);
		jsonObject.put("total", conut);
		return jsonObject.toString();
	}
}
