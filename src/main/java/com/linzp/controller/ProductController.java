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
@RequestMapping(value="/pdt")
public class ProductController {
    @Autowired
    ProductInfoService productInfoService;

    @ResponseBody
    @RequestMapping(value = { "/getPdt" }, method = { RequestMethod.GET })
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
    @RequestMapping(value = { "/getPdtByGroupId" }, method = { RequestMethod.GET })
    public String queryListByGroupId(String groupId, HttpServletRequest request, HttpServletResponse response) throws IOException {
        JSONObject jsonObject = new JSONObject();
        List<Product> list = productInfoService.getListByGroupId(groupId);
        if(list == null || list.isEmpty()){
            return "error";
        }
        long conut = productInfoService.countListByGroupId(groupId).longValue();
        jsonObject.put("rows",list);
        jsonObject.put("total",conut);
        return jsonObject.toString();
    }

    @ResponseBody
    @RequestMapping(value = { "/getPdtByGroupIdByPage" }, method = { RequestMethod.GET })
    public String queryListByGroupId(String groupId, int page, int rows,HttpServletRequest request, HttpServletResponse response) throws IOException {
        JSONObject jsonObject = new JSONObject();
        List<Product> list = productInfoService.getListByGroupIdByPage(groupId,page,rows);
        if(list == null || list.isEmpty()){
            return "error";
        }
        long conut = productInfoService.countListByGroupId(groupId).longValue();
        jsonObject.put("rows",list);
        jsonObject.put("total",conut);
        return jsonObject.toString();
    }

    
    @ResponseBody
    @RequestMapping(value = { "/getPdtByActId" }, method = { RequestMethod.GET })
    public String queryListByActId(String actId, HttpServletRequest request, HttpServletResponse response) throws IOException {
    	JSONObject jsonObject = new JSONObject();
    	List<Product> list = productInfoService.getListByActId(actId);
    	if(list == null || list.isEmpty()){
    		return "error";
    	}
    	long conut = list.size();
    	jsonObject.put("rows",list);
    	jsonObject.put("total",conut);
    	return jsonObject.toString();
    }
    
}
