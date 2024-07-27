package com.tka.exception2;

import java.util.Scanner;

public class MainClsOfProduct {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Product Details");
		System.out.println("Enter Product ID");
		String id=sc.next();
		if(id.charAt(0)!='p' && id.charAt(0)!='P') {
			try {
				throw   new InvalidIDException("Enter Product Id Starts with P");
			}
			catch(InvalidIDException e) {
				System.out.println(e.getMessage());
			}
		}
		else {
			System.out.println("Enter Product Name");
			String name=sc.next();
			System.out.println("Enter Product Cost");
			double cost=sc.nextDouble();
			if(cost<0) {
				try {
					throw   new CostException("Cost can't be in negative.Enter valid Amount");
				}catch(CostException e) {
					System.out.println(e.getMessage());
				}
			}
			else {
				Product p1=new Product(id, name, cost);
				System.out.println(p1);
			}
		}
		
	}

}
