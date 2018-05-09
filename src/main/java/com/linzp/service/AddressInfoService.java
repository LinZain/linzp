package com.linzp.service;

import java.util.List;

import com.linzp.entity.AddressRole;

public interface AddressInfoService {
	public AddressRole getDefaultAddress(String userId);
	public List<AddressRole> getAddressList(String userId);
}
