package com.restautant.model;


import sun.util.calendar.BaseCalendar.Date;

import javax.persistence.*;

/**
 * Created by Danil-MAC on 11/28/16.
 */
public class Order {

    private Date date;

    private Waiter waiter;

    private int tableNumber;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Waiter getWaiter() {
        return waiter;
    }

    public void setWaiter(Waiter waiter) {
        this.waiter = waiter;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

}
