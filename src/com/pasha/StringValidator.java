package com.pasha;

import com.pasha.exceptions.ValidationFailedException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringValidator implements Validator<String> {

    @Override
    public void validate(String input) throws ValidationFailedException {

            Pattern pattern = Pattern.compile("^[A-Z]");
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()){
                System.out.println("Object " + input + " is validate");
            }else throw new ValidationFailedException("The first letter is not uppercase");

    }
}
