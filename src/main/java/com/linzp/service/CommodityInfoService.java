package com.linzp.service;

import java.util.List;

import com.linzp.entity.StuInfoRole;

public interface CommodityInfoService {
    public List<StuInfoRole> queryList(StuInfoRole role);
    public Long getListCount(StuInfoRole role);
}
