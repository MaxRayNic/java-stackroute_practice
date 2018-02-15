package com.stackroute.practice1;

import java.util.Scanner;

public class TomAndJerry {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		if (input > 20 && input < 30) {
			String string = (input % 2 == 0) ? "Jerry" : "Tom";
			System.out.println(string);
		}
		sc.close();
	}
}
