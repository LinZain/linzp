package com.linzp.service;

import java.util.List;

import com.linzp.entity.BannerRole;

public interface BannerInfoService {
	
	public List<BannerRole> getBannerList(String fromApp, int count);
}
