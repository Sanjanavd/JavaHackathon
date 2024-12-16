package com.javaHackathon;

import java.util.Arrays;
import java.util.Scanner;

public class SortIntegerArray {
	public static void main(String[] args) {

		int[] array1;
		System.out.println("Enter number of elements in the array");
		Scanner sc = new Scanner(System.in);
		int max_value = sc.nextInt();

		array1 = new int[max_value];
		System.out.println("Enter the elements");
		for (int i = 0; i < max_value; i++)
			array1[i] = sc.nextInt();

		System.out.println("Array elements are");
		for (int i = 0; i < max_value; i++)
			System.out.println(array1[i]);

		Arrays.sort(array1);

		System.out.println("Sorted Array ");
		for (int i = 0; i < max_value; i++)
			System.out.println(array1[i]);

		sc.close();
	}
}
