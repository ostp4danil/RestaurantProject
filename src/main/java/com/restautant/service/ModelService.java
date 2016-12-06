package com.restautant.service;

import com.restautant.controller.dao.DAO;
import com.restautant.model.Model;
import com.restautant.service.validator.Validator;

import java.util.Collection;
import java.util.Set;

public class ModelService<T extends Model> implements Service<T> {

    private DAO modelDAO;
    private Set<T> availableModels;
    private Validator<? super T> validator;


    @Override
    public void synchronize() {
        availableModels.retainAll(modelDAO.readAll());
        availableModels.addAll((Collection<? extends T>) modelDAO.readAll());
    }

    @Override
    public void add(T model) {
        if (validator.isValid(model)) {
            availableModels.add(model);
            modelDAO.add(model);
            synchronize();
        }
    }

    @Override
    public Set<? extends T> getAll() {
        synchronize();
        return availableModels;
    }

    @Override
    public void remove(T model) {
        modelDAO.remove(model);
        synchronize();
    }

    @Override
    public DAO getDAO() {
        return modelDAO;
    }

    @Override
    public void setDAO(DAO dishDao) {
        this.modelDAO = dishDao;
    }

    @Override
    public void setAvailableModels(Set<T> availableModels) {

        this.availableModels = availableModels;
    }

    @Override
    public Validator<? super T> getValidator() {
        return validator;
    }

    @Override
    public void setValidator(Validator<? super T> validator) {
        this.validator = validator;
    }


}
