package com.restautant.controller.dao;

import com.restautant.model.Model;
import org.hibernate.SessionFactory;

import java.util.Collection;
import java.util.List;

/**
 * Created by Danil-MAC on 12/4/16.
 */
public class DatabaseDAO<T extends DAO> implements DAO {

    private SessionFactory sessionFactory;

    @Override
    public void add(Object object) {

    }

    @Override
    public void remove(Object object) {

    }

    @Override
    public void removeAll() {

    }

    @Override
    public void update(Object object, String oldName) {

    }

    @Override
    public Object read(String name) {
        return null;
    }

    @Override
    public Collection readAll() {
        return null;
    }
}
