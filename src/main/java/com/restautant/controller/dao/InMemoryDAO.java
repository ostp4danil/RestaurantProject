package com.restautant.controller.dao;

import com.restautant.model.RestaurantModel;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Danil-MAC on 12/4/16.
 */
public class InMemoryDAO<T extends RestaurantModel> implements DAO<T> {

    private Set<T> data = new HashSet<T>();

    @Override
    public void create(T object) {
        data.add(object);
    }

    @Override
    public void remove(T object) {
        data.remove(object);
    }

    @Override
    public void update(T object, String oldName) {
        boolean needException = true;
        for (T item : data) {
            if (oldName.equalsIgnoreCase(item.getName())) {
                data.remove(object);
                needException = false;
            }
        }
        if (needException){
            throw new RuntimeException("Not found: " + oldName);
        }
        data.add(object);
    }

    @Override
    public T read(String name) {
        for (T item : data) {
            if (name.equalsIgnoreCase(item.getName())) {
                return item;
            }

        }
        throw new RuntimeException("Not found: " + name);
    }
}
