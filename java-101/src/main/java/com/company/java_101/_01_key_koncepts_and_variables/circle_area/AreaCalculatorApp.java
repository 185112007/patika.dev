package com.company.java_101._01_key_koncepts_and_variables.circle_area;

/**
 * @author gafur
 */
public class AreaCalculatorApp {
    public static void main(String[] args) {
        UserInput input = new ConsoleReader().read();
        double partOfArea = new PartOfAreaCalculator().calculate(input);
        new Printer().print("Area is", partOfArea);
    }
}
