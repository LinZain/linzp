package com.linzp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.linzp.entity.StuInfoRole;
import com.linzp.service.CommodityInfoService;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Controller
public class CommodityInfoController{
    @Autowired
    CommodityInfoService studentInfoService;
    
    @RequestMapping(value="/stuInfo")
    public String queryStuInfo(HttpServletRequest request, HttpServletResponse response) throws IOException{
        JSONObject jsonObject = new JSONObject();
        JSONArray jsonArray = new JSONArray();
        
        List<StuInfoRole> list = studentInfoService.queryList();
        if(null == list || list.isEmpty()){
            return null;
        }else{
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
        return "../index";
    }
}
