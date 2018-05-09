package com.linzp.service.impl;

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
	public String getNewUserId(String userName, String pwd, String nickName) {
		
		String sql = "insert into ";
		// TODO 自动生成的方法存根
		return null;
	}
	
}
