package com.linzp.service;

import com.linzp.entity.StuInfoRole;

public interface UserService {
    public StuInfoRole login(String name, String pwd);
}
