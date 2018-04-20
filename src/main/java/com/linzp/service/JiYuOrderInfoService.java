package com.linzp.service;

import java.util.List;

import com.linzp.entity.JiYuOrderRole;

public interface JiYuOrderInfoService {
    public void saveJiYuOrder(JiYuOrderRole role);
    public List<JiYuOrderRole> getOrderList(JiYuOrderRole role);
    public Long getListCount(JiYuOrderRole role);
}
