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
	public List<ActivityRole> getActList(String fromApp, String count) {
		Map<String, Object> params = new HashMap<String, Object>();
		String hql = "select * from tb_activity where forApp = :fromApp and act_status=0 limit :count";
		params.put("fromApp", fromApp);
		params.put("count", count);

		List<ActivityRole> list = (List<ActivityRole>) execOrderDAO.findEntityBySql(hql, params,ActivityRole.class);
		return list;
	}
	
	@Override
	public List<ActivityRole> getActListByPage(String fromApp, String count, int page, int rows) {
		Map<String, Object> params = new HashMap<String, Object>();
		String hql = "from ActivityRole where forApp = :fromApp and act_status = 0 order by act_time";
		params.put("fromApp", fromApp);

		List<ActivityRole> list = execOrderDAO.find(hql, params,page,rows);
		return list;
	}

	@Override
	public Long countActListByPage(String fromApp) {
		Map<String, Object> params = new HashMap<String, Object>();
		String hql = "select count(*) from ActivityRole where forApp = :fromApp and act_status = 0 order by act_time";
		params.put("fromApp", fromApp);

		return execOrderDAO.count(hql, params);
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
