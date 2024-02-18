package com.nisum.demo.exception;

public class ServiceExceptionNotFound extends RuntimeException {
    public ServiceExceptionNotFound(String msg) {
        super(msg);
    }
}
