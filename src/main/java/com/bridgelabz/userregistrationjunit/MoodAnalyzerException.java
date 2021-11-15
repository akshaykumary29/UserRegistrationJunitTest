package com.bridgelabz.userregistrationjunit;

import com.sun.xml.internal.ws.api.model.ExceptionType;

public class MoodAnalyzerException extends Exception {
    public String message;
    static ExceptionType type;

    enum ExceptionType {
        NULL, EMPTY;
    }

    public MoodAnalyzerException(ExceptionType type, String message) {
        this.message = message;
        this.type = type;
    }
}
