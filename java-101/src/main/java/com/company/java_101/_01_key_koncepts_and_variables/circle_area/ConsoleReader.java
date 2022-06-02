package com.company.java_101._01_key_koncepts_and_variables.circle_area;

import java.util.Scanner;

/**
 * @author gafur
 */
public class ConsoleReader {

    private final Scanner scanner;
    private UserInput input;

    public ConsoleReader() {
        scanner = new Scanner(System.in);
        input = new UserInput();
    }

    public UserInput read() {
        boolean TF = true;
        while (TF){
            System.out.print("Enter radius:");
            input.setRadius(scanner.nextDouble());
            if (input.getRadius()<0){
                System.out.println("Radius should be greater or equal to 0:");
                continue;
            }
            System.out.print("Enter angle:");
            input.setAngle(scanner.nextDouble());
            if (input.getAngle()<0){
                System.out.println("Angle should be greater or equal to 0:");
                System.out.println("Please re-enter...");
                continue;
            }
            TF = false;
        }
        return input;
    }
}
