package com.company.java_101.infra.util;

import com.company.java_101.infra.exeption.InvalidParameterException;
import com.company.java_101.infra.exeption.base.AppException;

public class Checks {
    public static void checkParameter(boolean expression, String message){
        if (expression){
            throw new InvalidParameterException(message);
        }
    }
}
