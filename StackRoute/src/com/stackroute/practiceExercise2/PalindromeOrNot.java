package com.stackroute.practiceExercise2;

import java.util.Scanner;

public class PalindromeOrNot {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String reverseStr = reverse(str);
		System.out.println("Reverse string is: " + reverseStr);
		System.out.print("The given input is");
		if (isPalindromeCheck(str)) {
			System.out.println(" Palindrome");
		} else {
			System.out.println(" Not Palindrome");
		}
		sc.close();
	}

	public static boolean isPalindromeCheck(String str1) {

		String reverseStr = reverse(str1);
		return str1.equals(reverseStr);
	}

	public static String reverse(String str) {
		String s = "";
		for (int i = 0; i < str.length(); i++) {
			s = str.substring(i, i + 1) + s;
		}
		return s;
	}

}
