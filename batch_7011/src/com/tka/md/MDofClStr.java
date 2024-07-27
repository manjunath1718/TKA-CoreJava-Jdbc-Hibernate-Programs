package com.tka.md;

import java.util.Scanner;

public class MDofClStr {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
	    String s;
		while(true) {
			System.out.println("-----------------------------------------------");
			System.out.println("1:Accept String");
			System.out.println("2:Display String");
			System.out.println("3:Compare String");
			System.out.println("4:To Find Index of Charcter in String");
			System.out.println("5:To Find Character at specific index position ");
			System.out.println("6:Press 6 to Exit");
			System.out.println("-----------------------------------------------");
			System.out.println("enter choice ");
			int choice=sc.nextInt();

			switch(choice) {
			case 1:
				System.out.println("Enter String");
				s=sc.next();
				ClsStr.AcceptStr(s);
				System.out.println("Successfully accepted String");
				break;
			case 2:
				ClsStr.DisplayStr();
				break;
			case 3:
				System.out.println("Enter String to Compare");
				String str=sc.next();
				ClsStr.compareStr(str);
				break;
			case 4:
				System.out.println("enter Charcter to be searched");
				char character=sc.next().charAt(0);
				ClsStr.indexOfChar(character);
				break;
			case 5:
				System.out.println("enter index position");
				int index=sc.nextInt();
				ClsStr.charAtPosition(index);
				break;
			case 6:
				System.exit(0);
			default:
				System.out.println("Invalid Choice");
			}

		}



	}

}
