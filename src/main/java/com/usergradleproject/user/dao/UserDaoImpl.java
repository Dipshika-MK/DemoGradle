package com.usergradleproject.user.dao;

import com.usergradleproject.hibernate.HibernateConfig;
import com.usergradleproject.user.dto.User;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class UserDaoImpl implements UserRepositoryInterface {
    HibernateConfig hibernateConfig= new HibernateConfig();
    private SessionFactory sessionFactory = (SessionFactory) hibernateConfig.sessionFactory();
    public void setSessionFactory(SessionFactory sf){
        this.sessionFactory = sf;
    }

    @Override
    public User getUser(String email, String password) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(email,password);
        return (User) session;
    }

    @Override
    public User updateUser(int id, User user) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(String.valueOf(id),user);
        return null;
    }
/*
    @Override
    public void deleteUser(int id) {

    }

    @Override
    public User saveUser(User user) {
        return null;
    }*/
}
