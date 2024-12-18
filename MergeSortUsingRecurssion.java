package com.javaHackathon;

import java.util.Scanner;

public class MergeSortUsingRecurssion {
	public static void mergeSort(int[] arr) {
		if (arr.length <= 1) {
			return; 
		}
		int mid = arr.length / 2;
		int[] left = new int[mid];
		int[] right = new int[arr.length - mid];

		System.arraycopy(arr, 0, left, 0, mid);
		System.arraycopy(arr, mid, right, 0, arr.length - mid);

		mergeSort(left);
		mergeSort(right);

		merge(arr, left, right);
	}
	private static void merge(int[] arr, int[] left, int[] right) {
		int i = 0, j = 0, k = 0;

		while (i < left.length && j < right.length) {
			if (left[i] < right[j]) {
				arr[k++] = left[i++];
			} else {
				arr[k++] = right[j++];
			}
		}
		while (i < left.length) {
			arr[k++] = left[i++];
		}
		while (j < right.length) {
			arr[k++] = right[j++];
		}
	}
	public static void main(String[] args) {
		System.out.println("Enter total number of elements");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] arr = new int[n];
		System.out.println("Enter Array Elements");
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		System.out.println("Unsorted array:");
		for (int num : arr) {
			System.out.print(num + " ");
		}

		mergeSort(arr);

		System.out.println("\nSorted array:");
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}
