package com.tka.fridaytask;

import java.util.Scanner;


public class MenuDrivenOfProduct {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Product[] parr = null;
		while(true) {
			System.out.println("-----------------------------------------------------");
			System.out.println("1:Accept Product Details");
			System.out.println("2:Display Product Details");
			System.out.println("3:Search for particular Product");
			System.out.println("4:Accept product id,quantity & Display Bill");
			System.out.println("5:Press 5 to Exit");
			System.out.println("-----------------------------------------------------");
			System.out.println("Enter choice");
			int choice=sc.nextInt();
			switch(choice) {

			case 1:System.out.println("Enter products number");
			int n=sc.nextInt();
			parr= new Product[n];
			for(int i=0;i<n;i++) {

				System.out.println("Enter Product Id ");
				int pId=sc.nextInt();
				System.out.println("Enter Product name ");
				String pName=sc.next();
				System.out.println("Enter product cost ");
				double pCost=sc.nextDouble();
				parr[i]=new Product(pId, pName, pCost);
				System.out.println("Successfully Accepted Product "+(i+1)+" Details");
			}
			break;

			case 2:
				System.out.println(parr[0].toString());
				System.out.println(parr[1].toString());
				break;

			case 3:
				System.out.println("Enter product name");		
			    String s=sc.next();
			    boolean found=false;
			    for(int i=0;i<parr.length;i++) {
				    if(s.equals(parr[i].productName)) {
					  System.out.println("Product is Available");
					  found=true;
				    }
			    }
			    if(found==false) {
			    	System.out.println("Product is not available");
			    }
			break;

			case 4:
				System.out.println("Enter Product Id ");
				int id=sc.nextInt();
				System.out.println("Enter Product Quantity");
				int qty=sc.nextInt();
				for(int i=0;i<parr.length;i++) {
				    if(id==parr[i].productId) {
					  double bill=parr[i].productCost*qty;
					  System.out.println("Bill Amount "+bill);
					  break;
				    }
			    }
				break;
				
			case 5:
				System.exit(0);

			default:
				System.out.println("Invalid choice");
			}
		}

	}

}
