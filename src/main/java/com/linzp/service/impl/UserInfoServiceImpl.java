package com.linzp.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.linzp.dao.BaseDaoI;
import com.linzp.entity.UserRole;
import com.linzp.service.UserInfoService;

@Service("userInfoService")
public class UserInfoServiceImpl implements UserInfoService {
	@Autowired
	private BaseDaoI<UserRole> execOrderDAO;

	@Override
	public void addNewUser(UserRole role) {
		Map<String, Object> params = new HashMap<String, Object>();
		String sql = "insert into tb_user(login_name,password,nick_name) values(:loginName, :password, :nickName);";
		params.put("loginName", role.getLoginName());
		params.put("password", role.getPassword());
		params.put("nickName", role.getNickName());
		execOrderDAO.executeSql(sql, params);
	}

	@Override
	public String save(UserRole role) {
		return null;
	}

	@Override
	public UserRole getUser(UserRole role) {
		Map<String, Object> params = new HashMap<String, Object>();
		String hql = "from UserRole where login_name = :loginName and password = :password and nick_name = :nickName";
		params.put("loginName", role.getLoginName());
		params.put("password", role.getPassword());
		params.put("nickName", role.getNickName());
		return execOrderDAO.get(hql);
	}
	
}
