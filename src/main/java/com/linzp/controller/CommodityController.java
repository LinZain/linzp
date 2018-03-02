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

import com.linzp.entity.StuInfoRole;
import com.linzp.service.CommodityInfoService;

import net.sf.json.JSONObject;

@Controller
public class CommodityController {
    @Autowired
    CommodityInfoService studentInfoService;

    @ResponseBody
    @RequestMapping(value = { "/queryCom" }, method = { RequestMethod.POST })
    public String queryListByType(String type, HttpServletRequest request, HttpServletResponse response) throws IOException {
        JSONObject jsonObject = new JSONObject();
        StuInfoRole role = new StuInfoRole();
        if (type == null || type.isEmpty()) {
            role.setStuName(type);
        }
        List<StuInfoRole> list = studentInfoService.queryList(role);
        long conut = studentInfoService.getListCount(role);
        jsonObject.put("rows",list);
        jsonObject.put("total",conut);
        return jsonObject.toString();
    }
    
}
