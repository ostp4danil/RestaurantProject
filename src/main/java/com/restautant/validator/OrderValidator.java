package com.restautant.validator;

import com.restautant.model.Order;

/**
 * Created by Danil-MAC on 12/5/16.
 */
public class OrderValidator extends ModelValidator<Order>{

    @Override
    public boolean isValid(Order order) {
        if((order.getTableNumber()>=0)
                && (order.getDate()!=null)
                && super.isValid(order)
                && order.getWaiter()!=null){
            return true;
        }
        return false;
    }
}
