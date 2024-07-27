package com.tka.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.tka.entity.Product;

public class ProductDAO implements DAO {

	{	

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

		} catch (ClassNotFoundException e) {			
			e.printStackTrace();
		}
//		try {
//			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ims","root","root");
		} catch (SQLException e) {		
			e.printStackTrace();
		}

	}

	ArrayList<Product> plist=new ArrayList<Product>();

	Connection con;
	PreparedStatement preparedStmt;
	ResultSet rs;
	Scanner sc=new Scanner(System.in);


	public void insertRecord()  {

		System.out.println("Enter product Id");
		int id=sc.nextInt();
		System.out.println("Enter product name");
		String name=sc.next();
		System.out.println("Enter product Price");
		double price=sc.nextInt();


		try {
			preparedStmt=con.prepareStatement("INSERT into product values(?,?,?)");
			preparedStmt.setInt(1,id);
			preparedStmt.setString(2,name);
			preparedStmt.setDouble(3,price);

			preparedStmt.executeUpdate();
		} 
		catch (SQLException e) {

			e.printStackTrace();
		}


		plist.add(new Product(id,name,price));

		System.out.println("Record inserted Successfully");

	}


	public void updateRecord() {

		System.out.println("Enter product Id");
		int id=sc.nextInt();
		System.out.println("Enter product name");
		String name=sc.next();
		System.out.println("Enter product Price");
		double price=sc.nextDouble();

		try {
			preparedStmt=con.prepareStatement("update product set pName=?,pPrice=? where pId=?");

			preparedStmt.setInt(3, id);
			preparedStmt.setString(1, name);	
			preparedStmt.setDouble(2, price);

			preparedStmt.executeUpdate();
		}
		catch (SQLException e) {

			e.printStackTrace();
		}

		for(int i=0;i<plist.size();i++) {
			if(plist.get(i).getpId()==id) {
				plist.get(i).setpName(name);
				plist.get(i).setpPrice(price);
			}
		}
		System.out.println("Record updated Successfully");

	}

	public void deleteRecord()  {

		System.out.println("Enter course Id");
		int id=sc.nextInt();

		try {
			preparedStmt = con.prepareStatement("delete from product where pId=?");
			preparedStmt.setInt(1, id);		
			preparedStmt.executeUpdate();
			System.out.println("Record deleted Successfully");
		}
		catch (SQLException e) {

			e.printStackTrace();
		}			

		for(int i=0;i<plist.size();i++) {
			if(plist.get(i).getpId()==id) {
				plist.remove(i);
			}
		}


	}

	public void displayAllRecord()  {

		for(int i=0;i<plist.size();i++) {			
			System.out.println(plist.get(i));
		}		
		//		preparedStmt=con.prepareStatement("select * from product");
		//		rs=preparedStmt.executeQuery();
		//		while(rs.next()) {
		//			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getDouble(4));
		//		}
	}

	public void displayRecordById()  {
		System.out.println("Enter product Id");
		int id=sc.nextInt();
		for(int i=0;i<plist.size();i++) {
			if(plist.get(i).getpId()==id) {
				System.out.println(plist.get(i));
			}
		}

		//		preparedStmt=con.prepareStatement("select * from product where pId=?");
		//		System.out.println("Enter product Id");
		//		int pId=sc.nextInt();
		//		preparedStmt.setInt(1,pId);
		//		rs=preparedStmt.executeQuery();
		//		while(rs.next()) {
		//			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getDouble(4));
		//		}
	}

	public void displayRecordByName() {
		System.out.println("Enter product name");
		String name=sc.next();
		for(int i=0;i<plist.size();i++) {
			if(plist.get(i).getpName().equalsIgnoreCase(name)) {
				System.out.println(plist.get(i));
			}
		}

		//		preparedStmt=con.prepareStatement("select * from product where pName=?");
		//		System.out.println("Enter product name");
		//		String pName=sc.next();
		//		preparedStmt.setString(1,pName);
		//		rs=preparedStmt.executeQuery();
		//		while(rs.next()) {			
		//			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getDouble(4));			
		//		}
	}

	public void displayRecordByPrice() {

		System.out.println("Enter product Price");
		Double price=sc.nextDouble();
		for(int i=0;i<plist.size();i++) {
			if(plist.get(i).getpPrice().equals(price)) {
				System.out.println(plist.get(i));
			}
		}
		//		preparedStmt=con.prepareStatement("select * from product where pPrice=?");
		//		System.out.println("Enter product Price");
		//		double price=sc.nextDouble();
		//		preparedStmt.setDouble(1,price);
		//		rs=preparedStmt.executeQuery();
		//		while(rs.next()) {
		//			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getDouble(4));
		//		}
	}

	public void close() {

		try {
			con.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}



}
