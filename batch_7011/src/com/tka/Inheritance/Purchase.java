package com.tka.Inheritance;

import java.util.Scanner;

public class Purchase extends ConsumerProduct {
	
	public void bill(int qty) {	
		
		double amount;
		double totalBillAmount;
		double tax=( getProductCost()*getTax() )/100;
		amount=getProductCost()+tax;
		totalBillAmount=qty*amount;
		System.out.println("Quantity:"+qty);
		System.out.println("Total Bill amount "+totalBillAmount);
			
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Purchase p1=new Purchase();
		System.out.println("enter product id:");
		p1.setProductId(sc.nextInt());
		System.out.println("enter product Name:");
		p1.setProductName(sc.next());
		System.out.println("enter product cost:");
		p1.setProductCost(sc.nextInt());
		System.out.println("Enter consumer tax");
		p1.setTax(sc.nextInt());		
		System.out.println("enter quantity");
		int qty=sc.nextInt();
		
		System.out.println("product id: "+p1.getProductId());
		System.out.println("product Name: "+p1.getProductName());
		System.out.println("Product cost: "+p1.getProductCost());
		System.out.println("Tax :"+p1.getTax());
		
		p1.bill(qty);
		
		
	}

	

}
