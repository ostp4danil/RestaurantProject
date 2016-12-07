package com.restautant.service;

import com.restautant.dao.DAO;
import com.restautant.model.Model;
import com.restautant.validator.Validator;

import java.util.Set;

public abstract class IModelService<T extends Model> implements Service<T> {

    protected DAO<T> modelDAO;
    protected Set<T> availableModels;
    protected Validator<T> validator;


    @Override
    public void synchronize() {
        availableModels.retainAll(modelDAO.readAll());
        availableModels.addAll(modelDAO.readAll());
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
    public void edit(T model, String oldName) {
        modelDAO.update(model, oldName);
        synchronize();
    }

    @Override
    public Set<T> getAll() {
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
    public void setDAO(DAO modelDao) {
        this.modelDAO = modelDao;
    }

    @Override
    public void setAvailableModels(Set<T> availableModels) {

        this.availableModels = availableModels;
    }

    @Override
    public Validator<T> getValidator() {
        return validator;
    }

    @Override
    public void setValidator(Validator<T> validator) {
        this.validator = validator;
    }


}
