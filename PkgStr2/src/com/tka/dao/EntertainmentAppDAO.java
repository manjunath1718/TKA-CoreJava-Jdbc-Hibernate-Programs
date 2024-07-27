package com.tka.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class EntertainmentAppDAO {

	ArrayList<String> alMV=new ArrayList<>();
	ArrayList<String> alWS=new ArrayList<>();
	HashMap<String, ArrayList<String>> hm= new HashMap<>();
	Scanner sc=new Scanner(System.in);

	public void addMovieName(){

		System.out.println("Enter Movie Name");
		String str=sc.nextLine();
		alMV.add(str);
	}

	public void displayMovieNameByChar(){

		System.out.println("Enter Char to display Movie names starting with that character");
		char str=sc.nextLine().charAt(0);
		for(String s: alMV) {
			if(s.substring(0, 1).equalsIgnoreCase(str+"") ) {
				System.out.println(s);
			}
		}
	}

	public void displayMovieNameAscOrd(){

		//		Collections.sort(alist);
		alMV.sort((o1,o2)->o1.compareToIgnoreCase(o2));
		for(String s: alMV) {
			System.out.println(s);

		}
	}

	public void displayAllMovieName(){

		for(String s: alMV) {
			System.out.println(s);

		}

	}

	public void addWebSeriesName(){

		System.out.println("Enter WebSeries Name");
		String str=sc.nextLine();
		alWS.add(str);
	}

	public void displayWebSeriesNameByChar(){

		System.out.println("Enter Char to display WebSeries starts with that character");
		char str=sc.nextLine().charAt(0);
		for(String s: alWS) {
			if(s.substring(0, 1).equalsIgnoreCase(str+"") ) {
				System.out.println(s);
			}
		}
	}

	public void displayWebSeriesNameAscOrd(){

		//		Collections.sort(alist);
		alWS.sort((o1,o2)->o1.compareToIgnoreCase(o2));
		for(String s: alMV) {
			System.out.println(s);

		}
	}

	public void displayAllWebSeriesName(){

		for(String s: alWS) {
			System.out.println(s);

		}

	}

	public void displayAllShowsCategoryWise(){

		if(hm.isEmpty()) {
			if(!alMV.isEmpty()) {
				hm.put("MOVIES", alMV);
			}else {
				System.out.println("We don't have any movie right now to display");
			}
			if(!alWS.isEmpty()) {
				hm.put("WEB-SERIES", alWS);
			}else {
				System.out.println("We don't have any webseries right now to display");
			}
			
			
		}
		else {
			hm.clear();
			if(!alMV.isEmpty()) {
				hm.put("MOVIES", alMV);
			}else {
				System.out.println("We don't have any movie in our app to display");
			}
			if(!alWS.isEmpty()) {
				hm.put("WEB-SERIES", alWS);
			}else {
				System.out.println("We don't have any webseries in our app to display");
			}
		}
		
		for(Entry<String,ArrayList<String>> shows:hm.entrySet()) {
			System.out.println(shows.getKey());
			if(!shows.getValue().isEmpty()) {
				for(String s:shows.getValue()) {
					System.out.println(" -"+s);
				}
			}else {
				System.out.println("No shows are there in "+shows.getKey()+"category");
			}
			
		}
		
		

	}





}
