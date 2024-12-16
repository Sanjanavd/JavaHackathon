package com.javaHackathon;

import java.util.Scanner;

public class RevWordInSentence {
	public static void main(String[] args) {
		String rev = "";
		System.out.println("Enter a string");
		Scanner sc = new Scanner(System.in);

		String str1 = sc.nextLine();

		System.out.println("Original word is " + str1);
		sc.close();

		String[] strarray = str1.split(" ");

		System.out.print("Reversed String is ");

		for (int i = strarray.length - 1; i >= 0; i--) {
			rev = rev + " " + strarray[i];
		}
		System.out.print(rev);
	}
}
