package com.restaurant.dao;

import com.restautant.dao.DAO;
import com.restautant.dao.InMemoryDAO;
import com.restautant.model.Dish;
import com.restautant.model.Model;
import com.restautant.model.Order;
import com.restautant.model.Waiter;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.sql.Date;


/**
 * Created by Danil-MAC on 12/5/16.
 */
public class InMemoryDAOTest {

    private DAO orderInMemoryDAO;
    private DAO dishInMemoryDAO;


    @Before
    public void setUp(){
        dishInMemoryDAO = new InMemoryDAO<Dish>();
        orderInMemoryDAO = new InMemoryDAO<Order>();
    }

    @Before
    public void createAndAdd20Dishes(){
        for (int i=1; i<=20; i++) {
            Model dish = new Dish();
            dish.setName("Dish" + i);
            dish.setID(hashCode());
            dishInMemoryDAO.add(dish);
        }
        Assert.assertEquals(20,dishInMemoryDAO.readAll().size());
    }

    @Test
    public void createAndAdd20OrderTest(){
        for(int i =1; i<=20; i++){
            Order order = new Order();
            Waiter waiter = new Waiter();
            waiter.setID(hashCode());
            waiter.setName("Waiter: "+i);
            order.setID(hashCode());
            order.setName("Order:"+i);
            order.setWaiter(waiter);
            order.setDate(new Date(3,4,2106));
            order.setTableNumber(i);
            order.setName("Client: "+i);
            orderInMemoryDAO.add(order);
        }
        Assert.assertEquals(20,orderInMemoryDAO.readAll().size());
    }

    @Test
    public void printAllDishTest(){
        System.out.println(dishInMemoryDAO.readAll().toString());
    }

    @Test
    public void printAllDishTest_WhenEmptyListPrintBraces(){
        dishInMemoryDAO.removeAll();
        Assert.assertEquals(dishInMemoryDAO.readAll().toString(),"[]");
    }

    @Test
    public void printAllOrderTest(){
        System.out.println(orderInMemoryDAO.readAll().toString());
    }


    @Test(expected = RuntimeException.class)
    public void removeAll_WhenEmptyListThenNullPointerException(){
        dishInMemoryDAO.removeAll();
        dishInMemoryDAO.removeAll();
    }
}
