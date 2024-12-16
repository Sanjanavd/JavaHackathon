package com.javaHackathon;

import java.util.Scanner;

public class QuickSort {
	static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = low - 1;
		for (int j = low; j <= high - 1; j++) {
			if (arr[j] < pivot) {
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i + 1, high);
		return i + 1;
	}
	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	static void quickSort(int[] arr, int low, int high) {
		if (low < high) {
			int pi = partition(arr, low, high);
			quickSort(arr, low, pi - 1);
			quickSort(arr, pi + 1, high);
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
		quickSort(arr, 0, n - 1);
		System.out.println("Sorted Array");
		for (int val : arr) {
			System.out.print(val + " ");
		}
	}
}
