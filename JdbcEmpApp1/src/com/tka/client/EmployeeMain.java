package com.tka.client;

import java.util.Scanner;
import com.tka.controller.Controller;
import com.tka.dao.EmployeeDAO;
import com.tka.service.Service;

public class EmployeeMain {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		Controller controller=new Controller();
		Service service = new Service();
		controller.setService(service);
		service.setDao(new EmployeeDAO());
		while(true) {
			System.out.println("----------------------------------------------------");
			System.out.println("01:Press 1 to Insert Record");
			System.out.println("02:Press 2 to Update Record");
			System.out.println("03:Press 3 to Delete Record");
			System.out.println("04:Press 4 to Display All Records");
			System.out.println("05:Press 5 to Display Records By Employee Id");						
			System.out.println("06:Press 6 to Display Records By Employee Name ");
			System.out.println("07:Press 7 to Display Records By Employee Salary ");
			System.out.println("08:Press  8 to Copy Data from One Table to another According to Higher Salary");
			System.out.println("09:Press  9 to Copy Data from One Table to another According to Salary Range");
			System.out.println("10:Press 10 to Copy Data from One Table to another According to Lower Salary");
			System.out.println("11:Press 11 to Exit");
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
				controller.displayAllRecord();		
				break;
			case 5:
				controller.displayRecordById();						
				break;
			case 6:
				controller.displayRecordByName();		
				break;
			case 7:
				controller.displayRecordBySalary();
				break;
			case 8:
				controller.copySrEmpDataFrmTbl();			
				break;
				
			case 9:
				controller.copyMidLvlEmpDataFrmTbl();
				break;
			case 10:
				controller.copyJrEmpDataFrmTbl();		
				break;
			
			case 11:
				controller.close();
				System.exit(0);
				
			default:
				System.out.println("Invalid Choice");
			}

		}


	}

}
