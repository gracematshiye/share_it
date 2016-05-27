package com.thoughtworks.warehouse.dao.impl;

import com.thoughtworks.warehouse.dao.ComputerDAO;
import com.thoughtworks.warehouse.entity.Computer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by gracem on 2016/05/26.
 */
@Repository
public class ComputerDAOImpl implements ComputerDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addComputer(Computer computer) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(computer);
    }

    @Override
    public List<Computer> getComputers() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Computer").list();
    }

    @Override
    public void addAll(List<Computer> list) {

        Session session = sessionFactory.getCurrentSession();
        for (Computer computer :
                list) {
            session.persist(computer);
        }
    }

}
