package com.restaurant.controller.dao;

import com.restautant.controller.dao.DAO;
import com.restautant.controller.dao.InMemoryDAO;
import com.restautant.model.Dish;
import com.restautant.model.Model;
import org.junit.*;


/**
 * Created by Danil-MAC on 12/5/16.
 */
public class DishInMemoryDAOTest {

    private DAO dishInMemoryDAO;

    @Before
    public void setUp(){
        dishInMemoryDAO = new InMemoryDAO();
    }

    @Before
    public void create20Dishes(){
        for (int i=1; i<=20; i++) {
            Model dish = new Dish();
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
