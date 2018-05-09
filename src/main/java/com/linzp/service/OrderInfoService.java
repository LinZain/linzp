package com.linzp.service;

import java.util.List;

import com.linzp.entity.OrderRole;

public interface OrderInfoService {
	public void addOrder(OrderRole role);
	public List<OrderRole> getOrderList(String userId);
}
