package com.restautant.service;

import com.restautant.model.Order;
import com.restautant.model.Waiter;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Danil-MAC on 12/6/16.
 */
public class OrderService extends IModelService<Order> {

    public Set<Order> filterByWaiter(Waiter searchingWaiter) {
        Set<Order> orders = new HashSet<>();
        synchronize();
        for(Order order: availableModels){
            Waiter waiter = order.getWaiter();
            if(waiter.equals(searchingWaiter)){
                orders.add(order);
            }
        }
        return orders;
    }

    public Set<Order> filterByDate(Date searchingDate) {
        Set<Order> orders = new HashSet<>();
        synchronize();
        for(Order order: availableModels){
            if(order.getDate().equals(searchingDate)){
                orders.add(order);
            }
        }
        return orders;
    }

    public Set<Order> filterByTableNumber(int searchingTableNumber) {
        Set<Order> orders = new HashSet<>();
        synchronize();
        for(Order order: availableModels){
            if(order.getTableNumber()==searchingTableNumber){
                orders.add(order);
            }
        }
        return orders;
    }

}