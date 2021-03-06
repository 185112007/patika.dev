package com.company.java_101._01_key_koncepts_and_variables.circle_area;

import com.company.java_101._01_key_koncepts_and_variables.contract.Calculator;
import com.company.java_101._01_key_koncepts_and_variables.contract.Reader;
import com.company.java_101._01_key_koncepts_and_variables.domain.Circle;
import com.company.java_101.infra.util.Printer;

/**
 * @author gafur
 */
public class Main {
    public static void main(String[] args) {
        Reader<Circle> reader = new CircleInformationReader();

        Circle input = reader.read();
        Calculator<Circle, Double> calculator = new PartOfAreaCalculator();
        double partOfArea = calculator.calculate(input);
        Printer.print("Area is " + partOfArea);

        reader.close();
    }
}
