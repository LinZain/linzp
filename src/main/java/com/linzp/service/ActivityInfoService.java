package com.linzp.service;

import java.util.List;

import com.linzp.entity.ActivityRole;

public interface ActivityInfoService {
	
	public List<ActivityRole> getActList(String fromApp, int count);
	public ActivityRole getActById(String actId);
}
