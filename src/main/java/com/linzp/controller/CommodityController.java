package com.linzp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.linzp.entity.StuInfoRole;
import com.linzp.service.CommodityInfoService;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Controller
public class CommodityController {
    @Autowired
    CommodityInfoService studentInfoService;

    @RequestMapping(value = { "/queryCom" }, method = { RequestMethod.POST })
    public String queryListByType(String type, HttpServletRequest request, HttpServletResponse response) throws IOException {
        JSONObject jsonObject = new JSONObject();
        JSONArray jsonArray = new JSONArray();
        List<StuInfoRole> list = null;
        if (type == null || type.isEmpty()) {
            list = studentInfoService.queryList();
        } else {
            list = studentInfoService.queryListByType(type);
        }
        
        if (null != list && !list.isEmpty()) {
            for (StuInfoRole role : list) {
                jsonArray.add(role);
            }
            jsonObject.put("rows", jsonArray);
        }
        
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=utf-8");
        PrintWriter out = response.getWriter();
        out.print(jsonObject.toString());
        out.flush();
        out.close();
        return "jsp/commodity/commodityList";
    }
}
