package com.tka.tasks;
import java.util.Scanner;

public class ConstructorDemo {
	int n1;
	int n2;
	public ConstructorDemo(int n1,int n2) {
		this.n1=n1;
		this.n2=n2;		
	}
	
	public void display() {
		int sum=0;
		for(int i=n1;i<=n2;i++) {
			sum=sum+i;
		}
		System.out.println("sum of numbers b/w these numbers "+sum );
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1st numbers");
		int n1=sc.nextInt();
		System.out.println("enter 2nd numbers");
		int n2=sc.nextInt();
		
		ConstructorDemo c1=new ConstructorDemo(n1,n2);
		c1.display();

	}

}
