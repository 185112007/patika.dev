package com.company.java_101._01_key_koncepts_and_variables;

import com.company.java_101.infra.util.Checks;

import java.util.Scanner;

public class HypotenuseCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();

        double c = new HypotenuseCalculator().calculate(a, b);

        System.out.println(c);
    }

    public double calculate(int a, int b) {
        Checks.checkParameter(a<0, "a less than zero");
        Checks.checkParameter(b<0, "b less than zero");

        return Math.sqrt(a*a + b*b);
    }
}
