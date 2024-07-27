package com.tka.exception1;

import java.util.Scanner;

public class VowExcMainCls {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Consonant");
		char ch=sc.next().charAt(0);
		
		if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' ||
				ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U') {
			try {
				throw new VowelException("Please enter consonant letter");
			}
			catch(VowelException e) {
				System.out.println(e.getMessage());
			}
		}else {
			System.out.println("Enter character is-> "+ch);
		}
		

	}

}
