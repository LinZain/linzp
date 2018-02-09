package com.linzp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.linzp.dao.UserDao;
import com.linzp.service.UserService;
@Service("userService")
public class UserSerivceImpl implements UserService {

    @Autowired
    private UserDao dao;
    
    @Override
    public boolean login(String name, String pwd) {
        return dao.login(name, pwd);
    }

}
