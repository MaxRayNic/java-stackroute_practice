package com.stackroute.practice1;

import java.util.Scanner;

public class LastNthCharacters {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int n = sc.nextInt();
		System.out.print(str);
		for (int i = 0; i < n; i++) {
			System.out.print(str.substring(str.length() - n));
		}
		sc.close();

	}
}
