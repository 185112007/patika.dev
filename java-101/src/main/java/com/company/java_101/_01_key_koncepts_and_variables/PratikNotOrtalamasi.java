package com.company.java_101._01_key_koncepts_and_variables;

import java.util.Scanner;

public class PratikNotOrtalamasi {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int count = 0;
		Course[] courses = new Course[6];
		Course course;

		// get input until Ctrl+Z
		while (scan.hasNext()) {
			course = new Course();
			course.name = scan.next();
			course.score = scan.nextInt();
			courses[count++] = course;
		}

		scan.close();

		double avg = new AvgCalculator().applyFor(new Student(courses));
		String result = avg > 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı";
		System.out.println(result);
	}

}

class Student {
	Course[] courses;

	public Student(Course[] courses) {
		this.courses = courses;
	}
}

class Course {
	String name;
	int score;
}

class AvgCalculator {
	double applyFor(Student student) {
		double average = 0;

		for (int i = 0; i < student.courses.length; i++) {
			average += student.courses[i].score;
		}

		return average / student.courses.length;
	}
}