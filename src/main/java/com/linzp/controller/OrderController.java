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
import com.linzp.service.OrderInfoService;

import net.sf.json.JSONObject;

@Controller
@RequestMapping(value="/order")
public class OrderController {
    @Autowired
    OrderInfoService orderInfoService;

    @ResponseBody
    @RequestMapping(value = { "/queryOrder" }, method = { RequestMethod.POST })
    public String queryListByType(String type, HttpServletRequest request, HttpServletResponse response) throws IOException {
        JSONObject json = new JSONObject();
        StuInfoRole role = new StuInfoRole();
        role.setStuName(type);
        List<StuInfoRole> list = orderInfoService.queryList(role);
        long conut = orderInfoService.getListCount(role);
        json.put("rows",list);
        json.put("total",conut);
        return json.toString();
    }
}
