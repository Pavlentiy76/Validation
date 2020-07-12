package com.pasha;

import com.pasha.exceptions.ValidationFailedException;

public class ValidationSystem<T> {

    private StringValidator sValidator = new StringValidator();
    private IntegerValidator iValidator = new IntegerValidator();

    private Validator validator = sValidator;


    public void validate(T input) throws ValidationFailedException {

        if (!(input instanceof Integer || input instanceof String)){

            throw new ValidationFailedException("Object is not Integer or String");
        }

        validator.validate(input);
    }



}
