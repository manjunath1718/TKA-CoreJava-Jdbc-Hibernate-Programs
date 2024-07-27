package com.tka.md;

import java.util.Arrays;
import java.util.Scanner;

public class ClsArray {
	static int[]  arr;
	public static int[] createArray(int size) {
		arr=new int[size];
		System.out.println("Enter Array Elements to be Stored");
		for(int i=0;i<size;i++) {
			Scanner sc=new Scanner(System.in);
			arr[i]=sc.nextInt();
		}
		return arr;		
	}
	
	public static void displayArray() {
		System.out.println(Arrays.toString(arr));
		
	}
	
	public static void sortArray() {
		Arrays.sort(arr);
	}
	
	public static void searchElement(int[] a,int key) {
		int index=Arrays.binarySearch(a, key);
		System.out.println("elent found at index-"+index);
	}

}
