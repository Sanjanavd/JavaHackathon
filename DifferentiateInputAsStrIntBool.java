package com.javaHackathon;

import java.util.Scanner;

public class DifferentiateInputAsStrIntBool {
	public static void main(String[] args) {
		System.out.println("Enter a string");
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		sc.close();

		if (isInteger(str)) {
			System.out.println("Input is Integer");
		} else if (isBoolean(str)) {
			System.out.println("Input is Boolean");
		} else
			System.out.println("Input is String");

	}

	private static boolean isInteger(String str) {
		try {
			Integer.parseInt(str);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	private static boolean isBoolean(String str) {
		return str.equalsIgnoreCase("true") || str.equalsIgnoreCase("false");

	}
}
