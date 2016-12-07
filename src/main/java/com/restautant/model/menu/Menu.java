package com.restautant.model.menu;

import com.restautant.model.Model;
import com.restautant.model.dish.Dish;

import java.util.Set;

/**
 * Created by Danil-MAC on 12/2/16.
 */
public class Menu extends Model {

    private Set<Dish> dishes;

    public Set<Dish> getDishes() {
        return dishes;
    }

    public void setDishes(Set<Dish> dishes) {
        this.dishes = dishes;
    }

    @Override
    public String toString() {
        return super.toString()
                + dishes.toString()
                + "\n";
    }
}
