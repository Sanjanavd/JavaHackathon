package com.javaHackathon;

import java.util.Arrays;

public class MergeTwoArrays {
public static void main(String[] args) {
	int array1[] = new int[10];
	int array2[] = {3,5,7,8};
	
	array1[0]=1;
	array1[1]=2;
	array1[2]=4;
	array1[3]=6;
	array1[4]=9;
	array1[5]=10;
	
	System.out.println("Array 1 : " + Arrays.toString(array1));
	System.out.println("Array 2 : " + Arrays.toString(array2));
	
	int a1 = array1.length - array2.length;
	int a2 = array2.length;
	
	for(int i=0;i<a2;i++) {
		array1[a1 + i]=array2[i];
		
	}
	Arrays.sort(array1);
	System.out.println("Merged Array : " + Arrays.toString(array1));
	
}
}
