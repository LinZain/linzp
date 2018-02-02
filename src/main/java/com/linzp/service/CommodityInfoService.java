package com.linzp.service;

import java.util.List;

import com.linzp.entity.StuInfoRole;

public interface CommodityInfoService {
    public List<StuInfoRole> queryList();
    public List<StuInfoRole> queryListByType(String type);
    public void insert(StuInfoRole role);
    public void update(StuInfoRole role);
    public void delete(String stuNO);
}
