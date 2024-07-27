package com.tka.Array;

import java.util.Arrays;
import java.util.Scanner;

public class SortSearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		double[] arr=new double[10];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextDouble();		
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("Enter element to be searched");
		double ele=sc.nextDouble();
		
		int index=Arrays.binarySearch(arr, ele);
		boolean found=index<arr.length && index>=0 ;
			if(found) {
				System.out.println("element is found at index "+index);
			}else {
				System.out.println("element not found");
			}
	}

}
