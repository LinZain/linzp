package com.linzp.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.linzp.dao.BaseDaoI;
import com.linzp.entity.BannerRole;
import com.linzp.service.BannerInfoService;

@Service("bannerInfoService")
public class BannerInfoServiceImpl implements BannerInfoService {
	@Autowired
	private BaseDaoI<BannerRole> execOrderDAO;

	@Override
	public List<BannerRole> getBannerList(String fromApp, int count) {
		Map<String, Object> params = new HashMap<String, Object>();
		String sql = "select * from tb_banner where forApp =:fromApp and banner_status=0 limit :count";
		params.put("fromApp", fromApp);
		params.put("count", count);

		List<BannerRole> list = (List<BannerRole>) execOrderDAO.findEntityBySql(sql, params,BannerRole.class);
		return list;
	}

}
