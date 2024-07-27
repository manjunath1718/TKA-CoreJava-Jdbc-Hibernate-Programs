package com.tka.tasks;

public class ProdDiscount {
	
	public static Products productDiscount(Products p) {
		
		double d=p.getpCost()*10/100;
		double cost=p.getpCost()-d;
		p.setpCost(cost);
		return p;		
	}
	public static void main(String[] args) {
		
		Products p=new Products(111,"puma", 1000);
		System.out.println("Before discount");
		System.out.println(p.toString());
		
		Products p1=productDiscount(p);
		
		System.out.println("After discount");
		System.out.println(p1.toString());
		
		
	}

}
