package com.tka.col;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;


public class IPL {

	public static void main(String[] args) {

		ArrayList<Integer> alOfKKR =new ArrayList<>();
		alOfKKR.add(14);
		alOfKKR.add(10);
		alOfKKR.add(4);

		ArrayList<Integer> alOfRCB =new ArrayList<>();
		alOfRCB.add(14);
		alOfRCB.add(7);
		alOfRCB.add(7);

		ArrayList<Integer> alOfCSK =new ArrayList<>();
		alOfCSK.add(14);
		alOfCSK.add(6);
		alOfCSK.add(8);

		HashMap<String,ArrayList<Integer>> hmIPL=new HashMap<>();
		hmIPL.put("KKR", alOfKKR);
		hmIPL.put("RCB", alOfRCB);
		hmIPL.put("CSK", alOfCSK);

		System.out.println(hmIPL);


		ArrayList<Integer> alOfTKR =new ArrayList<>();
		alOfTKR.add(14);
		alOfTKR.add(10);
		alOfTKR.add(4);

		ArrayList<Integer> alOfGAW =new ArrayList<>();
		alOfGAW.add(14);
		alOfGAW.add(7);
		alOfGAW.add(7);

		ArrayList<Integer> alOfJT =new ArrayList<>();
		alOfJT.add(14);
		alOfJT.add(6);
		alOfJT.add(8);

		HashMap<String,ArrayList<Integer>> hmCPL=new HashMap<>();
		hmCPL.put("TKR", alOfKKR);
		hmCPL.put("GAW", alOfRCB);
		hmCPL.put("JAM", alOfCSK);

		System.out.println(hmCPL);
		
		HashMap<String,HashMap<String,ArrayList<Integer>> > premierLeagues=new HashMap<>();
		premierLeagues.put("IPL", hmIPL);
		premierLeagues.put("CPL", hmCPL);

		System.out.println("***************************************************************");

		for(Entry<String, HashMap<String, ArrayList<Integer>>> pl:premierLeagues.entrySet()) {
			System.out.println(pl.getKey());
			for(Entry<String, ArrayList<Integer>> plteams:pl.getValue().entrySet()) {
				System.out.print(plteams.getKey()+"    ");	
				for(Integer i:plteams.getValue()) {
					System.out.print(i+"  ");
				}
				System.out.println();
			}
			System.out.println("********************************");
		}



	}

}
