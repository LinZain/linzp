package com.linzp.service;

import com.linzp.entity.UserRole;

public interface UserInfoService {
	public void addNewUser(UserRole role);
	public String save(UserRole role);
	public UserRole getUser(UserRole role);
}
