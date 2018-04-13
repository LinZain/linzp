package com.test;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import com.linzp.util.HttpUtil;

import net.sf.json.JSONObject;

public class RequestTests {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String url = "http://127.0.0.1:8080/commodity-management/onLogin?appid=appid&secret=secret&js_code=js_code&grant_type=grant_type";
        System.out.println(HttpUtil.get(url));
        
    }
}
