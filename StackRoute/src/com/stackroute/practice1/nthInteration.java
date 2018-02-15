package com.stackroute.practice1;

import java.util.Scanner;

public class nthInteration {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n + 1; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(i + " ");
			}
		}
		sc.close();
	}
}
