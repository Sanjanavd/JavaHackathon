package com.javaHackathon;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		System.out.println("Enter String");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		strPalindrome(str);
		System.out.println("Enter Number");
		int num = sc.nextInt();
		intPalindrome(num);
		sc.close();
	}
	private static void strPalindrome(String str) {
		String revstr = "";
		int length = str.length();
		for (int i = (length - 1); i >= 0; i--) {
			revstr = revstr + str.charAt(i);
		}
		if (str.equalsIgnoreCase(revstr)) {
			System.out.println("String is Palindrome");
		} else {
			System.out.println("String is not Palindrome");
		}
	}
	private static void intPalindrome(int num) {
		int revnum = 0, remainder;
		int originalnum = num;
		while (num != 0) {
			remainder = num % 10;
			revnum = revnum * 10 + remainder;
			num /= 10;
		}
		if (originalnum == revnum) {
			System.out.println("Number is Palindrome");
		} else {
			System.out.println("Number is not Plaindrome");
		}
	}

}
