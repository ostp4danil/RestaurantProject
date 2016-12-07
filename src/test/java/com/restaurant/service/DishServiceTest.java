package com.restaurant.service;

import com.restautant.controller.dao.DAO;
import com.restautant.controller.dao.InMemoryDAO;
import com.restautant.model.Dish;
import com.restautant.model.Ingredient;
import com.restautant.model.Model;
import com.restautant.model.Order;
import com.restautant.service.DishService;
import com.restautant.service.IModelService;
import com.restautant.service.Service;
import com.restautant.service.WaiterService;
import com.restautant.validator.DishValidator;
import com.restautant.validator.IngredientValidator;
import com.restautant.validator.OrderValidator;
import com.restautant.validator.Validator;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DishServiceTest {

    private Service<Dish> dishService;
    private DAO<Dish> dishInMemoryDAO;


    public void setUp(){
        dishService = new DishService();
        dishInMemoryDAO = new InMemoryDAO<Dish>();
        dishService.setDAO(dishInMemoryDAO);
        Validator<Dish> dishValidator = new DishValidator();
        dishService.setValidator(dishValidator);
        dishService.setAvailableModels(new HashSet<>());
    }

    public void createAndAdd10Dishes(){
        for (int i=1; i<=10; i++) {
            Ingredient ingredient = new Ingredient();
            ingredient.setName("Ingredient"+i);
            ingredient.setID(i*12);
            List<Ingredient> ingredients = new ArrayList<>();
            ingredients.add(ingredient);
            Dish dish = new Dish();
            dish.setName("Dish" + i);
            dish.setID(hashCode());
            dish.setIngredients(ingredients);
            dishService.add(dish);
        }
    }

    @Test
    public void testModelService(){
        setUp();
        createAndAdd10Dishes();
        System.out.println(dishInMemoryDAO.readAll());
        dishService.setDAO(dishInMemoryDAO);
        dishService.setValidator(new IngredientValidator());
        dishService.setAvailableModels((Set) dishInMemoryDAO.readAll());
        dishService.synchronize();
        Dish dish = new Dish();
        dish.setID(1);
        dish.setIngredients(new ArrayList<>());
        dish.setName("123");
        dishService.add(dish);
        dishService.remove(dishInMemoryDAO.read("Dish5"));
        dishService.synchronize();
        System.out.println(dishService.getAll().toString());
    }
}
