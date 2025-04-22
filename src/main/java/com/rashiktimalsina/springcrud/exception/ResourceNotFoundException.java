package com.rashiktimalsina.springcrud.exception;

/**
 * @author Rashik Timalsina
 * #created 13/04/2025
 */

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String message) {
        super(message);
    }
}
