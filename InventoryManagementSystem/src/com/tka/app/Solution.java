package com.tka.app;

import java.sql.SQLException;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) throws SQLException {
		
		Scanner sc=new Scanner(System.in);
		
		Service s=new Service();
		while(true) {
			System.out.println("----------------------------------------------------");
			System.out.println("1:Press 1 to Insert Record");
			System.out.println("2:Press 2 to Update Record");
			System.out.println("3:Press 3 to Delete Record");
			System.out.println("4:Press 4 to Display Records By Product Id");
			System.out.println("5:Press 5 to Display Records By Product Name");
			System.out.println("6:Press 6 to Display Records By Product Price");
			System.out.println("7:Press 7 to Display Records By Product Category");
			System.out.println("8:Press 8 to Display  All Records ");
			System.out.println("9:Press 9 to Exit");
			System.out.println("-----------------------------------------------------");
			System.out.println("enter choice ");
			int choice=sc.nextInt();
			
			switch(choice) {
			case 1:				
					s.insertRecord();				
				break;
			case 2:			
					s.updateRecord();								
				break;
			case 3:
				   s.deleteRecord();
				break;
			case 4:
			       s.displayRecordById();		
				break;
			case 5:
				   s.displayRecordByName();				
				break;
			case 6:
				   s.displayRecordByPrice();				
				break;
			case 7:
				   s.displayRecordByCategory();				
				break;
				
			case 8:
				   s.displayAllRecord();				
				break;
			case 9:
				System.exit(0);
			default:
				System.out.println("Invalid Choice");
			}
			
		}

	}

}
