package com.tksa.doubt;

public class Str {

	public static void main(String[] args) {
	
		String s1="java";		
		String s2="java";
		
//		System.out.println(s1=s2);
//		System.out.println(s1.equals(s2));
		
//		char [] c=s2.toCharArray();
//		for(int i=0;i<c.length;i++) {
//			System.out.print(c[i]+" ");
//		}
		
		char [] c= {'j','a','v'};
		String str=new String(c);
		System.out.println(str);

	}

}
