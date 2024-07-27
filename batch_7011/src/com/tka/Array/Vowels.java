package com.tka.Array;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=0;
		char[] c=new char[10];
		for(int i=0;i<c.length;i++) {
			System.out.println("enter character");
			c[i]=sc.next().charAt(0);
			if(c[i]=='a' || c[i]=='e' || c[i]=='i' || c[i]=='o' || c[i]=='u' || 
			   c[i]=='A' ||c[i]=='E' ||c[i]=='I' ||c[i]=='O' ||c[i]=='U') {
				count++;
			}
		}
		System.out.println("numbers of vowels "+count);
		

	}

}
