package com.rashiktimalsina.springcrud.exception;

/**
 * @author Rashik Timalsina
 * #created 11/04/2025
 */
public class MethodArgumentNotValidException extends RuntimeException {
    public MethodArgumentNotValidException(String message) {
        super(message);
    }
}
