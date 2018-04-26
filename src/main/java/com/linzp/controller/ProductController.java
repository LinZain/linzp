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

import com.linzp.entity.Product;
import com.linzp.service.ProductInfoService;

import net.sf.json.JSONObject;

@Controller
public class ProductController {
    @Autowired
    ProductInfoService productInfoService;

    @ResponseBody
    @RequestMapping(value = { "/queryPdt" }, method = { RequestMethod.GET })
    public String queryList(Product role, HttpServletRequest request, HttpServletResponse response) throws IOException {
        JSONObject jsonObject = new JSONObject();
        List<Product> list = productInfoService.queryList(role);
        if(list == null || list.isEmpty()){
            return "error";
        }
        long conut = productInfoService.getListCount(role);
        jsonObject.put("rows",list);
        jsonObject.put("total",conut);
        return jsonObject.toString();
    }
    @ResponseBody
    @RequestMapping(value = { "/queryPdtByGroupId" }, method = { RequestMethod.GET })
    public String queryListByGroupId(String groupId, HttpServletRequest request, HttpServletResponse response) throws IOException {
        JSONObject jsonObject = new JSONObject();
        List<Product> list = productInfoService.getListByGroup(groupId);
        if(list == null || list.isEmpty()){
            return "error";
        }
        long conut = list.size();
        jsonObject.put("rows",list);
        jsonObject.put("total",conut);
        return jsonObject.toString();
    }
    
}
