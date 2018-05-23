package com.linzp.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.linzp.dao.BaseDaoI;
import com.linzp.entity.ActivityRole;
import com.linzp.service.ActivityInfoService;

@Service("activityInfoService")
public class ActivityInfoServiceImpl implements ActivityInfoService {
	@Autowired
	private BaseDaoI<ActivityRole> execOrderDAO;

	@Override
	public List<ActivityRole> getActList(String fromApp, int count) {
		Map<String, Object> params = new HashMap<String, Object>();
		String hql = "from ActivityRole where forApp = :fromApp and act_status=0 limit :count";
		params.put("fromApp", fromApp);
		params.put("count", count);

		List<ActivityRole> list = execOrderDAO.find(hql, params);
		return list;
	}

	@Override
	public ActivityRole getActById(String actId) {
		Map<String, Object> params = new HashMap<String, Object>();

		String hql = "from ActivityRole where act_id = :actId";
		params.put("actId", actId);

		ActivityRole role = execOrderDAO.get(hql, params);

		return role;
	}

}
