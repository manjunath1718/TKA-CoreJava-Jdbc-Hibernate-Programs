package com.tka.col;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;


public class EntertainmentApps {

	public static void main(String[] args) {


		ArrayList<String> alMVOfPV=new ArrayList<>();
		alMVOfPV.add("KGF");
		alMVOfPV.add("Kantara");
		alMVOfPV.add("Lucia");
		alMVOfPV.add("Eaga");

		ArrayList<String> alWSOfPV=new ArrayList<>();
		alWSOfPV.add("Panchayat");
		alWSOfPV.add("Mirzapur");
		alWSOfPV.add("FamilyMan");
		alWSOfPV.add("HIMYM");

		ArrayList<String> alCTOfPV=new ArrayList<>();
		alCTOfPV.add("Mr.Bean");
		alCTOfPV.add("KungFuPanda");
		alCTOfPV.add("BossBaby");

		HashMap<String ,ArrayList<String>> hmPV=new HashMap<>();
		hmPV.put("Movies", alMVOfPV);
		hmPV.put("WebSeries", alWSOfPV);
		hmPV.put("Cartoons", alCTOfPV);

		//======================================================================		
		ArrayList<String> alMVOfNF=new ArrayList<>();
		alMVOfNF.add("RRR");
		alMVOfNF.add("HIT");
		alMVOfNF.add("VATHI");
		alMVOfNF.add("Jersy");
		ArrayList<String> alTVSOfNF=new ArrayList<>();
		alTVSOfNF.add("FRIENDS");
		alTVSOfNF.add("Breaking Bad");
		alTVSOfNF.add("MoneyHeist");
		alTVSOfNF.add("Squid Games");
		

		ArrayList<String> alCTOfNF=new ArrayList<>();
		alCTOfNF.add("Jurassic Park");
		alCTOfNF.add("KingKong");
		alCTOfNF.add("StuartLittle");


		HashMap<String ,ArrayList<String>> hmNF=new HashMap<>();
		hmNF.put("Movies", alMVOfNF);
		hmNF.put("TVSHOWS", alTVSOfNF);
		hmNF.put("Cartoons", alCTOfNF);

		HashMap<String,HashMap<String ,ArrayList<String>>> hmapps=new HashMap<>();
		hmapps.put("NETFLIX", hmNF);
		hmapps.put("PRIMEVIDEO", hmPV);
		System.out.println(hmapps);

		for(Entry<String, HashMap<String, ArrayList<String>>> apps:hmapps.entrySet()) {

			System.out.println(apps.getKey());
			for(Entry<String, ArrayList<String>> categories : apps.getValue().entrySet()) {
				
				System.out.println(" *"+categories.getKey());
				for(String s:categories.getValue()) {
					System.out.println("  -"+s);
				}
			}
			
		}

	}


}
