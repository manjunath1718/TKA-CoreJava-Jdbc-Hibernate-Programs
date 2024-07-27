package com.tka.jdbc1;

import java.sql.SQLException;
import java.util.Scanner;

public class MDCourse {

	public static void main(String[] args) throws SQLException {
		Course c=new Course();
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("--------------------------------------------------");
			System.out.println("1:Press 1 to Insert Record");
			System.out.println("2:Press 2 to Display Records");
			System.out.println("3:Press 3 to Update Record");
			System.out.println("4:Press 4 to Delete Record");
			System.out.println("5:Press 5 to Display Records for perticular course");
			System.out.println("6:Press 6 to Exit");
			System.out.println("--------------------------------------------------");
			System.out.println("enter choice ");
			int choice=sc.nextInt();
			
			switch(choice) {
			case 1:				
					c.insertRecord();				
				break;
			case 2:
				try {
					c.displayRecord();	
				}catch(Exception e) {
					System.out.println("Table is Empty");
				}				
				break;
			case 3:
				c.updateRecord();
				break;
			case 4:
				c.deleteRecord();		
				break;
			case 5:
				
				c.displayRecordByCourse();
				break;
			case 6:
				System.exit(0);
			default:
				System.out.println("Invalid Choice");
			}
			
		}

	}

}
