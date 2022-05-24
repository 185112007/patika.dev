package com.company.java_101.infra.exeption;

import com.company.java_101.infra.exeption.base.AppException;

public class InvalidParameterException extends AppException {
    public InvalidParameterException(String s) {
        super(s);
    }
}
