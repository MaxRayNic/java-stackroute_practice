package com.stackroute.practice1;

import java.util.Scanner;

public class AddNumbers {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		Scanner string = new Scanner(s);
		int sum = 0;
		while (string.hasNextInt()) {
			sum += string.nextInt();
		}
		string.close();
		System.out.println(sum);
		sc.close();

	}
}
