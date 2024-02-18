package com.nisum.demo.exception;

public class ServiceExceptionUnauthorized extends RuntimeException {
    public ServiceExceptionUnauthorized(String msg) {
        super(msg);
    }
}
