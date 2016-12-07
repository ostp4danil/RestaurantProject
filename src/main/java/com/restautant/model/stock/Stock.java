package com.restautant.model.stock;

import com.restautant.model.Ingredient;
import com.restautant.model.Model;

import javax.persistence.*;
import java.util.Map;

/**
 * Created by Danil-MAC on 11/30/16.
 */
public class Stock extends Model{

    private Map<Ingredient, Integer> availableIngredients;

    public Stock() {
        super.setID(1);
        super.setName("Stock");
    }

    public Map<Ingredient, Integer> getAvailableIngredients() {
        return availableIngredients;
    }

    public void setAvailableIngredients(Map<Ingredient, Integer> availableIngredients) {
        this.availableIngredients = availableIngredients;
    }
}
