package com.tksa.doubt;

import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		Payment p1=new Payment();
		System.out.println("enter product id");
		p1.setPrId(sc.nextInt());
		System.out.println("enter product name");
		String name=sc.nextLine();
		p1.setPrName(name);
		System.out.println("enter UPI id");
		p1.setUpiId(sc.nextInt());
		System.out.println("enter UPI App name");
		p1.setUpiAppName(sc.next());
		System.out.println("enter person id");
		p1.setPersonId(sc.nextInt());
		System.out.println("enter person name");
		p1.setPersonName(sc.next());
		sc.close();
		System.out.println("Product Id "+p1.prId);
		System.out.println("Product Name"+p1.prName);
		System.out.println("UPI Id "+p1.upiId);
		System.out.println("UPI App "+p1.upiAppName);
		System.out.println("Person Id "+p1.personId);
		System.out.println("Person Name "+p1.personName);



	}

}
