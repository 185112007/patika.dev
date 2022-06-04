package com.company.java_101._01_key_koncepts_and_variables.body_mass_index_calculator;

import com.company.java_101._01_key_koncepts_and_variables.domain.Body;
import com.company.java_101.infra.util.Printer;

/**
 * @author gafur
 */
public class Main {
    public static void main(String[] args) {
        Body body = new BodyInformationReader().read();
        double bodyMassIndex = new BodyMassIndexCalculator().calculate(body);
        Printer.print("Body Mass Index is " + bodyMassIndex);
    }
}
