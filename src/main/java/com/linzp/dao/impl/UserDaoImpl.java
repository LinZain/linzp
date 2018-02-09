package com.linzp.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.linzp.dao.UserDao;
import com.linzp.entity.StuInfoRole;

@Repository("userDao")
@SuppressWarnings("unchecked")
public class UserDaoImpl implements UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public boolean login(String name, String pwd) {
        Session session = null;
        try {
            boolean result = false;
            session = sessionFactory.openSession();
            Query query = session.createQuery("from StuInfoRole");
            if (query == null) {
                return result;
            }
            List<StuInfoRole> list = query.list();
            if (list != null && !list.isEmpty()) {
                result = true;
            }
            return result;
        } finally {
            if (session != null) {
                session.close();
            }
        }

    }

}
