package com.linzp.service;

import java.util.List;

import com.linzp.entity.Product;

public interface ProductInfoService {
    public List<Product> queryList(Product role);
    public Long getListCount(Product role);
    public List<Product> getListByGroup(String groupId);
}
