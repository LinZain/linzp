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
    @Autowired
    private WechatConfigRole configRole;

    @RequestMapping(value = "/onLogin", method = RequestMethod.GET)
    public String getOpenId(HttpServletRequest request) {
        String reqStr = request.getQueryString();
        System.out.println("请求参数名---------------------------"+reqStr);
        if (reqStr == null || reqStr.isEmpty()) {
            return "error";
        }
        JSONObject reqJson = JSONObject.fromObject(reqStr);
        String jsCode = (String) reqJson.get("js_code");

        String appid = configRole.getAppID();
        String secret = configRole.getAppSecret();
        String url = String.format(Constants.WECHAT_GET_OPENID_URL, appid, secret, jsCode);
        String data = HttpUtil.get(url);
        System.out.println(data);
        JSONObject jsonData = new JSONObject();
        jsonData.put("data", data);

        return jsonData.toString();
    }
}
