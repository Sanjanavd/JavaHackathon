package com.javaHackathon;

import java.util.Scanner;

public class checkIfTwoBooleansAreTrue {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values of a,b and c");
		Boolean a = sc.nextBoolean();
		Boolean b = sc.nextBoolean();
		Boolean c = sc.nextBoolean();

		if (a && b || a && c || b && c == true) {
			System.out.println("Two out of three booleans are true");
		} else {
			System.out.println("Not true");
		}
		sc.close();

	}

}
