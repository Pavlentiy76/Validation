package com.company;

import exceptions.ValidationFailedException;

public class IntegerValidator implements Validator {

    @Override
    public void validate(Object input) throws ValidationFailedException {
        if (input instanceof Integer){
            if ((Integer)input >= 1 && (Integer)input <= 10){
                System.out.println("Object " + input + " is validate");
            }else throw new ValidationFailedException("The number doesn't belong to the interval [1...10]");
        }
    }
}
