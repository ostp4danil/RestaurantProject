package com.restautant.dao;

import com.restautant.model.Model;

import java.util.*;

/**
 * Created by Danil-MAC on 12/4/16.
 */
public class InMemoryDAO<T extends Model> implements DAO<T> {

    private Set<T> modelsData = new HashSet<>();


    @Override
    public void add(T model) {
        modelsData.add(model);
    }

    @Override
    public void remove(Model model) {
        try {
            modelsData.remove(model);
        } catch (RuntimeException e){
            e.printStackTrace();
        }
    }

    @Override
    public void removeAll() {
        if(modelsData.isEmpty()){
            throw new RuntimeException(modelsData.getClass().getSimpleName()+" are empty!");
        }
        modelsData.removeAll(modelsData);
    }

    @Override
    public void update(T model, String oldName) {
        boolean needException = true;
        for (T item : modelsData) {
            if (oldName.equalsIgnoreCase(item.getName())) {
                modelsData.remove(model);
                needException = false;
            }
        }
        if (needException) {
            throw new RuntimeException("Not found: " + oldName);
        }
        modelsData.add(model);
    }

    @Override
    public T read(String name) {
        for (T model : modelsData) {
            if (name.equalsIgnoreCase(model.getName())) {
                return model;
            }

        }
        throw new RuntimeException("Not found: " + name);
    }

    @Override
    public Collection<? extends T> readAll() {
        Set<T> modelsDataList = new HashSet<>();
        modelsDataList.addAll(modelsData);
        return modelsDataList;
    }

}
