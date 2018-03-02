package com.linzp.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.linzp.dao.BaseDaoI;
import com.linzp.entity.StuInfoRole;
import com.linzp.service.CommodityInfoService;

@Service("studentInfoService")
public class CommodityInfoServiceImpl implements CommodityInfoService {
    @Autowired
    private BaseDaoI<StuInfoRole> execOrderDAO;

    @Override
    public List<StuInfoRole> queryList(StuInfoRole role) {
        String hql = "from StuInfoRole ";
        Map<String, Object> params = new HashMap<String, Object>();
        List<StuInfoRole> list = execOrderDAO.find(hql + whereHql(new StuInfoRole(), params), params);
        return list;
    }

    private String whereHql(StuInfoRole role, Map<String, Object> params) {
        StringBuffer hql = new StringBuffer();
        if (role != null) {
            hql.append(" where 1 = 1 ");
            if (StringUtils.isNotBlank(role.getStuName())) {
                hql.append("and stu_name like :stuName");
                params.put("stuName", "%" + role.getStuName() + "%");
            }
            if (StringUtils.isNotBlank(role.getStuNO())) {
                hql.append("and stu_no = :stuNo");
                params.put("stuNo", role.getStuNO());
            }
            if (StringUtils.isNotBlank(role.getStuSex())) {
                hql.append("and stu_sex like :stuSex");
                params.put("stuSex", "%" + role.getStuSex() + "%");
            }
        }
        return hql.toString();
    }

    @Override
    public Long getListCount(StuInfoRole role) {
        Map<String, Object> params = new HashMap<String, Object>();
        StringBuilder hql = new StringBuilder("select count(*) from StuInfoRole ");
        hql.append(whereHql(role, params));
        Long total = execOrderDAO.count(hql.toString(), params);
        return total;
    }

}
