package com.javaHackathon;

import java.util.Scanner;

public class NoOfOccurencesInArray {
	public static void main(String[] args) {
		System.out.println("Enter array length");
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();

		System.out.println("Enter array values");
		int arr[] = new int[len];
		for (int i = 0; i < len; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Numbers are");
		for (int i = 0; i < len; i++) {
			System.out.println(arr[i]);
		}
		check(arr);
		sc.close();
	}

	private static void check(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			int num = arr[i];
			boolean isNumAlreadyChecked = false;
			for (int k = 0; k < i; k++) {
				if (num == arr[k]) {
					isNumAlreadyChecked = true;
					break;
				}
			}
			if (!isNumAlreadyChecked) {
				for (int j = 0; j < arr.length; j++) {
					if (i != j && num == arr[j]) {
						count++;
					}
				}
				System.out.println(num + " --> Occurred " + count + " time");
			}
		}

	}

}
