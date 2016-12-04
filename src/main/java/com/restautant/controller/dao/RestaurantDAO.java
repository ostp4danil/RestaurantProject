package com.restautant.controller.dao;

import com.restautant.model.RestaurantModel;

import java.util.List;

/**
 * Created by Danil-MAC on 12/5/16.
 */
public interface RestaurantDAO extends DAO<RestaurantModel>{

    @Override
    void create(RestaurantModel object);

    @Override
    void remove(RestaurantModel object);

    @Override
    void removeAll();

    @Override
    void update(RestaurantModel object, String oldName);

    @Override
    RestaurantModel read(String name);

    @Override
    List<? extends RestaurantModel> readAll();
}
