package com.myfirstproject.program;

import java.util.Arrays;
import java.util.Scanner;



public class Greet {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("hello");
		String s1="java";
		
		String[] str=new String[5];
		
		for(int i=0;i<str.length;i++) {
			str[i]=sc.next();
			
		}
		System.out.println(Arrays.toString(str));
		
		

	}

}
