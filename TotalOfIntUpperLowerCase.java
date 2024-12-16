package com.javaHackathon;

import java.util.Scanner;

public class TotalOfIntUpperLowerCase {
public static void main(String[] args) {
	
	int icount=0, lcount=0, ucount=0, special =0;
	
	System.out.println("Enter a string");
	Scanner sc = new Scanner(System.in);

	String str1 = sc.nextLine();
	sc.close();

	for(int i=0;i<str1.length();i++)
	{
		char ch = str1.charAt(i);
		if(ch >= 'A' && ch<='Z')
			ucount++;
		else if (ch>='a' && ch<='z')
			lcount++;
		else if(ch>='0' && ch<='9')
			icount++;
			else
				special++;
	}
	
	System.out.println("Numbers = " + icount);
	System.out.println("Lower Case = " + lcount);
	System.out.println(("Upper Case = " + ucount));
	System.out.println("Special char = " + special);
	
	
}
}
