package com.restaurant.service.validator;

import com.restautant.model.Order;
import com.restautant.validator.OrderValidator;
import com.restautant.validator.Validator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.sql.Date;


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
