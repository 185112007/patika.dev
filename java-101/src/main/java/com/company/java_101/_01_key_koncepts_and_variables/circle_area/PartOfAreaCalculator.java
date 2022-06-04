package com.company.java_101._01_key_koncepts_and_variables.circle_area;

import com.company.java_101._01_key_koncepts_and_variables.contract.Calculator;
import com.company.java_101._01_key_koncepts_and_variables.domain.Circle;

/**
 * @author gafur
 */
public class PartOfAreaCalculator implements Calculator<Circle, Double> {
    public Double calculate(Circle input){
        return Math.PI * input.getRadius() * input.getRadius() * input.getAngle() / 360;
    }
}
