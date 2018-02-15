package com.stackroute.practice1;

import java.util.Scanner;

public class CharacterDecision {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		if (Character.isAlphabetic(ch)) {
			if (Character.isUpperCase(ch)) {
				System.out.println("Capital Letter");

			} else
				System.out.println("Small Case Letter");
		} else if (Character.isDigit(ch)) {
			System.out.println("Digit");
		} else
			System.out.println("Special Characters");
		sc.close();

	}
}
