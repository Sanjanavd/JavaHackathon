package com.javaHackathon;

import java.util.Scanner;

public class LowerToUpperCase {

	public static void main(String[] args) {
		System.out.println("Enter String");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		String uppercase = str.toUpperCase();
		System.out.println("String in Upper Case = " + uppercase);
		sc.close();
	}
}
