package com.stackroute.practiceExercise2;

import java.util.regex.Pattern;

public class EvenNum {
	public static boolean isEven(String s1) {

		return Integer.parseInt(s1) % 2 == 0;
	}

	public static void main(String[] args) {
		System.out.println(isEven("24"));
	}

	public static boolean isInteger(String s) {
		// TODO Auto-generated method stub
		if (Pattern.compile("[0-9]+").matcher(s).matches()) {
			return true;
		}
		return false;
	}
}
