package com.restaurant.validator;

import com.restautant.model.dish.Dish;
import com.restautant.validator.DishValidator;
import com.restautant.validator.Validator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;

/**
 * Created by Danil-MAC on 12/5/16.
 */
public class DishValidatorTest {
    private Validator<Dish> dishValidator;

    @Before
    public void setUp(){
        dishValidator = new DishValidator();
    }

    @Test
    public void setIngredientValidator(){
        Dish dish = new Dish();
        dish.setIngredients(new HashSet<>());
        dish.setName("test");
        boolean answer = dishValidator.isValid(dish);
        Assert.assertEquals(false, answer);
    }
}
