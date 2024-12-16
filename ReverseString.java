package com.javaHackathon;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println("Enter a string");
		Scanner sc = new Scanner(System.in);

		String str1 = sc.nextLine();

		System.out.println("Original word is " + str1);
		sc.close();

		char[] arr = str1.toCharArray();
		System.out.print("Reversed String is ");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i]);

		}

	}
}
