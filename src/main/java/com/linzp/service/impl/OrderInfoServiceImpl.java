package com.linzp.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.linzp.dao.BaseDaoI;
import com.linzp.entity.OrderRole;
import com.linzp.service.OrderInfoService;

@Service("orderInfoService")
@Transactional
public class OrderInfoServiceImpl implements OrderInfoService {
	@Autowired
	private BaseDaoI<OrderRole> execOrderDAO;

	@Override
	public void addOrder(OrderRole role) {
		execOrderDAO.saveOrUpdate(role);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<OrderRole> getOrderList(String userId) {
		Map<String, Object> params = new HashMap<String, Object>();
		String sql = "select * from (select * from tb_order where user_id = :userId left join on tb_order.address_id=tb_address.address_id);";
		params.put("userId", userId);

		List<OrderRole> list = (List<OrderRole>) execOrderDAO.findEntityBySql(sql, params, OrderRole.class);
		return list;
	}

}
