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

import com.linzp.entity.JiYuOrderRole;
import com.linzp.service.JiYuOrderInfoService;

import net.sf.json.JSONObject;

@Controller
@RequestMapping(value="/jiyu")
public class JiYuAppController {
    @Autowired
    JiYuOrderInfoService orderInfoService;

    @ResponseBody
    @RequestMapping(value = { "/saveOrder" }, method = { RequestMethod.GET })
    public String saveOrder(JiYuOrderRole role, HttpServletRequest request, HttpServletResponse response) throws IOException {
        if(role != null){
            orderInfoService.saveJiYuOrder(role);
        }else{
            return null;
        }
        return "success";
    }
    
    @ResponseBody
    @RequestMapping(value = { "/queryOrder" }, method = { RequestMethod.GET })
    public String queryOrder(JiYuOrderRole role, HttpServletRequest request, HttpServletResponse response) throws IOException {
        JSONObject json = new JSONObject();
        List<JiYuOrderRole> list = orderInfoService.getOrderList(role);
        long conut = orderInfoService.getListCount(role);
        json.put("rows",list);
        json.put("total",conut);
        return json.toString();
    }
}
