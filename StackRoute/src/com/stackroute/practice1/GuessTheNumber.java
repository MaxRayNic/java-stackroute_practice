package com.stackroute.practice1;

import java.util.Scanner;

public class GuessTheNumber {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = (int) (Math.random() * 100 + 1);
		System.out.println("Guess The number[1-100]");
		while (true) {
			int input = sc.nextInt();
			if (input == x) {
				System.out.println("Number guessed matches the original number");
				break;
			} else if (input > x) {
				System.out.println("Number guessed is more than the original number");
			} else {
				System.out.println("Number guessed is less than the original number");
			}
			System.out.println("Try Again");
		}
		sc.close();
	}

}
