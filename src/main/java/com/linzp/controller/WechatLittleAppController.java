package com.linzp.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.linzp.util.Constants;
import com.linzp.util.HttpUtil;

import net.sf.json.JSONObject;

@Controller
public class WechatLittleAppController {
    private static Logger logger = Logger.getLogger(WechatLittleAppController.class);

    @ResponseBody
    @RequestMapping(value = "/onLogin", method = RequestMethod.GET)
    public String getOpenId(HttpServletRequest request) {
        String appid = request.getParameter("appid");
        String secret = request.getParameter("secret");
        String jsCode = request.getParameter("js_code");
        String grantType = request.getParameter("grant_type");
        if (appid == null || secret== null || jsCode == null || grantType == null) {
            return "error";
        }
        String url = String.format(Constants.WECHAT_GET_OPENID_URL, appid, secret, jsCode, grantType);
        String data = HttpUtil.get(url);
        JSONObject jsonData = new JSONObject();
        jsonData.put("data", data);

        return jsonData.toString();
    }
    
    @ResponseBody
    @RequestMapping(value = "/getNumber", method = RequestMethod.GET)
    public String getNumber(HttpServletRequest request) {
    	String stNum = request.getParameter("stnum");
    	String url = String.format("http://119.23.221.161:8090/getNumber?stnum=%s", stNum);
    	String data = HttpUtil.get(url);
    	JSONObject jsonData = new JSONObject();
    	jsonData.put("data", data);
    	
    	return jsonData.toString();
    }
}
