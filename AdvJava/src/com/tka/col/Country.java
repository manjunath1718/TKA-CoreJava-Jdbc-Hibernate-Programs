package com.tka.col;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Country {

	public static void main(String[] args) {
		
		ArrayList<String> alKA=new ArrayList<>();
		alKA.add("Bengaluru");
		alKA.add("Mysore");
		alKA.add("Belagavi");
		
		ArrayList<String> alAP=new ArrayList<>();
		alAP.add("Amaravati");
		alAP.add("Vizag");
		alAP.add("Vijaywada");
		
		HashMap<String,ArrayList<String>> hmInd=new HashMap<>();
		hmInd.put("Karnataka", alKA);
		hmInd.put("AndraPradesh", alAP);
		
		
		
		
		ArrayList<String> altx=new ArrayList<>();
		altx.add("Houston");
		altx.add("Dallas");
		altx.add("austin");
		
		ArrayList<String> alflrd=new ArrayList<>();
		alflrd.add("Miami");
		alflrd.add("Orlando");
		alflrd.add("Tampa");
		
		HashMap<String,ArrayList<String>> hmUSA=new HashMap<>();
		hmUSA.put("Texas", altx);
		hmUSA.put("Florida", alflrd);
				
		HashMap<String,HashMap<String,ArrayList<String>>> countries=new HashMap<>();
		countries.put("India", hmInd);	
		countries.put("USA", hmUSA);
		System.out.println(countries);
		
		
		Set<Entry<String, HashMap<String, ArrayList<String>>>> setCountries = countries.entrySet();
		for(Entry<String, HashMap<String, ArrayList<String>>> country:setCountries) {
			System.out.println("Country->"+country.getKey());
			HashMap<String, ArrayList<String>> states = country.getValue();
			for(Entry<String, ArrayList<String>> state: states.entrySet()) {
				System.out.println("State->"+state.getKey());
				System.out.print("Cites->");
				ArrayList<String> cities = state.getValue();
				for(String city:cities) {
					System.out.print(city+" ");
				}
				System.out.println();
			}
		}
		
		System.out.println("*******************************************");
		
		for(Entry<String, HashMap<String, ArrayList<String>>> country:countries.entrySet()) {
			System.out.println("Country->"+country.getKey());
			for(Entry<String, ArrayList<String>> state: country.getValue().entrySet()) {
				System.out.println("State->"+state.getKey());
				System.out.print("Cites->");
				for(String city:state.getValue()) {
					System.out.print(city+" ");
				}
				System.out.println();
			}
		}
		
		
		
		

	}

}
