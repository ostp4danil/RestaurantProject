package com.restautant.service;

import com.restautant.model.Order;
import com.restautant.model.Waiter;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Danil-MAC on 12/6/16.
 */
public class OrderService extends IModelService<Order> {

    public Set<Order> filterByWaiter(Waiter searchingWaiter) {
        Set<Order> waiters = new HashSet<>();
        synchronize();
        for(Order order: availableModels){
            Waiter waiter = order.getWaiter();
            if(waiter.equals(searchingWaiter)){
                waiters.add(order);
            }
        }
        return waiters;
    }
}