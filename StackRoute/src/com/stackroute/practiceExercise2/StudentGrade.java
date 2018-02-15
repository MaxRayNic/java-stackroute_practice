package com.stackroute.practiceExercise2;

import java.util.regex.Pattern;

public class StudentGrade {

	public int minimum(String[] mark1) {
		int min = Integer.MAX_VALUE;
		for (String string : mark1) {
			min = Math.min(min, Integer.parseInt(string));
		}
		return min;

	}

	public Object maximum(String[] mark1) {

		int max = Integer.MIN_VALUE;
		for (String string : mark1) {
			max = Math.max(max, Integer.parseInt(string));
		}
		return max;
	}

	public boolean isInteger(String str1) {
		if (Pattern.compile("[0-9]+").matcher(str1).matches())
			return true;
		return false;
	}

	public double average(String[] mark1) {
		int sum = 0;
		for (String string : mark1) {
			sum += Integer.parseInt(string);
		}
		return sum / (double) mark1.length;
	}

}
