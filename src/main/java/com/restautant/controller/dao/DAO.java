package com.restautant.controller.dao;

import com.restautant.model.Model;

import java.util.List;

/**
 * Created by Danil-MAC on 12/5/16.
 */
public interface DAO {

    void create(Model object);

    void remove(Model object);

    void removeAll();

    void update(Model object, String oldName);

    Model read(String name);

    List<? extends Model> readAll();
}
