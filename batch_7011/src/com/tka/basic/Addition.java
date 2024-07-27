package com.tka.basic;

public class Addition {
	
	//without argument and without return statement
	public void sum1() {
		int a=1,b=2,c=3;
		int sum=a+b+c;
		System.out.println("sum of 3 numbers "+sum);
	}
	
	//with argument and without return statement
	public void sum2(int a,int b,int c) {
		int sum=a+b+c;
		System.out.println("sum of 3 Numbers "+sum);
	}
	
	//without argument and with return statement
	public int sum3() {
		int a=1,b=3,c=5;
		int sum=a+b+c;
		return sum;
	}
	
	//with argument and with return statement
	public int sum4(int a,int b,int c) {		
		int sum=a+b+c;
		return sum;
	}

	public static void main(String[] args) {
		
		Addition a1=new Addition();
		a1.sum1();
		
		a1.sum2(2, 4, 6);
		
		int sum=a1.sum3();
		System.out.println("sum of 3 numbers "+sum);
		
		int sum1=a1.sum4(2,2,2);
		System.out.println("sum of 3 numbers "+sum1);
		

	}

}
