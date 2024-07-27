package com.tka.Array;

import java.util.Scanner;

public class PrdMainCls {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		Product[] p=new Product[2];
		
		for(int i=0;i<p.length;i++) {
			p[i]=new Product();
			System.out.println("enter product Id ");
			int id=sc.nextInt();
			p[i].setProductId(id);
			System.out.println("enter product Name ");
			String name=sc.next();
			p[i].setProductName(name);
			System.out.println("enter product Cost ");
			float cost=sc.nextFloat();
			p[i].setProductCost(cost);
			
		}
		for(int i=0;i<p.length;i++) {
			System.out.println(p[i].toString());
		}
		
		System.out.println("enter Product Id to be purchased ");
		int pId=sc.nextInt();
		boolean found=false;
		int pos=-1;
		for(int i=0;i<p.length;i++) {
			if(p[i].getProductId()==pId) {
				System.out.println("Product Id found");
				pos=0;
				found=true;
				break;
			}
		}
		if(found) {
			System.out.println("enter Product quantity");
			int qty =sc.nextInt();
			float billAmount=p[pos].getProductCost()*qty;
			System.out.println("Bill Amount "+billAmount);
			
		}
		else {
			System.out.println("Product not available");
		}
				

	}

}
