package com.restautant.model;

import java.util.List;

/**
 * Created by Danil-MAC on 12/2/16.
 */
public class Menu extends RestaurantModel{

    private List<Dish> dishes;

    public List<Dish> getDishes() {
        return dishes;
    }

    public void setDishes(List<Dish> dishes) {
        this.dishes = dishes;
    }


}
