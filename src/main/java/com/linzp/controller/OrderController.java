package com.linzp.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.linzp.entity.StuInfoRole;
import com.linzp.service.OrderInfoService;

import net.sf.json.JSONObject;

@Controller
@RequestMapping(value="/order")
public class OrderController {
    @Autowired
    OrderInfoService orderInfoService;

    @ResponseBody
    @RequestMapping(value = { "/queryOrder" }, method = { RequestMethod.POST })
    public String queryListByType(@RequestBody String stuName) throws IOException {
        JSONObject json = new JSONObject();
        StuInfoRole role = new StuInfoRole();
        System.out.println(stuName.length());
        if(!stuName.isEmpty()){
            role.setStuName(stuName);
        }
        List<StuInfoRole> list = orderInfoService.queryList(role);
        long conut = orderInfoService.getListCount(role);
        json.put("rows",list);
        json.put("total",conut);
        return json.toString();
    }
}
