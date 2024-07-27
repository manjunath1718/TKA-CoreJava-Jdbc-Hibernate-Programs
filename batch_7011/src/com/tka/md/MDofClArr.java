package com.tka.md;

import java.util.Scanner;

public class MDofClArr {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr = null;
		while(true) {
			System.out.println("------------------------------------");
			System.out.println("1:Create Array");
			System.out.println("2:Display Array");
			System.out.println("3:Sort Array");
			System.out.println("4:Search Element");
			System.out.println("5:Exit");
			System.out.println("------------------------------------");
			System.out.println("enter choice ");
			int choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter Size of Array");
				int size=sc.nextInt();
				arr=new int[size];
				
				arr=ClsArray.createArray(size);
				System.out.println("Array got Created");
				break;
			case 2:
				ClsArray.displayArray();
				break;
			case 3:
				ClsArray.sortArray();
				break;
			case 4:
				System.out.println("enter elent to be searched");
				int ele=sc.nextInt();
				ClsArray.searchElement(arr,ele);
				break;
			case 5:
				System.exit(0);
			default:
				System.out.println("Invalid Choice");
			}
			
		}
	}

}
