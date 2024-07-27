package com.tka.map;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class SearchStd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Map<Integer,String> map=new TreeMap<Integer,String>();
		
		map.put(1, "raj");
		map.put(2, "ram");
		map.put(3, "rahul");
		map.put(4, "ajay");
		map.put(5, "vijay");
		
		
		for(Entry<Integer, String> mp: map.entrySet()) {
			System.out.print(mp.getKey()+" : ");
			System.out.print(mp.getValue());
			System.out.println();
		}
		System.out.println("Enter roll number to be searched");
		int rno=sc.nextInt();
		if(map.containsKey(rno)) {
			System.out.println("Student found");
			System.out.println("Student Name is " +map.get(rno));
		}
		else {
			System.out.println("Student not found");
		}

	}

}
