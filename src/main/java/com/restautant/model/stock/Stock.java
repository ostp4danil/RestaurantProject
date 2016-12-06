package com.restautant.model.stock;

import com.restautant.model.Ingredient;

import javax.persistence.*;
import java.util.Map;

/**
 * Created by Danil-MAC on 11/30/16.
 */
public class Stock {

    private Map<Ingredient, Integer> availableIngredients;


    public Map<Ingredient, Integer> getAvailableIngredients() {
        return availableIngredients;
    }

    public void setAvailableIngredients(Map<Ingredient, Integer> availableIngredients) {
        this.availableIngredients = availableIngredients;
    }
}
