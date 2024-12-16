package com.javaHackathon;

import java.util.Scanner;

public class CovertIntToString {
public static void main(String[] args) {
	System.out.println("Enter a number");
	Scanner sc = new Scanner(System.in);
	Integer num = sc.nextInt();
	
	String str = num.toString();
	System.out.println(str);
		
}
}
