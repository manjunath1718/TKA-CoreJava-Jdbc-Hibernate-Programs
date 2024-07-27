package com.tka.jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.tka.jdbc.Faculty;

public class Course {
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
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sms","root","root");
		} catch (SQLException e) {		
			e.printStackTrace();
		}

	}

	public void insertRecord() throws SQLException {

		System.out.println("Enter course Id");
		int id=sc.nextInt();
		System.out.println("Enter course name");
		String name=sc.next();
		System.out.println("Enter course Fees");
		int fee=sc.nextInt();


		preparedStmt=con.prepareStatement("INSERT into course values(?,?,?)");
		preparedStmt.setInt(1,id);
		preparedStmt.setString(2,name);
		preparedStmt.setInt(3,fee);
		preparedStmt.executeUpdate();

		System.out.println("Record inserted Successfully");

	}

	public void displayRecord() throws SQLException {

		preparedStmt=con.prepareStatement("select * from course");
		rs=preparedStmt.executeQuery();
		while(rs.next()) {

			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));

		}


	}
	public void updateRecord() throws SQLException {

		System.out.println("Enter course Id");
		int id=sc.nextInt();		
		System.out.println("Enter course Fees");
		int fee=sc.nextInt();
		preparedStmt=con.prepareStatement("update course set coursefees=? where courseId=?");
		preparedStmt.setInt(2, id);
		preparedStmt.setInt(1, fee);		
		preparedStmt.executeUpdate();

		System.out.println("Record updated Successfully");

	}
	public void deleteRecord() throws SQLException {

		System.out.println("Enter course Id");
		int id=sc.nextInt();

		PreparedStatement preparedStmt=con.prepareStatement("delete from course where courseId=?");			
		preparedStmt.setInt(1, id);		
		preparedStmt.executeUpdate();

		System.out.println("Record deleted Successfully");

	}
	public void displayRecordByCourse() throws SQLException {

		preparedStmt=con.prepareStatement("select * from course where coursename=?");
		System.out.println("Enter course name");
		String cName=sc.next();
		preparedStmt.setString(1,cName);
		rs=preparedStmt.executeQuery();
		while(rs.next()) {
			
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));	
			
		}

	}


}
