package com.linzp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.linzp.service.CommodityInfoService;

@Controller
public class UserController {
    @Autowired
    CommodityInfoService studentInfoService;

    @RequestMapping(value = { "/login" }, method = { RequestMethod.POST })
    private String login(String name, String pwd, HttpServletRequest request, HttpServletResponse response) {
        return "jsp/index";
    }
}
