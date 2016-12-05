package com.restautant.controller.dao;

import com.restautant.model.Model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Danil-MAC on 12/4/16.
 */
public class InMemoryDAO<T extends Model> implements DAO {

    private Set<Model> modelsData = new HashSet<Model>();


    @Override
    public void create(Model model) {
        modelsData.add(model);
    }

    @Override
    public void remove(Model model) {
        modelsData.remove(model);
    }

    @Override
    public void removeAll() {
        if(modelsData.isEmpty()){
            throw new RuntimeException(modelsData.getClass().getSimpleName()+" are empty!");
        }
        modelsData.removeAll(modelsData);
    }

    @Override
    public void update(Model model, String oldName) {
        boolean needException = true;
        for (Model item : modelsData) {
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
    public Model read(String name) {
        for (Model model : modelsData) {
            if (name.equalsIgnoreCase(model.getName())) {
                return model;
            }

        }
        throw new RuntimeException("Not found: " + name);
    }

    @Override
    public List<? extends Model> readAll() {
        List<Model> modelsDataList = new ArrayList<Model>();
        modelsDataList.addAll(modelsData);
        return modelsDataList;
    }

}
