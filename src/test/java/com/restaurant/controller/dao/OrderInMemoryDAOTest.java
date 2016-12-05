package com.restaurant.controller.dao;

import com.restautant.controller.dao.DAO;
import com.restautant.controller.dao.InMemoryDAO;
import com.restautant.model.Dish;
import com.restautant.model.Model;
import com.restautant.model.Order;
import com.restautant.model.Waiter;
import org.junit.Before;
import org.junit.Test;
import sun.util.calendar.*;

import java.sql.Date;


/**
 * Created by Danil-MAC on 12/5/16.
 */
public class OrderInMemoryDAOTest {

    private DAO orderInMemoryDAO;

    @Before
    public void setUp(){
        orderInMemoryDAO = new InMemoryDAO<Order>();
    }

    @Test
    public void create20OrderTest(){
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
            orderInMemoryDAO.create(order);
        }
        System.out.println(orderInMemoryDAO.readAll().toString());
    }
}
