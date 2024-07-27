package com.tka.client;

import java.util.Scanner;

import com.tka.controller.Controller;
import com.tka.dao.CollegeDAO;
import com.tka.service.Service;

public class Client {

	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		Controller controller=new Controller();
		controller.setService(new Service(new CollegeDAO()));
		while(true) {
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("1:Press 1 to Add College");
			System.out.println("2:Press 2 to Display College Name According to your Preference of Characters");
			System.out.println("3:Press 3 to Display College Name in Ascending Order");				
			System.out.println("4:Press 4 to Display  All College Names ");
			System.out.println("5:Press 5 to Exit");
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("enter choice ");
			int choice=sc.nextInt();

			switch(choice) {
			case 1:				
				controller.addCollegeName();			
				break;
			case 2:			
				controller.displayCollegeNameByChar();						
				break;
			case 3:
				controller.displayCollegeNameAscOrd();
				break;
			case 4:
				controller.displayAllCollegeName();	
				break;			
			case 5:
				System.exit(0);
			default:
				System.out.println("Invalid Choice");
			}

		}



	}

}
