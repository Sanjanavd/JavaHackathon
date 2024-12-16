package com.javaHackathon;

import java.util.Scanner;

public class FactorialNonRecurssive {
	public static void main(String[] args) {

		int fact = 1, n;

		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			fact *= i;
		}
		System.out.println("Factorial of " + n + " is " + fact);
		sc.close();
	}
}
