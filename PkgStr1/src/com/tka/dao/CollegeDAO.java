package com.tka.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CollegeDAO {

	ArrayList<String> alist=new ArrayList<>();
	Scanner sc=new Scanner(System.in);

	public void addCollegeName(){

		System.out.println("Enter College Name");
		String str=sc.nextLine();
		alist.add(str);
	}

	public void displayCollegeNameByChar(){

		System.out.println("Enter 2 Char to display clg names starting with those characters");
		String str=sc.next();
		for(String s: alist) {
			if(s.substring(0, 1).equalsIgnoreCase(str.charAt(0)+"") || s.substring(0, 1).equalsIgnoreCase(str.charAt(1)+"")) {
				System.out.println(s);
			}
		}
	}

	public void displayCollegeNameAscOrd(){

//		Collections.sort(alist);
		alist.sort((o1,o2)->o1.compareToIgnoreCase(o2));
		for(String s: alist) {
			System.out.println(s);

		}
	}

	public void displayAllCollegeName(){

		for(String s: alist) {
			System.out.println(s);

		}

	}



}
