package com.tka.tasks;

public class DisplayGrandTotal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int qty=3;
		final int cost=500;
		int billAmount=qty*cost;
		
		System.out.println("The bill amount is "+billAmount);
		
		int totalBill=billAmount+(billAmount*10/100);
		System.out.println("The Total bill with Tax "+totalBill);
		
		int grandTotal=totalBill-(totalBill*5/100);		
		System.out.println("The Grand Total Bill with Discount "+grandTotal);

	}

}
