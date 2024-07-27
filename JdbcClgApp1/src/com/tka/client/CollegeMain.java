package com.tka.client;

import java.util.Scanner;
import com.tka.controller.Controller;
import com.tka.dao.CollegeDAO;
import com.tka.service.Service;

public class CollegeMain {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		Controller controller=new Controller();
		controller.setService(new Service(new CollegeDAO()));
		
		while(true) {
			System.out.println("----------------------------------------------------");
			System.out.println("1:Press 1 to Insert Record");
			System.out.println("2:Press 2 to Update Record");
			System.out.println("3:Press 3 to Delete Record");
			System.out.println("4:Press 4 to Display Records By College Id");
			System.out.println("5:Press 5 to Display Records By College Name");						
			System.out.println("6:Press 6 to Display All Records ");
			System.out.println("7:Press 7 to Copy Data from One Table to another");
			System.out.println("8:Press 8 to Exit");
			System.out.println("-----------------------------------------------------");
			System.out.println("enter choice ");
			int choice=sc.nextInt();

			switch(choice) {
			case 1:				
				controller.insertRecord();			
				break;
			case 2:			
				controller.updateRecord();							
				break;
			case 3:
				controller.deleteRecord();
				break;
			case 4:
				controller.displayRecordById();	
				break;
			case 5:
				controller.displayRecordByName();			
				break;
			case 6:
				controller.displayAllRecord();				
				break;
			
			case 7:
				controller.copyDataFrmTbl();			
				break;
			
			case 8:
				controller.close();
				System.exit(0);
				
			default:
				System.out.println("Invalid Choice");
			}

		}


	}

}
