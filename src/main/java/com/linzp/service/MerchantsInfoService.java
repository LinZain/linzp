package com.linzp.service;

import java.util.List;

import com.linzp.entity.MerchantsRole;

public interface MerchantsInfoService {
	public MerchantsRole getMerchants(String fromApp, String merchantsId);
	public List<MerchantsRole> getMerchantsListById(String merchantsIds);
}
