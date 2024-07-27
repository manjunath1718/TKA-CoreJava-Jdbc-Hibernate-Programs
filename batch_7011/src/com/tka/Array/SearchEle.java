package com.tka.Array;

import java.util.Scanner;

public class SearchEle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int[] arr=new int[10];
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter number");
			 arr[i]=sc.nextInt();
		}
		System.out.println("enter element to be search");
		int ele=sc.nextInt();
		
		for(int i=0;i<arr.length;i++) {
			if(ele==arr[i]) {
				System.out.println("number found at index position "+i);
			}
		}

	}

}
