package com.linzp.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.linzp.dao.CommodityInfoDao;
import com.linzp.entity.StuInfoRole;

@Repository("StudentInfoDao") 
public class CommodityInfoDaoImpl implements CommodityInfoDao {

    @Autowired
    private SessionFactory sessionFactory;
    
    @SuppressWarnings("unchecked")
    @Override
    public List<StuInfoRole> queryList() {
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        tx = session.beginTransaction();
        Query query = session.createQuery("from StuInfoRole");
        if(query == null){
            return null;
        }
        List<StuInfoRole> list = query.list();
        tx.commit();
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

}
