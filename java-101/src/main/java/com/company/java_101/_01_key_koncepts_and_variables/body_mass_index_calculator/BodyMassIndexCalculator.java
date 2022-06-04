package com.company.java_101._01_key_koncepts_and_variables.body_mass_index_calculator;

import com.company.java_101._01_key_koncepts_and_variables.contract.Calculator;
import com.company.java_101._01_key_koncepts_and_variables.domain.Body;

/**
 * @author gafur
 */
public class BodyMassIndexCalculator implements Calculator<Body, Double> {
    @Override
    public Double calculate(Body body) {
        return body.getWeight() / (body.getHeight() * body.getHeight());
    }
}
