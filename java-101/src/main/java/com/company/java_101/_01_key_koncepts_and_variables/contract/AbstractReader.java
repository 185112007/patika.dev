package com.company.java_101._01_key_koncepts_and_variables.contract;

import com.company.java_101._01_key_koncepts_and_variables.domain.Circle;

import java.util.Scanner;

/**
 * @author gafur
 */
public abstract class AbstractReader<T> implements Reader{
    protected final Scanner scanner;

    public AbstractReader() {
        scanner = new Scanner(System.in);
    }

    @Override
    public void close() {
        scanner.close();
    }
}
