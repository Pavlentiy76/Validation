package com.company;

import exceptions.ValidationFailedException;

public interface Validator<T> {

    void validate(T input)throws ValidationFailedException;
}
