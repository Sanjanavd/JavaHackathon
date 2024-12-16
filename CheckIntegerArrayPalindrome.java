package com.javaHackathon;

import java.util.Scanner;

public class CheckIntegerArrayPalindrome {
	public static void main(String[] args) {

		int[] a;
		int flag = 0;
		System.out.println("Enter total number of elements");
		Scanner sc = new Scanner(System.in);
		int max = sc.nextInt();

		a = new int[max];

		System.out.println("Enter Array Elements");
		for (int i = 0; i < max; i++) {
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < max; i++) {
			if (a[i] != a[max - 1 - i]) {
				flag = 1;
			}
		}

		if (flag == 1)
			System.out.println("Series is Not a Palindrome");
		else
			System.out.println("Series is Palindrome");

		sc.close();

	}

}
