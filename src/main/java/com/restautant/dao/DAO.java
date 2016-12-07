package com.restautant.dao;

import java.util.Collection;

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
