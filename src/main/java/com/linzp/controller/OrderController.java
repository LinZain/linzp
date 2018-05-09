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

import com.linzp.entity.OrderRole;
import com.linzp.service.OrderInfoService;

import net.sf.json.JSONObject;

@Controller
@RequestMapping(value="/order")
public class OrderController {
    @Autowired
    OrderInfoService orderInfoService;

    @ResponseBody
    @RequestMapping(value = { "/getOrderList" }, method = { RequestMethod.POST })
    public String queryListByType(String userId, HttpServletRequest request, HttpServletResponse response) throws IOException {
        JSONObject json = new JSONObject();
        List<OrderRole> list = orderInfoService.getOrderList(userId);
        if(list == null || list.isEmpty()){
            return null;
        }
        long conut = list.size();
        json.put("rows",list);
        json.put("total",conut);
        return json.toString();
    }
    
    @ResponseBody
    @RequestMapping(value = { "/addOrder" }, method = { RequestMethod.POST })
    public String addOrder(OrderRole role, HttpServletRequest request, HttpServletResponse response) throws IOException {
    	 if(role != null){
             orderInfoService.addOrder(role);
         }else{
             return null;
         }
         return "success";
    }
}
