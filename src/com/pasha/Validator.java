package com.pasha;

import com.pasha.exceptions.ValidationFailedException;

public interface Validator<T> {

    void validate(T input)throws ValidationFailedException;
}
