package com.linzp.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.linzp.dao.BaseDaoI;
import com.linzp.entity.GroupRole;
import com.linzp.service.GroupInfoService;

@Service("groupInfoService")
public class GroupInfoServiceImpl implements GroupInfoService {
    @Autowired
    private BaseDaoI<GroupRole> execOrderDAO;

    @Override
    public List<GroupRole> getGroupList(String fromApp) {
        Map<String, Object> params = new HashMap<String, Object>();
        String sql = "from GroupRole where group_status = '0' and forApp= :fromApp";
        params.put("fromApp", fromApp);

        List<GroupRole> list = execOrderDAO.find(sql, params);
        return list;
    }

}
