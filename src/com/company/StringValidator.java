package com.company;

import exceptions.ValidationFailedException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringValidator implements Validator {

    @Override
    public void validate(Object input) throws ValidationFailedException {
        if (input instanceof String){
            Pattern pattern = Pattern.compile("^[A-Z]");
            Matcher matcher = pattern.matcher((String) input);
            if (matcher.find()){
                System.out.println("Object " + input + " is validate");
            }else throw new ValidationFailedException("The first letter is not uppercase");
        }

    }
}
