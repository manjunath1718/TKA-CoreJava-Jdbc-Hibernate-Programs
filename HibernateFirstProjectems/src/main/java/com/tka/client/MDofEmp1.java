package com.tka.client;

import java.util.Scanner;

import com.tka.service.Service;

public class MDofEmp1 {

	public static void main(String[] args) {
		
		Scanner sc =new  Scanner(System.in);
		Service service=new Service();
		while(true) {
			System.out.println("----------------------------------------------------");
			System.out.println("1:Press 1 to Insert Record");
			System.out.println("2:Press 2 to Update Record");
			System.out.println("3:Press 3 to Delete Record");
			System.out.println("4:Press 4 to Save OR Update Records");
			System.out.println("5:Press 5 to Display All Records");
			System.out.println("6:Press 6 to Display Single Record By Id");
			System.out.println("7:Press 7 to Display Records By Id");
			System.out.println("8:Press 8 to Display Records By Name");			
			System.out.println("9:Press 9 to Display All Records Of Name Column ");
			System.out.println("10:Press 10 to Display All Records Of Name And Salary Columns ");
			System.out.println("11:Press 11 to Exit");
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
				service.saveOrUpdateRecord();
				break;
			case 5:
				service.displayAllRecords();			
				break;
				
			case 6:
				service.displayRecordById();			
				break;
			case 7:
				service.displayRecordsById();				
				break;				
			case 8:
				service.displayRecordsByName();
				break;		
			case 9:
				service.displayAllRecordsOfColName();			
				break;
			case 10:
				service.displayAllRecordsOfColNameAndSalary();			
				break;				
			case 11:
				service.closeConnection();
				System.exit(0);
			default:
				System.out.println("Invalid Choice");
			}

		}



	}

}
