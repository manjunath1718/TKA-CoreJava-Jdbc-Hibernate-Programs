package com.myfirstproject.program;

import java.util.Scanner;

public class Palindrome {

	static int rev;
	public static boolean checkPalindrome(int n) {
		int n1=n;
		int rem;
		
		for(int i=n1;i>0;i=n1) {
			rem=n1%10;
			rev=rev*10+rem;
			n1=n1/10;
		}
		return rev==n;
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no");
		int n=sc.nextInt();
		if(Palindrome.checkPalindrome(n)) {
			System.out.println("number is palindrome");
		}
		else {
			System.out.println("number is not palindrome");
		}

	}

}
