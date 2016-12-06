package com.restautant.validator;

import com.restautant.model.Dish;

/**
 * Created by Danil-MAC on 12/5/16.
 */
public class DishValidator extends ModelValidator<Dish> {



    @Override
    public boolean isValid(Dish dish) {
        if (!dish.getIngredients().isEmpty() && !(dish.getIngredients()==null) && super.isValid(dish)){
            return true;
        }
        return false;
    }

}
