package com.javaHackathon;

import java.lang.reflect.Array;
import java.util.Scanner;

public class SelectionSort {
	public static void main(String[] args) {

		int[] arr;
		int n;
		System.out.println("Enter Total Number of Elements");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		arr = new int[n];
		System.out.println("Enter Array Elements");
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		System.out.println("Sorted Array");
		selectionSort(arr, n);
		sc.close();
	}

	private static void selectionSort(int[] arr, int n) {

		int i, j, min, temp = 0;
		for (i = 0; i < n; i++) {
			min = i;
			for (j = i + 1; j < n; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
			System.out.println(arr[i]);

		}
	}
}
