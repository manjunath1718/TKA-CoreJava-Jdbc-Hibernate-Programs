package com.tka.interfaceprograms;

import java.util.Scanner;

public class ConsuProd implements OnlineShop,Rshop {

	double tax;
	
	public ConsuProd(int tax) {
		this.tax=tax/100.0;
	}
	
	@Override
	public double bill(int pCost, int qty) {
		
		double bill=(pCost+this.tax*pCost)*qty;
		return bill;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1:Online 2:Rshop");
		System.out.println("Enter choice");
		int choice=sc.nextInt();
		
		switch(choice) {
		  case 1:	  
			  System.out.println("enter Product cost");
			  int pCost=sc.nextInt();
			  System.out.println("enter quantity");
			  int qty=sc.nextInt();
			  System.out.println("enter Tax");
			  int tax=sc.nextInt();
			  ConsuProd c1=new ConsuProd(tax);
			  double totalbill=c1.bill(pCost,qty)+(pCost/100)*qty;
			  System.out.println("Cost: "+pCost);
			  System.out.println("Quantity: "+qty);
			  System.out.println("Tax: "+tax);
			  System.out.println("Total Bill "+totalbill);
			  break;
		  case 2:
			  System.out.println("enter Product cost");
			  int pCost1=sc.nextInt();
			  System.out.println("enter quantity");
			  int qty1=sc.nextInt();
			  System.out.println("enter Tax");
			  int tax1=sc.nextInt();
			  ConsuProd c11=new ConsuProd(tax1);
			  double totalbill1=c11.bill(pCost1,qty1);
			  System.out.println("Cost: "+pCost1);
			  System.out.println("Quantity: "+qty1);
			  System.out.println("Tax: "+tax1);
			  System.out.println("Total Bill "+totalbill1);
			  break;
		  default:
			  System.out.println("Invalid choice");
			  
			
		}
	}
	
	

}
