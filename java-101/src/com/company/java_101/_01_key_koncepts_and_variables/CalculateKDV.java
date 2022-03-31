package com.company.java_101._01_key_koncepts_and_variables;

import java.util.Scanner;
import java.util.function.Predicate;

public class CalculateKDV {
	
	public static void main(String[] args) {
		CalculateKDV calculator = new CalculateKDV();
		
		Scanner scan = new Scanner(System.in);
		double input = scan.nextDouble();
		scan.close();
		
		calculator.calculate(input);
	}

	public void calculate(double input) {
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
		
		System.out.println("KDV'siz fiyat: " + input);
		System.out.println("KDV'li fiyat: " + (input+input*kdv/100));
		System.out.println("KDV tutari: " + kdv);
	}
	
	public void print() {
		
	}
}
