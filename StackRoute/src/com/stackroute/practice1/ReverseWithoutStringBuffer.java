package com.stackroute.practice1;
import java.util.Scanner;

public class ReverseWithoutStringBuffer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String[] strArray = str.split("");
		str = "";
		for (String string : strArray) {
			str = string + str;
		}
		System.out.println(str);
		sc.close();
	}

}
