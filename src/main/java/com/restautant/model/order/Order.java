package com.restautant.model.order;


import com.restautant.model.Model;
import com.restautant.model.employee.Waiter;

import java.sql.Date;

/**
 * Created by Danil-MAC on 11/28/16.
 */
public class Order extends Model {

    private Date date;

    private Waiter waiter;

    private Integer tableNumber;

    private boolean isCompleted ;

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

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

    public Integer getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    @Override
    public String toString() {
        return super.toString() + ", date=" + date +
                waiter +
                ", tableNumber=" + tableNumber + "\n";
    }


}
