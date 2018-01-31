package com.epam.exceptions;

public class NotBookException extends Exception {
    public NotBookException() {
    }

    public NotBookException(String message) {
        super(message);
    }

    public NotBookException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotBookException(Throwable cause) {
        super(cause);
    }
}
