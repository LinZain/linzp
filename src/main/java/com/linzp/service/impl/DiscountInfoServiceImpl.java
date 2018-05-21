package com.linzp.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.linzp.dao.BaseDaoI;
import com.linzp.entity.DiscountRole;
import com.linzp.service.DiscountInfoService;

public class DiscountInfoServiceImpl implements DiscountInfoService {

	@Autowired
	private BaseDaoI<DiscountRole> execOrderDAO;
	
	@Override
	public DiscountRole getDiscountPrice(String discountCode, String fromApp) {
		
		Map<String, Object> params = new HashMap<String, Object>();
		String hql = "from DiscountRole where discount_code= :discountCode and forApp = :fromApp";
		params.put("discountCode", discountCode);
		params.put("fromApp", fromApp);
		
		return execOrderDAO.get(hql, params);
	}

}
