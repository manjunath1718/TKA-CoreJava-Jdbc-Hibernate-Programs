package com.tka.test25042024;

import java.util.Scanner;

public class AcceptFiveNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
		for(int i=1;i<=5;i++) {
			System.out.println("Accept number-"+i);
			int n=sc.nextInt();
			if(n==100) {			
				System.exit(0);
			}
			else {
				arr[i-1]=n;
			}
		}
		System.out.println(" Numbers Are");
		for(int i=0;i<arr.length;i++) {			
			System.out.print(arr[i]+" ");
		}
		
	}

}
