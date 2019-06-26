package com.telecom.model.exception;

public class PhoneNumberNotExistException extends RuntimeException {
    public PhoneNumberNotExistException(String message) {
        super(message);
    }
}
