package com.restautant.service;

import com.restautant.dao.DAO;
import com.restautant.validator.Validator;

import java.util.Set;

/**
 * Created by Danil-MAC on 12/6/16.
 */
public interface Service<T> {

    void synchronize();

    void add(T object);

    void remove(T object);

    void edit(T object, String name);

    Set<T> getAll();

    DAO getDAO();

    void setDAO(DAO dao);

    void setAvailableModels(Set<T> availableModels);

    Validator<T> getValidator();

    void setValidator(Validator<T> validator);
}