package com.javaHackathon;

import java.util.Scanner;

public class ConvertStringToInt {
	public static void main(String[] args) {
		System.out.println("Enter a string");
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		sc.close();
		
		int num = 0;
		try{
			num =Integer.parseInt(str);
		}
		catch (NumberFormatException e) {
			System.out.println("Invalid number format " + e.getMessage());
		}
		
		System.out.println(num);
		
		
	}
}
