package com.linzp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.linzp.entity.WechatConfigRole;
import com.linzp.util.Constants;
import com.linzp.util.HttpUtil;

@Controller
public class WechatLittleAppController {
	@Autowired
	private WechatConfigRole configRole;

	@RequestMapping(value = "/onLogin")
	public String getOpenId(String code) {
		System.out.println(code);
		String appid = configRole.getAppID();
		String secret = configRole.getAppSecret();
		String url = String.format(Constants.WECHAT_GET_OPENID_URL, appid, secret, code);
		return HttpUtil.get(url);
	}
}
