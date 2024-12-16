package com.javaHackathon;

import java.util.Scanner;

public class RemoveGivenCharacter {
public static void main(String[] args) {
	System.out.println("Enter a string");
	Scanner sc = new Scanner(System.in);
	String str1 = sc.nextLine();
	
	System.out.println("Enter character to be removed");
	char ch=sc.next().charAt(0);
	
	sc.close();

	char chararray[] = str1.toCharArray();
	
	for(int i=0;i< chararray.length;i++) {
		if(chararray[i] == ch) {
			continue;
		}
		System.out.print(chararray[i]);
	}
}
}
