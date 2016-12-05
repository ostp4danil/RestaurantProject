package com.restaurant.service.validator;

import com.restautant.model.Ingredient;
import com.restautant.model.Model;
import com.restautant.service.validator.IngredientValidator;
import com.restautant.service.validator.ModelValidator;
import com.restautant.service.validator.Validator;
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
