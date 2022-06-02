package com.company.java_101._01_key_koncepts_and_variables.circle_area;

/**
 * @author gafur
 */
public class PartOfAreaCalculator {
    public double calculate(UserInput input){
        return Math.PI * input.getRadius() * input.getRadius() * input.getAngle() / 360;
    }
}
