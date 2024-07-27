package com.tka.client;

import java.util.Scanner;

import com.tka.controller.Controller;
import com.tka.dao.EntertainmentAppDAO;
import com.tka.service.Service;

public class Client {

	
	public static void main(String[] args) {

		Controller controller=new Controller();
		controller.setService(new Service(new EntertainmentAppDAO()));
		while(true) {
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("1:Press 1 to Add Movie");
			System.out.println("2:Press 2 to Display Movies According to your Preference of Character");
			System.out.println("3:Press 3 to Display Movies in Ascending Order");				
			System.out.println("4:Press 4 to Display  All Movies Names ");
			System.out.println("5:Press 5 to Add WebSeries");
			System.out.println("6:Press 6 to Display WebSeries According to your Preference of Character");
			System.out.println("7:Press 7 to Display WebSeries in Ascending Order");				
			System.out.println("8:Press 8 to Display  All WebSeries Names ");
			System.out.println("9:Press 9 to Display  All Shows Category Wise ");
			System.out.println("10:Press 10 to Exit");
			System.out.println("--------------------------------------------------------------------------------");
			Scanner sc=new Scanner(System.in);
			System.out.println("enter choice ");
			int choice=sc.nextInt();

			switch(choice) {
			case 1:				
				controller.addMovieName();		
				break;
			case 2:			
				controller.displayMovieNameByChar();					
				break;
			case 3:
				controller.displayMovieNameAscOrd();
				break;
			case 4:
				controller.displayAllMovieName();
				break;	
				
			case 5:				
				controller.addWebSeriesName();		
				break;
			case 6:			
				controller.displayWebSeriesNameByChar();			
				break;
			case 7:
				controller.displayWebSeriesNameAscOrd();
				break;
			case 8:
				controller.displayAllWebSeriesName();
				break;	
			case 9:
				controller.displayAllShowsCategoryWise();
				break;	
			case 10:
				System.exit(0);
			default:
				System.out.println("Invalid Choice");
			}

		}

		


	}

}
