package com.restautant.model;

import java.util.List;

/**
 * Created by Danil-MAC on 11/30/16.
 */
public class Waiter extends Employee {

    private List<Order> orders;

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

}
