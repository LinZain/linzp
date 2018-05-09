package com.linzp.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.linzp.dao.BaseDaoI;
import com.linzp.entity.AddressRole;
import com.linzp.service.AddressInfoService;

@Service("addressInfoService")
public class AddressInfoServiceImpl implements AddressInfoService {
	@Autowired
	private BaseDaoI<AddressRole> execOrderDAO;

	@Override
	public AddressRole getDefaultAddress(String userId) {
		Map<String, Object> params = new HashMap<String, Object>();
		String hql = "from AddressRole where user_id= :userId and is_default='true'";
		params.put("userId", userId);
		
		return execOrderDAO.get(hql, params);
	}

	@Override
	public List<AddressRole> getAddressList(String userId) {
		Map<String, Object> params = new HashMap<String, Object>();
		String hql = "from AddressRole where user_id= :userId";
		params.put("userId", userId);
		
		return execOrderDAO.find(hql, params);
	}

}
