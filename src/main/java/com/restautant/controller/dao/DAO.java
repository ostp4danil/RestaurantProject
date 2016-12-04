package com.restautant.controller.dao;

import java.util.List;

/**
 * Created by Danil-MAC on 12/4/16.
 */
public interface DAO<T> {

    void  create(T object);

    void remove(T object);

    void removeAll();

    void update(T object, String oldName);

    T read(String name);

    List<? extends T> readAll();

}
