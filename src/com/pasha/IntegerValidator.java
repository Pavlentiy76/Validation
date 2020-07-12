package com.pasha;

import com.pasha.exceptions.ValidationFailedException;

public class IntegerValidator implements Validator<Integer> {

    @Override
    public void validate(Integer input) throws ValidationFailedException {

            if (input >= 1 && input <= 10){
                System.out.println("Object " + input + " is validate");
            }else throw new ValidationFailedException("The number doesn't belong to the interval [1...10]");

    }
}
