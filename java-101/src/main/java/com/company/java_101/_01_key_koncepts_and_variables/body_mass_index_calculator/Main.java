package com.company.java_101._01_key_koncepts_and_variables.body_mass_index_calculator;

import com.company.java_101._01_key_koncepts_and_variables.contract.AbstractReader;
import com.company.java_101._01_key_koncepts_and_variables.contract.Reader;
import com.company.java_101._01_key_koncepts_and_variables.domain.Body;
import com.company.java_101.infra.util.Printer;

/**
 * @author gafur
 */
public class Main {
    public static void main(String[] args) {
        Reader<Body> reader = new BodyInformationReader();

        Body body = reader.read();
        double bodyMassIndex = new BodyMassIndexCalculator().calculate(body);
        Printer.print("Body Mass Index is " + bodyMassIndex);

        reader.close();
    }
}
