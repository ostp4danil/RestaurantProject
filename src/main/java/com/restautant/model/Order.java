package com.restautant.model;


import javax.persistence.*;
import java.sql.Date;

/**
 * Created by Danil-MAC on 11/28/16.
 */
public class Order extends Model {

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

    @Override
    public String toString() {
        return super.toString() + date +
                ", waiter=" + waiter +
                ", tableNumber=" + tableNumber + '\'' +
                '\n';
    }
}
