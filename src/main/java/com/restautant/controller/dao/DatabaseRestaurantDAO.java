package com.restautant.controller.dao;

import com.restautant.model.RestaurantModel;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * Created by Danil-MAC on 12/4/16.
 */
public class DatabaseRestaurantDAO<T extends RestaurantDAO> implements RestaurantDAO {

    private SessionFactory sessionFactory;

    @Override
    public void create(RestaurantModel object) {

    }

    @Override
    public void remove(RestaurantModel object) {

    }

    @Override
    public void removeAll() {

    }

    @Override
    public void update(RestaurantModel object, String oldName) {

    }

    @Override
    public RestaurantModel read(String name) {
        return null;
    }

    @Override
    public List<? extends RestaurantModel> readAll() {
        return null;
    }
}
