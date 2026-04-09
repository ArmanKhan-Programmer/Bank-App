package util;

import exception.ValidationException;

public interface Validation<T> {
    void validate(T value) throws ValidationException;
}
