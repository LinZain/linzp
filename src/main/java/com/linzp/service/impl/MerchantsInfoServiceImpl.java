package com.linzp.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.linzp.dao.BaseDaoI;
import com.linzp.entity.MerchantsRole;
import com.linzp.service.MerchantsInfoService;

@Service("merchantsInfoService")
public class MerchantsInfoServiceImpl implements MerchantsInfoService {
	@Autowired
	private BaseDaoI<MerchantsRole> execOrderDAO;

	@Override
	public MerchantsRole getMerchants(String fromApp, String merchantsId) {
		Map<String, Object> params = new HashMap<String, Object>();
		StringBuffer hql = new StringBuffer();
		hql.append("from MerchantsRole");
		if(fromApp != null && !fromApp.isEmpty()){
			hql.append("where forApp= :fromApp");
			params.put("fromApp", fromApp);
		}
		if(merchantsId != null && !merchantsId.isEmpty()){
			hql.append("and merchants_id= :merchantsId");
			params.put("merchantsId", merchantsId);
		}

		MerchantsRole role = execOrderDAO.get(hql.toString(), params);
		return role;
	}

	@Override
	public List<MerchantsRole> getMerchantsListById(String merchantsIds) {
		Map<String, Object> params = new HashMap<String, Object>();
		String sql = "from MerchantsRole where merchants_id in (:merchantsIds)";
		params.put("merchantsIds", merchantsIds);

		List<MerchantsRole> list = execOrderDAO.find(sql, params);
		return list;
	}

}
