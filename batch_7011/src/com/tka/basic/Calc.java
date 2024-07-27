package com.tka.basic;

public class Calc {

	public void avg(int a,int b,int c) {
		
		int sum=a+b+c;
		int avg=sum/3;
		System.out.println("average of 3 numbers is "+avg);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calc c1=new Calc();
		c1.avg(3, 4, 5);

	}

}
