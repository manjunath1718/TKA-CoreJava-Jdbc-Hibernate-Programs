package com.tka.pattern;

public class Pattern2 {

	public static void main(String[] args) {
		
		System.out.println("Start");
		int n=65;
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print((char)(i+n)+" ");
			}
			System.out.println();
		}
		
		System.out.println("End");

	}

}
