package com.restautant.controller.dao;

import com.restautant.model.RestaurantModel;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Danil-MAC on 12/4/16.
 */
public class InMemoryRestaurantDAO<T extends RestaurantModel> implements RestaurantDAO {

    private Set<RestaurantModel> data = new HashSet<RestaurantModel>();


    @Override
    public void create(RestaurantModel object) {
        data.add(object);
    }

    @Override
    public void remove(RestaurantModel object) {
        data.remove(object);
    }

    @Override
    public void removeAll() {
        if(data.isEmpty()){
            throw new RuntimeException(data.getClass().getSimpleName()+" are empty!");
        }
        data.removeAll(data);
    }

    @Override
    public void update(RestaurantModel object, String oldName) {
        boolean needException = true;
        for (RestaurantModel item : data) {
            if (oldName.equalsIgnoreCase(item.getName())) {
                data.remove(object);
                needException = false;
            }
        }
        if (needException) {
            throw new RuntimeException("Not found: " + oldName);
        }
        data.add(object);
    }

    @Override
    public RestaurantModel read(String name) {
        for (RestaurantModel item : data) {
            if (name.equalsIgnoreCase(item.getName())) {
                return item;
            }

        }
        throw new RuntimeException("Not found: " + name);
    }

    @Override
    public List<? extends RestaurantModel> readAll() {
        List<RestaurantModel> dataList = new ArrayList<RestaurantModel>();
        dataList.addAll(data);
        return dataList;
    }

}
