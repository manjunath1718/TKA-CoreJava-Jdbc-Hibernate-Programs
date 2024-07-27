package com.tka.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.Scanner;


public class CollegeDAO {

	{	

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ims","root","root");

		} 
		catch (ClassNotFoundException e) {			
			e.printStackTrace();
		}
		catch (SQLException e) {		
			e.printStackTrace();
		}

	}

	Connection con;
	PreparedStatement preparedStmt;
	PreparedStatement preparedStmt1;
	ResultSet rs;
	Scanner sc=new Scanner(System.in);

	public void insertRecord()  {

		System.out.println("Enter College Id");
		int id=sc.nextInt();
		System.out.println("Enter College Name");
		String name=sc.next();

		try {
			preparedStmt=con.prepareStatement("INSERT into college values(?,?)");
			preparedStmt.setInt(1,id);
			preparedStmt.setString(2,name);

			preparedStmt.executeUpdate();
		} 
		catch (SQLException e) {

			e.printStackTrace();
		}

		System.out.println("Record inserted Successfully");

	}

	public void updateRecord() {

		System.out.println("Enter college Id");
		int id=sc.nextInt();
		System.out.println("Enter college name");
		String name=sc.next();
		try {
			preparedStmt=con.prepareStatement("UPDATE college set clgname=? where clgid=?");

			preparedStmt.setInt(2, id);
			preparedStmt.setString(1, name);	

			preparedStmt.executeUpdate();
		}
		catch (SQLException e) {

			e.printStackTrace();
		}

		System.out.println("Record updated Successfully");

	}

	public void deleteRecord()  {

		System.out.println("Enter college Id");
		int id=sc.nextInt();

		PreparedStatement preparedStmt;
		try {
			preparedStmt = con.prepareStatement("DELETE from college where clgid=?");
			preparedStmt.setInt(1, id);		
			preparedStmt.executeUpdate();
			System.out.println("Record deleted Successfully");
		}
		catch (SQLException e) {

			e.printStackTrace();
		}			
	}

	public void displayAllRecord()  {


		try {
			preparedStmt=con.prepareStatement("SELECT * from college");

			rs=preparedStmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public void displayRecordById()  {

		try {
			preparedStmt=con.prepareStatement("SELECT * from college where clgid=?");
			System.out.println("Enter college Id");
			int cId=sc.nextInt();
			preparedStmt.setInt(1,cId);
			rs=preparedStmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public void displayRecordByName() {


		try {
			preparedStmt=con.prepareStatement("SELECT * from college where clgname=?");
			System.out.println("Enter college name");
			String cName=sc.next();
			preparedStmt.setString(1,cName);
			rs=preparedStmt.executeQuery();
			while(rs.next()) {			
				System.out.println(rs.getInt(1)+" "+rs.getString(2));			
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	
	public void copyDataFrmTbl()  {

		try {
			
			preparedStmt1=con.prepareStatement("INSERT into college1 values(?,?)");
			
			preparedStmt=con.prepareStatement("SELECT * from college");
			rs=preparedStmt.executeQuery();
			while(rs.next()) {
				preparedStmt1.setInt(1, rs.getInt(1));
				preparedStmt1.setString(2, rs.getString(2)); 
				preparedStmt1.addBatch();
//				preparedStmt1.executeUpdate();
			}
			preparedStmt1.executeBatch();
			
		} catch (SQLException e) {

			e.printStackTrace();
		}

		System.out.println("Data copied from table Successful!");
	}


	public void close() {

		try {
			con.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}








}
