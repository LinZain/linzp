package com.linzp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.linzp.util.Constants;
import com.linzp.util.HttpUtil;
import com.linzp.util.WechatConfigRole;

import net.sf.json.JSONObject;

@Controller
public class WechatLittleAppController {

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
}
