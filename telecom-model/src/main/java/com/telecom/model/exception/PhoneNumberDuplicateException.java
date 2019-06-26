package com.telecom.model.exception;

public class PhoneNumberDuplicateException extends RuntimeException {
    public PhoneNumberDuplicateException(String message) {
        super(message);
    }
}
