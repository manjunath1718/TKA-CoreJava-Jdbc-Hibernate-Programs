package com.tka.controller;

import java.util.Scanner;

import com.tka.dao.ProductDAO;
import com.tka.service.Service;

public class ProductMain {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		Service service=new Service();
		service.setDao(new ProductDAO());
		
		while(true) {
			System.out.println("----------------------------------------------------");
			System.out.println("1:Press 1 to Insert Record");
			System.out.println("2:Press 2 to Update Record");
			System.out.println("3:Press 3 to Delete Record");
			System.out.println("4:Press 4 to Display Records By Product Id");
			System.out.println("5:Press 5 to Display Records By Product Name");
			System.out.println("6:Press 6 to Display Records By Product Price");			
			System.out.println("7:Press 7 to Display  All Records ");
			System.out.println("8:Press 8 to Exit");
			System.out.println("-----------------------------------------------------");
			System.out.println("enter choice ");
			int choice=sc.nextInt();

			switch(choice) {
			case 1:				
				service.insertRecord();			
				break;
			case 2:			
				service.updateRecord();							
				break;
			case 3:
				service.deleteRecord();
				break;
			case 4:
				service.displayRecordById();	
				break;
			case 5:
				service.displayRecordByName();			
				break;
			case 6:
				service.displayRecordByPrice();				
				break;
			
			case 7:
				service.displayAllRecord();				
				break;
			case 8:
				service.close();
				System.exit(0);
			default:
				System.out.println("Invalid Choice");
			}

		}


	}

}
