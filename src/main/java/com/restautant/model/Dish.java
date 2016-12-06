package com.restautant.model;

import java.util.List;

/**
 * Created by Danil-MAC on 12/2/16.
 */
public class Dish extends Model {

    private List<Ingredient> ingredients;

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return "Ingredients: "
                + super.toString() + "\n";
    }
}
