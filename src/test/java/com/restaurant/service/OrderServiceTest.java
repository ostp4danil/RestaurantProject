package com.restaurant.service;

import com.restautant.controller.dao.DAO;
import com.restautant.controller.dao.InMemoryDAO;
import com.restautant.model.Dish;
import com.restautant.model.Model;
import com.restautant.model.Order;
import com.restautant.model.Waiter;
import com.restautant.service.OrderService;
import com.restautant.service.Service;
import com.restautant.validator.OrderValidator;
import com.restautant.validator.Validator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Danil-MAC on 12/7/16.
 */
public class OrderServiceTest {

    private OrderService orderService;


    @Before
    public void setUp(){
        orderService = new OrderService();
        Validator<Order> orderValidator = new OrderValidator();
        DAO<Order> orderDAO = new InMemoryDAO<>();
        orderService.setDAO(orderDAO);
        orderService.setValidator(orderValidator);
        orderService.setAvailableModels(new HashSet<>());
    }


    public void create10Orders(){
        for(int i=1; i<=10; i++){
            Waiter waiter = new Waiter();
            waiter.setName("Waiter"+i);
            waiter.setID(i);
            Order order = new Order();
            order.setID(i*5);
            order.setName("Client"+i);
            order.setDate(new Date(i*1000,i*10,i));
            order.setWaiter(waiter);
            order.setTableNumber(i);
            System.out.println(waiter);
            System.out.println(order);
            orderService.add(order);
        }
        System.out.println(orderService.getAll());
    }

    @Test
    public void filterByWaiterTest(){
        create10Orders();
        Waiter waiter = new Waiter();
        waiter.setName("Waiter2");
        Set<Order> answer = orderService.filterByWaiter(waiter);
        System.out.println(answer);
    }
}
