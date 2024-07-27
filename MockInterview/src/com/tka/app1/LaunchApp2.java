package com.tka.app1;

public class LaunchApp2 {
	

	
	public static void main(String[] args) {
		
		String s1="0the000aca0de00my00ys";
		
		StringBuffer sb=new StringBuffer();
		
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)=='0') {
				sb.append(s1.charAt(i));
			}
			
		}
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)!='0') {
				sb.append(s1.charAt(i));
			}
			
		}
		
		System.out.println(sb);
		
		

	}
	
}
