package com.foodshop.foodsshop.GlobalExceptionHandler;

public class AlreadyExistsException extends RuntimeException {
    public AlreadyExistsException(String message) {
        super(message);
    }
}
