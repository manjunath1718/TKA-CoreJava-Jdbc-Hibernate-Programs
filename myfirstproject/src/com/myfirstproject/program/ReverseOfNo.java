package com.myfirstproject.program;
import java.util.Scanner;

public class ReverseOfNo {
	
	public static void reverse(int n) {		
		int n1=n;
		int rev=0;
		int rem=0;
		                                    
		for(int i=n1;i>0;i=n1) {
			rem=n1%10;
			rev=rev*10+rem;
			n1=n1/10;		
		}	
		System.out.println(rev);
		
		if(n==rev)
			System.out.println("number is palindrome");
		else
			System.out.println("number is not palindrome");
	}	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no");
		int n=sc.nextInt();
		ReverseOfNo.reverse(n);

	}

}
