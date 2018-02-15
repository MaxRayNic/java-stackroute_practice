package com.stackroute.practiceExercise2;

public class Member {
	private String name;
	private int age;
	private double salary;

	public Member(String name, int age, double salary) {

		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public String displayMember() {
		return "Members name: " + this.name + "\nMembers Age: " + this.age + "\nMembers Salary: " + this.salary;
	}

}
