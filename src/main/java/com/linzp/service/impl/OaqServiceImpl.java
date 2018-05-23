package com.linzp.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.linzp.dao.BaseDaoI;
import com.linzp.entity.OaqRole;
import com.linzp.service.OaqService;

@Service("oapInfoService")
@Transactional
public class OaqServiceImpl implements OaqService {
	@Autowired
	private BaseDaoI<OaqRole> execOrderDAO;

	@Override
	public OaqRole getOaqInfo(String fromApp) {
		Map<String, Object> params = new HashMap<String, Object>();
		String hql = "from OaqInfo where froApp = :fromApp";
		params.put("fromApp", fromApp);
		return execOrderDAO.get(hql);
	}

}
