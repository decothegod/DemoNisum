package com.nisum.demo.exception;

public class ServiceExceptionBadRequest extends RuntimeException {
    public ServiceExceptionBadRequest(String msg) {
        super(msg);
    }
}
