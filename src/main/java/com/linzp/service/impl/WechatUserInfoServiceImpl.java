package com.linzp.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.linzp.dao.BaseDaoI;
import com.linzp.entity.WechatUserRole;
import com.linzp.service.WechatUserInfoService;

@Service("wechatUserInfoService")
public class WechatUserInfoServiceImpl implements WechatUserInfoService {
	@Autowired
	private BaseDaoI<WechatUserRole> execOrderDAO;

	@Override
	public WechatUserRole getWechatUser(String openId) {
		Map<String, Object> params = new HashMap<String, Object>();
		String hql = "from WechatUserRole where open_id = :openId";
		params.put("openId", openId);
		return execOrderDAO.get(hql, params);
	}

	@Override
	public void save(WechatUserRole role) {
		
	}

}
