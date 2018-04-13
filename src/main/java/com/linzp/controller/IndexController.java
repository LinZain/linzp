package com.linzp.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.linzp.service.ProductInfoService;

@Controller
public class IndexController {
    @Autowired
    ProductInfoService studentInfoService;

    @RequestMapping(value = { "/change" }, method = { RequestMethod.POST })
    private String login(String url, HttpServletRequest request, HttpServletResponse response) throws IOException {
        return url;
    }
}
