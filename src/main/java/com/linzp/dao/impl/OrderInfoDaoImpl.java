package com.linzp.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.linzp.dao.OrderInfoDao;
import com.linzp.entity.StuInfoRole;

@Repository("orderInfoDao") 
@SuppressWarnings("unchecked")
public class OrderInfoDaoImpl implements OrderInfoDao {

    @Autowired
    private SessionFactory sessionFactory;
    
    @Override
    public List<StuInfoRole> queryList() {
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("from StuInfoRole");
        if(query == null){
            return null;
        }
        List<StuInfoRole> list = query.list();
        session.close();
        return list;
    }

    @Override
    public void insert(StuInfoRole role) {

    }

    @Override
    public void update(StuInfoRole role) {

    }

    @Override
    public void delete(String stuNO) {

    }

    @Override
    public List<StuInfoRole> queryListByType(String type) {
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("from StuInfoRole where stu_sex like ?");
        query.setString(0, "%"+type+"%");
        List<StuInfoRole> list = query.list();
        session.close();
        return list;
    }

}