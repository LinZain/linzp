package com.linzp.service;

import com.linzp.entity.DiscountRole;

public interface DiscountInfoService {
	public DiscountRole getDiscountPrice(String discountCode, String fromApp);
}
