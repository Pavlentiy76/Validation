package com.company;

public class ValidationSystem<T> {

    private StringValidator sValidator = new StringValidator();
    private IntegerValidator iValidator = new IntegerValidator();

    public Validator validate(T input) {
        sValidator.validate(input);
        iValidator.validate(input);
        return null;
    }

}
