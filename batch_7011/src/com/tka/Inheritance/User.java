package com.tka.Inheritance;

import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1:Fashion \n2:Electronics");
		System.out.println("Enter choice");
		int choice=sc.nextInt();
		
		switch(choice) {
		
		case 1: BrandofCloths bc1=new BrandofCloths();
		        System.out.println("Enter product id,price,qauntity");
		        bc1.setData(sc.nextInt(), sc.nextInt(), sc.nextInt());
		        System.out.println("Enter section of Fashion");
		        bc1.setSection(sc.next());
		        System.out.println("Enter Brand of Cloth");	        
		        bc1.setBrandName(sc.next());
		        System.out.println("Enter size of cloth");
		        bc1.setSize(sc.nextInt());
		        
		        System.out.println("Product Id: "+bc1.productId);
		        System.out.println("Product Price: "+bc1.productPrice);
		        System.out.println("Product Quantity: "+bc1.productQty);
		        System.out.println("Section of Fashion: "+bc1.getSection());
		        System.out.println("Brand: "+bc1.getBrandName());
		        System.out.println("Size: "+bc1.getSize());
		        break;
		        
		case 2:BrandOfElectronics be1=new BrandOfElectronics();
		        System.out.println("Enter product id,price,qauntity");
                be1.setData(sc.nextInt(), sc.nextInt(), sc.nextInt());
                System.out.println("Enter type of Accessories");
                be1.setAccessoriesName(sc.next());
                System.out.println("Enter Brand of Accessories");
		        be1.setBrandName(sc.next());
		        System.out.println("Enter years of warranty");
		        be1.setWarranty(sc.nextInt());
		        
		        System.out.println("Product Id: "+be1.productId);
		        System.out.println("Product Price: "+be1.productPrice);
		        System.out.println("Product Quantity: "+be1.productQty);
		        System.out.println("Accessories type: "+be1.accessoriesName);
		        System.out.println("Brand: "+be1.getBrandName());
		        System.out.println("Size: "+be1.getWarranty());
			    break;
			    
		default:
			    System.out.println("Invalid Choice");
		
		}
					
	}

}
