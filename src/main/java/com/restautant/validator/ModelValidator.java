package com.restautant.validator;

import com.restautant.model.Model;
import org.apache.commons.lang3.StringUtils;

/**
 * Created by Danil-MAC on 12/5/16.
 */
public abstract class ModelValidator<T extends Model> implements Validator<T> {

    public boolean isValid(T model) {
        if (!StringUtils.isNotBlank(model.getName())) {
            return false;
        }
        return true;
    }
}
