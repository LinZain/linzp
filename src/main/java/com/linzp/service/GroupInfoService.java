package com.linzp.service;

import java.util.List;

import com.linzp.entity.GroupRole;

public interface GroupInfoService {
	
	public List<GroupRole> getGroupList(String fromApp);
}
