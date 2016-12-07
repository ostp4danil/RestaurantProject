package com.restaurant.service;

import com.restautant.dao.DAO;
import com.restautant.dao.InMemoryDAO;
import com.restautant.model.ingredient.Ingredient;
import com.restautant.model.stock.Stock;
import com.restautant.service.StockService;
import com.restautant.validator.StockValidator;
import com.restautant.validator.Validator;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * Created by Danil-MAC on 12/7/16.
 */
public class StockServiceTest {
    private StockService stockService;

    @Before
    public void setUp(){
        DAO<Stock> stockDAO = new InMemoryDAO<>();
        stockService = new StockService();
        Validator<Stock> stockValidator = new StockValidator();
        stockService.setValidator(stockValidator);
        stockService.setAvailableModels(new HashSet<>());
        stockService.setDAO(stockDAO);
        stockService.setAvailableIngredients(new HashMap<>());
    }

    @Test
    public void addIngredientTest(){
        Stock stock = new Stock();
        Map<Ingredient,Integer> availableIngredients = new HashMap(){};
        for(int i=1; i<=5; i++){
                Ingredient ingredient = new Ingredient();
                ingredient.setID(i);
                ingredient.setName("Ing:"+i);
                availableIngredients.put(ingredient,i);
            }
        stock.setAvailableIngredients(availableIngredients);
        stockService.add(stock);
        System.out.println(stockService.getAvailableModels());
        Ingredient ingredient = new Ingredient();
        ingredient.setID(3);
        ingredient.setName("Ing:3");
        stockService.removeIngredient(ingredient);
        System.out.println(stockService.getAvailableModels());
        System.out.println(stockService.getDAO().readAll());

    }
}
