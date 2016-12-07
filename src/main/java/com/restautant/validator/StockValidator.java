package com.restautant.validator;

import com.restautant.model.stock.Stock;

/**
 * Created by Danil-MAC on 12/7/16.
 */
public class StockValidator extends IModelValidator<Stock> {

    @Override
    public boolean isValid(Stock model) {
        return super.isValid(model)&&model.getAvailableIngredients()!=null;
    }
}
