package com.tka.fileio;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteReadData {

	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter File Name");
		String fileName=sc.next();
		
		
		FileWriter fw=new FileWriter(fileName);
		
		System.out.println("Enter Data");
		fw.write(sc.next());
		fw.write(sc.nextLine());
		
		fw.close();
		
		FileReader fr=new FileReader(fileName);
		int x;		
		while((x=fr.read())!=-1) {
			System.out.print((char)x);
			
		}
		

	}

}
