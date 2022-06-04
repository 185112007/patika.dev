package com.company.java_101._01_key_koncepts_and_variables.contract;

/**
 * @author gafur
 */
public interface Calculator<T, V> {
    V calculate(T type);
}
