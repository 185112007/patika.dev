package com.company.java_101._01_key_koncepts_and_variables.body_mass_index_calculator;

import com.company.java_101._01_key_koncepts_and_variables.contract.AbstractReader;
import com.company.java_101._01_key_koncepts_and_variables.domain.Body;

/**
 * @author gafur
 */
public class BodyInformationReader extends AbstractReader<Body> {
    @Override
    public Body read() {
        Body body = new Body();

        boolean TF = true;
        while (TF){
            System.out.print("Enter height: ");
            body.setHeight(scanner.nextDouble());
            if (body.getHeight()<= 0){
                System.out.println("Height must be greater than 0 m:");
                continue;
            }
            System.out.print("Enter weight: ");
            body.setWeight(scanner.nextDouble());
            if (body.getWeight()<= 0){
                System.out.println("Weight must be greater than 0 m:");
                System.out.println("Please re-enter...");
                continue;
            }
            TF = false;
        }
        return body;
    }
}
