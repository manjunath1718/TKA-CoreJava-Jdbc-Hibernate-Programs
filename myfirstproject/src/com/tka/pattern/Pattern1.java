package com.tka.pattern;

public class Pattern1 {

	public static void main(String[] args) {
		int n=7;
		int i,j;

		
		for( i=0;i<n;i++){
			//pattern1
			for(j=0;j<n;j++) {

				if(i==0 || j==0 || i+j<=n-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
	        //pattern2		
			for(j=0;j<n;j++) {

				if(i==n-1 || j==n-1 || i+j>=n-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}



			System.out.println();
		}

	}

}



