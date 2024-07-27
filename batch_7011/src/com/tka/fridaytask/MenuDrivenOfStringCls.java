package com.tka.fridaytask;

import java.util.Scanner;

public class MenuDrivenOfStringCls {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String s = null;
		char[] c;
		int vowels=0;
		while(true) {
			System.out.println("----------------------------------------------");
			System.out.println("1:Accept String");
			System.out.println("2:Display Count of Vowels in String");
			System.out.println("3:Display Count of Numberss in String");
			System.out.println("4:Display Count of Consonants in String");
			System.out.println("5:Display Count of Symbols ");
			System.out.println("6:Press 6 to Exit");
			System.out.println("---------------------------------------------");
			System.out.println("Enter choice");
			int choice=sc.nextInt();
			switch(choice) {

			case 1:
				System.out.println("Enter Anything as String");
				s=sc.next();
				System.out.println("Accepted String Successfully");
				break;

			case 2:
				s=s.toLowerCase();
				c=s.toCharArray();
				int countVowels=0;
				for(int i=0;i<c.length;i++) {
					if(c[i]=='a' || c[i]=='e' || c[i]=='i' || c[i]=='o' || c[i]=='u') {
						countVowels++;
					}
				}
				System.out.println("Total number of vowels "+countVowels);
				break;

			case 3:	
				s=s.toLowerCase();
				c=s.toCharArray();
				int countNos=0;
				for(int i=0;i<c.length;i++) {
					if(c[i]=='1' || c[i]=='2' || c[i]=='3' || c[i]=='4' || c[i]=='5'||
							c[i]=='6' ||c[i]=='7' ||c[i]=='8' ||c[i]=='9' || c[i]=='0') {
						countNos++;
					}
				}
				System.out.println("Total number of digitss "+countNos);		

				break;

			case 4:
				s=s.toLowerCase();
				c=s.toCharArray();
				int countConSymb=0;
				int countSymb=0;
				for(int i=0;i<c.length;i++) {
					if(c[i]!='a' && c[i]!='e' && c[i]!='i' && c[i]!='o' && c[i]!='u'
							&& !Character.isDigit(c[i]) ) {
						countConSymb++;
					}
					if(!Character.isDigit(c[i]) && !Character.isAlphabetic(c[i]) ) {
						countSymb++;
					}
				}
				int countConsonants=countConSymb-countSymb;
				System.out.println("Total number of consonants "+countConsonants);
				break;

			case 5:
				s=s.toLowerCase();
				c=s.toCharArray();
				int countSymbols=0;
				for(int i=0;i<c.length;i++) {
					if(!Character.isDigit(c[i]) && !Character.isAlphabetic(c[i]) ) {
						countSymbols++;
					}
				}
				System.out.println("Total number of Symbols "+countSymbols);
                break;
			case 6: 
				System.exit(0);
				
			default:
				System.out.println("Invalid choice");
			}
		}

	}

}
