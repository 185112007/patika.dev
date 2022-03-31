package com.company.java_101._01_key_koncepts_and_variables;

import java.util.Scanner;
import java.util.function.Predicate;

public class CalculateKDV {
	
	
	public static void main(String[] args) {
		CalculateKDV calculator = new CalculateKDV();
		
		Scanner scan = new Scanner(System.in);
		double input = scan.nextDouble();
		scan.close();
		
		int kdv = calculator.calculate(input);
		System.out.println(kdv);
	}

	public int calculate(double input) {
		Predicate<Double> graterThanZeroAndLessThanThousand = x -> x>0 && x<1000;
		Predicate<Double> graterThanThousand = x -> x>1000;
		
		int kdv = 0;
		
		if(graterThanZeroAndLessThanThousand.test(input)) {
			kdv = 18;
		}else if(graterThanThousand.test(input)) {
			kdv = 8;
		}else {
			System.out.println("invalid input");
		}
		return kdv;
	}
}
