package com.tka.sat;

import java.util.Scanner;

public class NumberToWords {
	public static int countOfDigits(int n) {
		int count=0;
		while(n!=0) {
			count++;
			n=n/10;
		}
		return count;
	}
	public static void convertToWord(int n) { 
		int digits=countOfDigits(n)-1;         //2             1            0       -1
		
		int n1;                   		                        
		while(Math.pow(10, digits)!=0.1) {		//100          10           1
		    n1=(int) (n/Math.pow(10, digits));  //1            5            3
			switch(n1) {                        //one          five         three
			  case 0-> System.out.print("zero ");
			  case 1-> System.out.print("one ");
			  case 2-> System.out.print("two ");
			  case 3-> System.out.print("three ");
			  case 4-> System.out.print("four ");
			  case 5-> System.out.print("five ");
			  case 6-> System.out.print("six ");
			  case 7-> System.out.print("seven ");
			  case 8-> System.out.print("eight ");
			  case 9-> System.out.print("nine ");
			}
			n=(int) (n%Math.pow(10, digits));    //53         3            0
			digits--;                            //1          0            -1
			
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Number");
		int n=sc.nextInt();
		NumberToWords.convertToWord(n);
		
		

	}

}
