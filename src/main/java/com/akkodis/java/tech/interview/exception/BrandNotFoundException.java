package com.akkodis.java.tech.interview.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class BrandNotFoundException extends RuntimeException {

    public BrandNotFoundException() {
        super();
    }
    public BrandNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
    public BrandNotFoundException(String message) {
        super(message);
    }
    public BrandNotFoundException(Throwable cause) {
        super(cause);
    }
}
