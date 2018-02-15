package com.stackroute.practiceExercise2;

import java.util.regex.Pattern;

public class LongFactorial {
	public String factorial(String x) {

		if (Pattern.compile("[0-9]+").matcher(x).matches()) {

			if (Long.parseLong(x) == 0) {
				return "1";
			}
			long fact = 1;
			for (int i = 1; i <= Long.parseLong(x); i++) {
				long temp = fact;
				fact *= i;
				if (temp > fact) {
					return "Out of Range";
				}

			}

			return fact + "";

		} else if (Pattern.compile("[0-9]+" + "." + "[0-9]").matcher(x).matches()) {
			return "Invalid Input:No Fractions Allowed";
		} else
			return "Invalid Input:Enter Numbers Only";

	}
}
