package com.restautant.controller.dao;

import com.restautant.model.Model;

import java.util.Collection;
import java.util.List;

/**
 * Created by Danil-MAC on 12/5/16.
 */
public interface DAO<T> {

    void add(T object);

    void remove(T object);

    void removeAll();

    void update(T object, String oldName);

    T read(String name);

    Collection<? extends T> readAll();
}
