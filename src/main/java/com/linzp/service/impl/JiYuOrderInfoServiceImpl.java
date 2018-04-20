package com.linzp.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.linzp.dao.BaseDaoI;
import com.linzp.entity.JiYuOrderRole;
import com.linzp.entity.StuInfoRole;
import com.linzp.service.JiYuOrderInfoService;

@Service("jiYuOrderInfoService")
@Transactional
public class JiYuOrderInfoServiceImpl implements JiYuOrderInfoService {
    
    @Autowired
    private BaseDaoI<JiYuOrderRole> execOrderDAO;

    @Override
    public void saveJiYuOrder(JiYuOrderRole role) {
        if(role != null){
            execOrderDAO.save(role);
        }
    }

    @Override
    public List<JiYuOrderRole> getOrderList(JiYuOrderRole role) {
        String hql = "from JiYuOrderRole ";
        Map<String, Object> params = new HashMap<String, Object>();
        List<JiYuOrderRole> list = execOrderDAO.find(hql + whereHql(role, params),params);
        return list;
    }
    
    @Override
    public Long getListCount(JiYuOrderRole role) {
        Map<String, Object> params = new HashMap<String, Object>();
        StringBuilder hql = new StringBuilder("select count(*) from JiYuOrderRole ");
        hql.append(whereHql(role, params));
        Long total = execOrderDAO.count(hql.toString(), params);
        return total;
    }

    private String whereHql(JiYuOrderRole role, Map<String, Object> params) {
        StringBuffer hql = new StringBuffer();
        if (role != null) {
            hql.append(" where 1 = 1 ");
            if (StringUtils.isNotBlank(role.getCustomerName())) {
                hql.append("and customer_name like :customerName");
                params.put("customerName", "%" + role.getCustomerName() + "%");
            }
            if (StringUtils.isNotBlank(role.getCustomerPhone())) {
                hql.append("and phone = :phone");
                params.put("phone", role.getCustomerPhone());
            }
            if (StringUtils.isNotBlank(role.getCustomerAddress())) {
                hql.append("and address like :customerAddress");
                params.put("customerAddress", "%" + role.getCustomerAddress() + "%");
            }
            if (StringUtils.isNotBlank(role.getCustomerType())) {
                hql.append("and appointment_tpye like :customerType");
                params.put("customerType", "%" + role.getCustomerType() + "%");
            }
        }
        return hql.toString();
    }

}
