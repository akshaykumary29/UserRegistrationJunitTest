package com.bridgelabz.userregistrationjunit;

import com.sun.xml.internal.ws.api.model.ExceptionType;

public class UserRegistrationException extends Exception {
    String message;
    static ExceptionType type;

    enum ExceptionType {
        NULL, EMPTY;
    }

    public UserRegistrationException(ExceptionType type, String message) {
        this.type = type;
        this.message = message;
    }

    @Override
    public String toString() {
        return "UserRegistrationException{" +
                "message='" + message + '\'' +
                '}';
    }
}
