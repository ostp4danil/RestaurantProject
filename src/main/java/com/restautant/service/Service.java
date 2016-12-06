package com.restautant.service;

import com.restautant.controller.dao.DAO;
import com.restautant.model.Dish;
import com.restautant.service.validator.Validator;

import java.util.Set;

/**
 * Created by Danil-MAC on 12/6/16.
 */
public interface Service<T> {

    void synchronize();

    void add(T object);

    void remove(T object);

    Set<? extends T> getAll();

    DAO getDAO();

    void setDAO(DAO dao);

    void setAvailableModels(Set<T> availableModels);

    Validator<? super T> getValidator();

    void setValidator(Validator<? super T> validator);
}