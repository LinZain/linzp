package com.linzp.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.linzp.dao.BaseDaoI;
import com.linzp.entity.UserRole;
import com.linzp.entity.WechatUserRole;
import com.linzp.service.UserInfoService;
import com.linzp.service.WechatUserInfoService;

@Service("wechatUserInfoService")
public class WechatUserInfoServiceImpl implements WechatUserInfoService {
	@Autowired
	private BaseDaoI<WechatUserRole> execOrderDAO;
	@Autowired
	private UserInfoService userInfoService;

	@Override
	public WechatUserRole getWechatUser(String openId) {
		Map<String, Object> params = new HashMap<String, Object>();
		String hql = "from WechatUserRole where open_id = :openId";
		params.put("openId", openId);
		return execOrderDAO.get(hql, params);
	}

	@Override
	public void save(WechatUserRole role) {
		execOrderDAO.saveOrUpdate(role);
	}

	@Override
	public UserRole getUserRegister(WechatUserRole role) {
		UserRole userRole = new UserRole();
		userRole.setLoginName(role.getOpenId());
		userRole.setPassword(role.getSessionKey());
		userRole.setNickName(role.getNickName());
		
		userInfoService.addNewUser(userRole);
		return userInfoService.getUser(userRole);
	}

}
