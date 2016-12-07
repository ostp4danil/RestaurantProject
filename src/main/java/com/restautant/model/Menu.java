package com.restautant.model;

import java.util.List;
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
