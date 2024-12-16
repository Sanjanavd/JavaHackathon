package com.javaHackathon;

import java.util.Scanner;

public class PrintUniqueWords {
	public static void main(String[] args) {
		int count;
		System.out.println("Enter a string");
		Scanner sc = new Scanner(System.in);

		String str1 = sc.nextLine();
		sc.close();

		String[] strarray = str1.split(" ");

		System.out.println("Unique words of String is ");

		for (int i = 0; i < strarray.length; i++) {
			count = 1;

			for (int j = i + 1; j < strarray.length; j++) {
				if (strarray[i].equalsIgnoreCase(strarray[j])) {
					count++;
					strarray[j] = "";
				}
			}
			if (count == 1 && strarray[i] != "") {
				System.out.println(strarray[i]);
			}

		}
	}
}
