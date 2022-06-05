package com.company.java_101._01_key_koncepts_and_variables.circle_area;

import com.company.java_101._01_key_koncepts_and_variables.contract.AbstractReader;
import com.company.java_101._01_key_koncepts_and_variables.domain.Circle;

/**
 * @author gafur
 */
public class CircleInformationReader extends AbstractReader<Circle> {

    public Circle read() {
        Circle circle = new Circle();
        boolean TF = true;
        while (TF){
            System.out.print("Enter radius: ");
            circle.setRadius(scanner.nextDouble());
            if (circle.getRadius()<0){
                System.out.println("Radius should be greater or equal to 0:");
                continue;
            }
            System.out.print("Enter angle: ");
            circle.setAngle(scanner.nextDouble());
            if (circle.getAngle()<0){
                System.out.println("Angle should be greater or equal to 0:");
                System.out.println("Please re-enter...");
                continue;
            }
            TF = false;
        }
        return circle;
    }
}
