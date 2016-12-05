package com.restaurant.service.validator;

import com.restautant.controller.dao.DAO;
import com.restautant.model.Dish;
import com.restautant.model.Order;
import com.restautant.model.Waiter;
import com.restautant.service.validator.DishValidator;
import com.restautant.service.validator.OrderValidator;
import com.restautant.service.validator.Validator;
import com.restautant.service.validator.WaiterValidator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Danil-MAC on 12/5/16.
 */
public class OrderValidatorTest {

    private Validator<Order> orderValidator;

    @Before
    public void setUp(){
        orderValidator = new OrderValidator();
    }

    @Test
    public void setOrderValidator(){
        Order order = new Order();
        order.setDate(new Date(2,3,4));
        order.setName("kiril");
        order.setID(hashCode());
        order.setTableNumber(5);
        boolean answer = orderValidator.isValid(order);
        Assert.assertEquals(false, answer);
    }
}
