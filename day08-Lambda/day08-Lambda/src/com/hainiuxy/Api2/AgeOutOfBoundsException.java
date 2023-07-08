package com.hainiuxy.Api2;

public class AgeOutOfBoundsException extends RuntimeException {


    public AgeOutOfBoundsException() {
    }
    // String message 异常的信息
    public AgeOutOfBoundsException(String message) {
        super(message);
    }
}