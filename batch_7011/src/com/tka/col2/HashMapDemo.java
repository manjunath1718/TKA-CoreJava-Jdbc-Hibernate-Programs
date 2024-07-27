package com.tka.col2;

import java.util.HashMap;
import java.util.Map.*;



public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<Integer,Double> h=new HashMap<Integer,Double>();
		
		h.put(1, 1.1);
		h.put(2, 2.2);
		h.put(3, 3.3);
		h.put(4, 4.4);
		h.put(5, 5.5);
		
		System.out.println(h);
		
		for(Entry<Integer, Double> mp:h.entrySet()) {
			System.out.print(mp.getKey()+" ");
			System.out.print(mp.getValue()+" ");
			System.out.println();
		}
		
//		for(int mp:h.entrySet()) {
//			System.out.print(mp.getKey()+" ");
//			System.out.print(mp.getValue()+" ");
//			System.out.println();
//		}
		
	}

}
