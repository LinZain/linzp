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
		String hql = "from MerchantsRole where forApp= :fromApp and merchants_id= :merchantsId;";
		params.put("fromApp", fromApp);
		params.put("merchantsId", merchantsId);
		
		MerchantsRole role = execOrderDAO.get(hql, params);
		return role;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<MerchantsRole> getMerchantsListById(String merchantsIds) {
		Map<String, Object> params = new HashMap<String, Object>();
        String sql = "select * from tb_merchants where merchants_id in (:merchantsIds);";
        params.put("merchantsIds", merchantsIds);

        List<MerchantsRole> list = (List<MerchantsRole>) execOrderDAO.findEntityBySql(sql, params, MerchantsRole.class);
        return list;
	}

}
