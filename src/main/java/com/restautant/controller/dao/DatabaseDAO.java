package com.restautant.controller.dao;

import com.restautant.model.Model;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * Created by Danil-MAC on 12/4/16.
 */
public class DatabaseDAO<T extends DAO> implements DAO {

    private SessionFactory sessionFactory;

    @Override
    public void add(Model object) {

    }

    @Override
    public void remove(Model object) {

    }

    @Override
    public void removeAll() {

    }

    @Override
    public void update(Model object, String oldName) {

    }

    @Override
    public Model read(String name) {
        return null;
    }

    @Override
    public List<? extends Model> readAll() {
        return null;
    }
}
