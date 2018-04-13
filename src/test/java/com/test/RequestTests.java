package com.test;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import com.linzp.util.HttpUtil;

import net.sf.json.JSONObject;

public class RequestTests {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String url = "http://127.0.0.1:8080/commodity-management-0.0.1-SNAPSHOT/onLogin?jsonString=";
        JSONObject json = new JSONObject();
        json.put("appid", "appid");
        json.put("secret", "app_secret");
        json.put("js_code", "js_code");
        json.put("grant_type", "grant_type");
        String r = URLEncoder.encode(json.toString(), "UTF-8");  
        url = url + r;
        System.out.println(HttpUtil.get(url));
        
    }
}
