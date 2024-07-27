package com.tka.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Service {

	ArrayList<Product> plist=new ArrayList<Product>();
	
	Connection con;
	PreparedStatement preparedStmt;
	ResultSet rs;
	Scanner sc=new Scanner(System.in);
	{	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {			
			e.printStackTrace();
		}

		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ims","root","root");
		} catch (SQLException e) {		
			e.printStackTrace();
		}

	}

	public void insertRecord() throws SQLException {

		System.out.println("Enter product Id");
		int id=sc.nextInt();
		System.out.println("Enter product name");
		String name=sc.next();
		System.out.println("Enter product catogery");
		String category=sc.next();
		System.out.println("Enter product Price");
		double price=sc.nextInt();

		preparedStmt=con.prepareStatement("INSERT into product values(?,?,?,?)");
		preparedStmt.setInt(1,id);
		preparedStmt.setString(2,name);
		preparedStmt.setString(3,category);
		preparedStmt.setDouble(4,price);
		preparedStmt.executeUpdate();
		
		plist.add(new Product(id,name,category,price));

		System.out.println("Record inserted Successfully");

	}

	
	public void updateRecord() throws SQLException {

		System.out.println("Enter product Id");
		int id=sc.nextInt();
		System.out.println("Enter product name");
		String name=sc.next();
		System.out.println("Enter product catogery");
		String category=sc.next();
		System.out.println("Enter product Price");
		double price=sc.nextDouble();
		preparedStmt=con.prepareStatement("update product set pName=?,pPrice=?,pCategory=? where pId=?");
		preparedStmt.setInt(4, id);
		preparedStmt.setString(1, name);	
		preparedStmt.setDouble(2, price);
		preparedStmt.setString(3, category);
		preparedStmt.executeUpdate();

		
		for(int i=0;i<plist.size();i++) {
			if(plist.get(i).getpId()==id) {
				plist.get(i).setpName(name);
				plist.get(i).setpCatogery(category);
				plist.get(i).setpPrice(price);
			}
		}
		System.out.println("Record updated Successfully");

	}
	
	public void deleteRecord() throws SQLException {

		System.out.println("Enter course Id");
		int id=sc.nextInt();

		PreparedStatement preparedStmt=con.prepareStatement("delete from product where pId=?");			
		preparedStmt.setInt(1, id);		
		preparedStmt.executeUpdate();
		
		
		for(int i=0;i<plist.size();i++) {
			if(plist.get(i).getpId()==id) {
				plist.remove(i);
			}
		}
		System.out.println("Record deleted Successfully");

	}
	
	public void displayAllRecord() throws SQLException {

		for(int i=0;i<plist.size();i++) {			
				System.out.println(plist.get(i));
		}		
//		preparedStmt=con.prepareStatement("select * from product");
//		rs=preparedStmt.executeQuery();
//		while(rs.next()) {
//			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getDouble(4));
//		}
	}
	
	public void displayRecordById() throws SQLException {
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
	
	public void displayRecordByName() throws SQLException {
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
	
	public void displayRecordByPrice() throws SQLException {

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
	
	public void displayRecordByCategory() throws SQLException {

		System.out.println("Enter product Category");
		String category=sc.next();
		for(int i=0;i<plist.size();i++) {
			if(plist.get(i).getpCatogery().equalsIgnoreCase(category)) {
				System.out.println(plist.get(i));
			}
		}
//		preparedStmt=con.prepareStatement("select * from product where pCategory=?");
//		System.out.println("Enter product Category");
//		String category=sc.next();
//		preparedStmt.setString(1,category);
//		rs=preparedStmt.executeQuery();
//		while(rs.next()) {	
//			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getDouble(4));			
//		}

	}

}
