package com.tka.tasks;

public class Uber {
	
	public void calculateBill() {
		
		int rate=14;
		int distance=2;
		int charge=rate*distance;
		
		System.out.println("total travel charge is "+charge);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Uber u1=new Uber();
		u1.calculateBill();
		

	}

}
