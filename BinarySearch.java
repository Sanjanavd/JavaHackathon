package com.javaHackathon;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		System.out.println("Enter total number of elements");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] arr = new int[n];
		System.out.println("Enter Array Elements");
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		System.out.println("Enter element to be found");
		int target = sc.nextInt();

		int last = arr.length - 1;
		

		binarySearch(arr, 0, last, target);
	}

	private static void binarySearch(int[] arr, int first, int last, int target) {
		int mid = (first + last) / 2;
		while (first <= last) {
			if (arr[mid] < target) {
				first = mid + 1;
			} else if (arr[mid] == target) {
				System.out.println("Element is found at index " + mid);
				break;
			} else {
				last = mid - 1;
			}
			mid = (first + last) / 2;

		}
		if (first > last)
			System.out.println("Element not found");

	}
}
