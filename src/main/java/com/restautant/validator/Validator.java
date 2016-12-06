package com.restautant.validator;

/**
 * Created by Danil-MAC on 12/5/16.
 */
public interface Validator<T> {

    boolean isValid(T object);
}
