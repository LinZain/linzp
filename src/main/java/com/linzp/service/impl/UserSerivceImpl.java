package com.linzp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.linzp.dao.BaseDaoI;
import com.linzp.entity.StuInfoRole;
import com.linzp.service.UserService;
@Service("userService")
public class UserSerivceImpl implements UserService {

    @Autowired
    private BaseDaoI<StuInfoRole> execOrderDAO;
    
    @Override
    public StuInfoRole login(String name, String pwd) {
        String hql = "from StuInfoRole ";
        List<StuInfoRole> list = execOrderDAO.find(hql);
        if(list != null && !list.isEmpty()){
            return list.get(0);
        }
        return null;
    }

}
