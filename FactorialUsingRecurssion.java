package com.javaHackathon;

import java.util.Scanner;

public class FactorialUsingRecurssion {

	public static void main(String[] args) {
		int num;
		
		System.out.println("Enter a Number");
		Scanner sc = new Scanner(System.in);
		num=sc.nextInt();
		int factorial = fact(num);
		System.out.println("Factorial = " + factorial);
	}

	public static int fact(int num) {
		if(num >= 1)
			return num * fact(num -1);
		else
			return 1;
	}
}
