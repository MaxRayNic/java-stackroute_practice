package com.stackroute.practiceExercise3;

import java.util.Scanner;

public class StudentMarks {
	int numberOfStudents;
	int grades[];

	public StudentMarks(int numberOfStudents) {
		super();
		this.numberOfStudents = numberOfStudents;
		grades = new int[numberOfStudents];

	}

	public int[] getGrades() {
		return grades;
	}

	public void setGrades(int[] grades) {
		this.grades = grades;
	}

	public void checkGrades() {
		for (int i = 0; i < grades.length; i++) {
			if (grades[i] > 100 || grades[i] < 0)

				throw new RuntimeException("Value is out of Range");
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter the number of students");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		StudentMarks studentMarks = new StudentMarks(input);
		int[] array = new int[input];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		studentMarks.setGrades(array);
		studentMarks.checkGrades();
		sc.close();
	}

}
