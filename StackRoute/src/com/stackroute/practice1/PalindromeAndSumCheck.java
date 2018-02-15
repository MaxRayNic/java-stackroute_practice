package com.stackroute.practice1;

import java.util.Scanner;

public class PalindromeAndSumCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		if (isPalindrome(input)) {

			System.out
					.println(input + " is Palindrome and sum of even numbers is " + isSumGreaterThan25(input) + " 25");

		} else
			System.out.println(input + " is not Palindrome");
		sc.close();
	}

	private static boolean isPalindrome(String input) {

		StringBuilder str = new StringBuilder(input);
		if (input.equals(new String(str.reverse()))) {
			return true;
		}
		return false;
	}

	private static String isSumGreaterThan25(String input) {
		int sum = 0;
		for (int i = 0; i < input.length(); i += 2) {
			sum += Integer.parseInt(input.substring(i, i + 1));
		}
		if (sum > 25)
			return "greater than";
		else if (sum == 25)
			return "equal to";
		return "less than";
	}

}
