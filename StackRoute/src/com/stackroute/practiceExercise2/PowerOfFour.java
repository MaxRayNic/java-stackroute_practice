package com.stackroute.practiceExercise2;

import java.util.Scanner;

public class PowerOfFour {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if (Math.floor(Math.log(a) / Math.log(4)) == Math.ceil(Math.log(a) / Math.log(4))) {
			System.out.println("Power of 4");
		} else
			System.out.println("Not power of 4");
		sc.close();
	}

	public boolean checkForPowerOfFour(String d1) {
		if (d1 == null)
			throw new NullPointerException();
		int a = Integer.parseInt(d1);
		if (a == 0)
			return false;
		else
			return (Math.floor(Math.log(a) / Math.log(4)) == Math.ceil(Math.log(a) / Math.log(4)));

	}

}