package com.restautant.controller.dao;

/**
 * Created by Danil-MAC on 12/4/16.
 */
public interface DAO<T> {

    public void  create(T object);

    public void remove(T object);

    public void update(T object, String oldName);

    public T read(String name);

}
