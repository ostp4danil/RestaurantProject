package com.restaurant.controller.dao;

import com.restautant.controller.dao.InMemoryRestaurantDAO;
import com.restautant.model.Dish;
import com.restautant.model.RestaurantModel;
import com.sun.deploy.security.ruleset.RuleParseException;
import com.sun.tools.internal.ws.wsdl.document.jaxws.Exception;
import com.sun.tools.javah.Util;
import org.junit.*;
import org.junit.rules.ExpectedException;


/**
 * Created by Danil-MAC on 12/5/16.
 */
public class DishInMemoryDAOTest {

    private  InMemoryRestaurantDAO<Dish> dishInMemoryDAO;

    @Before
    public void setUp(){
        dishInMemoryDAO = new InMemoryRestaurantDAO();
    }

    @Before
    public void create20Dishes(){
        for (int i=1; i<=20; i++) {
            RestaurantModel dish = new Dish();
            dish.setName("Dish" + i);
            dish.setID(hashCode());
            dishInMemoryDAO.create(dish);
        }
    }


    @Test
    public void printAllTest(){
        System.out.println(dishInMemoryDAO.readAll().toString());
        Assert.assertNotEquals(dishInMemoryDAO.readAll().toString(),"[]");
    }

    @Test
    public void printAllTest_WhenEmptyListPrintBraces(){
        dishInMemoryDAO.removeAll();
        Assert.assertEquals(dishInMemoryDAO.readAll().toString(),"[]");
    }

    @Test(expected = RuntimeException.class)
    public void removeAll_WhenEmptyListThenNullPointerException(){
        dishInMemoryDAO.removeAll();
        dishInMemoryDAO.removeAll();
    }



}
