package com.linzp.service;

import com.linzp.entity.WechatUserRole;

public interface WechatUserInfoService {
	public WechatUserRole getWechatUser(String openId);
	public void save(WechatUserRole role);
}
