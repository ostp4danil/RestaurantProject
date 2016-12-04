package com.restautant.controller.dao;

import org.hibernate.SessionFactory;

/**
 * Created by Danil-MAC on 12/4/16.
 */
public class DatabaseDAO<T> implements DAO<T> {

    private SessionFactory sessionFactory;

    @Override
    public void create(T object) {

    }

    @Override
    public void remove(T object) {

    }

    @Override
    public void update(T object, String oldName) {

    }

    @Override
    public T read(String name) {
        return null;
    }
}
