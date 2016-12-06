package com.restaurant.service;

import com.restautant.controller.dao.DAO;
import com.restautant.controller.dao.InMemoryDAO;
import com.restautant.model.Dish;
import com.restautant.model.Model;
import com.restautant.service.ModelService;
import com.restautant.service.Service;
import com.restautant.service.WaiterService;
import com.restautant.validator.IngredientValidator;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Set;

public class ModelServiceTest {

    private Service dishService;
    private DAO dishInMemoryDAO;


    public void setUp(){
        dishService = new ModelService<Dish>();
        dishInMemoryDAO = new InMemoryDAO<Dish>();
    }

    public void createAndAdd10Dishes(){
        for (int i=1; i<=10; i++) {
            Model dish = new Dish();
            dish.setName("Dish" + i);
            dish.setID(hashCode());
            dishInMemoryDAO.add(dish);
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
        WaiterService waiterService = new WaiterService();
        waiterService.sorty();
    }
}
