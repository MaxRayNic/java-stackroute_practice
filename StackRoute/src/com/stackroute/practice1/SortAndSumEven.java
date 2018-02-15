package com.stackroute.practice1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SortAndSumEven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String[] strArray = str.split("");
		Arrays.sort(strArray, Collections.reverseOrder());
		int sum = 0;
		for (String string : strArray) {
			System.out.print(string);
			int x = (Integer.parseInt(string) % 2 != 0) ? 0 : Integer.parseInt(string);
			sum += x;
		}
		System.out.println();
		System.out.println("Sum of even numbers : " + sum);
		System.out.println(sum >= 15);
		sc.close();
	}
}
