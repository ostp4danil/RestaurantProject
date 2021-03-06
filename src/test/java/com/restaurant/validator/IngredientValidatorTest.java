package com.restaurant.validator;

import com.restautant.model.ingredient.Ingredient;
import com.restautant.validator.IngredientValidator;
import com.restautant.validator.Validator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Danil-MAC on 12/5/16.
 */
public class IngredientValidatorTest {

    private Validator<Ingredient> ingredientValidator;

    @Before
    public void setUp(){
        ingredientValidator = new IngredientValidator<>();
    }

    @Test
    public void setIngredientValidator(){
        boolean answer = ingredientValidator.isValid(new Ingredient());
        Assert.assertEquals(false, answer);
    }

}
