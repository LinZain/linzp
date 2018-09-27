package com.linzp.service;

import java.math.BigInteger;
import java.util.List;

import com.linzp.entity.Product;

public interface ProductInfoService {
    public List<Product> queryList(Product role);

    public Long getListCount(Product role);

    public List<Product> getListByGroupId(String groupId , String pdtTitle,String pdtBrand, String pdtCategoyr);

    public List<Product> getListByGroupIdByPage(String groupId,String pdtTitle,String pdtBrand, String pdtCategoyr,int page, int rows);
    public BigInteger countListByGroupId(String groupId , String pdtTitle,String pdtBrand, String pdtCategoyr);

    public List<Product> getListByActId(String actId);
}
