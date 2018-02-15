package com.stackroute.practice1;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class VowelAndConsonant {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		Set<Character> vowel = new LinkedHashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (Character.isAlphabetic(ch[i])) {

				if (vowel.contains(ch[i])) {
					System.out.print("Vowel ");
				} else {
					System.out.print("Consonant ");
				}
			} else {
				System.out.print("Error:Not a Letter ");
			}
		}
		sc.close();
	}
}
