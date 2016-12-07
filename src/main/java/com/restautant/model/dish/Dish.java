package com.restautant.model.dish;

import com.restautant.model.ingredient.Ingredient;
import com.restautant.model.Model;

import java.util.Set;

/**
 * Created by Danil-MAC on 12/2/16.
 */
public class Dish extends Model {

    private Set<Ingredient> ingredients;

    public Set<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(Set<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return  super.toString()
                + "Ingredients: " + ingredients.toString()
                + "\n";
    }
}
