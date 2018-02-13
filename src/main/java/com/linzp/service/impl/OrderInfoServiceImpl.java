package com.linzp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.linzp.dao.OrderInfoDao;
import com.linzp.entity.StuInfoRole;
import com.linzp.service.OrderInfoService;

@Service("orderInfoService")
public class OrderInfoServiceImpl implements OrderInfoService {
    @Autowired
    OrderInfoDao studentInfoDao;

    @Override
    public List<StuInfoRole> queryList() {
        return studentInfoDao.queryList();
    }

    @Override
    public void insert(StuInfoRole role) {

    }

    @Override
    public void update(StuInfoRole role) {

    }

    @Override
    public void delete(String stuNO) {

    }

    @Override
    public List<StuInfoRole> queryListByType(String type) {
        return studentInfoDao.queryListByType(type);
    }

}
