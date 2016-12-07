package com.restautant.service;

import com.restautant.model.ingredient.Ingredient;
import com.restautant.model.stock.Stock;

import java.util.Map;

/**
 * Created by Danil-MAC on 12/7/16.
 */
public class StockService extends IModelService<Stock> {

    private Map<Ingredient, Integer> availableIngredients;

    private void synchronizeIngredients(){
        availableIngredients.putAll(availableModels.iterator().next().getAvailableIngredients());
        availableModels.iterator().next().setAvailableIngredients(availableIngredients);
    }

    public Map<Ingredient, Integer> getAvailableIngredients() {
        return availableIngredients;
    }

    public void setAvailableIngredients(Map<Ingredient, Integer> availableIngredients) {
        this.availableIngredients = availableIngredients;
    }

    public void addIngredient(Ingredient ingredient, int value){
        synchronize();
        synchronizeIngredients();
        availableIngredients.put(ingredient,value);
        synchronize();
    }

    public void removeIngredient(Ingredient ingredient){
        synchronize();
        synchronizeIngredients();
        availableIngredients.remove(ingredient);
        synchronizeIngredients();
    }

    public void updateIngredient(Ingredient ingredient, int value){
        synchronize();
        synchronizeIngredients();
        availableIngredients.put(ingredient,value);
        synchronize();
    }

}
