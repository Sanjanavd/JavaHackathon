package com.javaHackathon;

import java.util.Scanner;

public class ConsecutiveNumCombinations {
public static void main(String[] args) {
	System.out.println("Enter a number");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	
	boolean b = false;
	
	for(int start=1;start<n;start++) {
		int sum=0;
		int current=start;
		
		while(sum<n) {
			sum+=current;
			
			if(sum==n) {
				if(!b) {
					System.out.println("Poosible sum combinations of " + n+ "are" );
					b=true;
				}
				for(int i=start;i<=current;i++) {
					
				}
			}
		}
	}
	}
}
