package com.javaHackathon;

import java.util.Scanner;

public class LongestPalindrome {
	public static void main(String[] args) {
		System.out.println("Enter String");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println("Longest Palindrome is: " + longestPalindrome(str));

	}

	private static String longestPalindrome(String str) {
		int n = str.length();
		String lp = "";
		for (int i = 0; i < n; i++) {   
			for (int j = i; j < n; j++) { 
				String subStr = str.substring(i, j+1);
				if (isPalindrome(subStr) && subStr.length() > lp.length()) {
					lp = subStr;
				}
			}
		}
		return lp;

	}

	private static boolean isPalindrome(String str) {
		int i = 0;
		int j = str.length() - 1;
		while (i < j) {
			if (str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}
