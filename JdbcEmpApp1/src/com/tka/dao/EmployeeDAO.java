package com.tka.dao;

import java.sql.*;
import java.util.Scanner;

public class EmployeeDAO {

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

		System.out.println("Enter Employee Id");
		int id=sc.nextInt();
		System.out.println("Enter Employee name");
		String name=sc.next();
		System.out.println("Enter Employee Salary");
		double salary=sc.nextInt();


		try {
			preparedStmt=con.prepareStatement("INSERT into Employee values(?,?,?)");
			preparedStmt.setInt(1,id);
			preparedStmt.setString(2,name);
			preparedStmt.setDouble(3,salary);

			preparedStmt.executeUpdate();
		} 
		catch (SQLException e) {

			e.printStackTrace();
		}
		System.out.println("Record inserted Successfully");

	}



	public void updateRecord() {

		System.out.println("Enter Employee Id");
		int id=sc.nextInt();
		System.out.println("Enter Employee name");
		String name=sc.next();
		System.out.println("Enter Employee salary");
		double salary=sc.nextDouble();

		try {
			preparedStmt=con.prepareStatement("UPDATE Employee set eName=?,eSalary=? where eId=?");

			preparedStmt.setInt(3, id);
			preparedStmt.setString(1, name);	
			preparedStmt.setDouble(2, salary);

			preparedStmt.executeUpdate();
		}
		catch (SQLException e) {

			e.printStackTrace();
		}

		System.out.println("Record updated Successfully");

	}

	public void deleteRecord()  {

		System.out.println("Enter Employee Id");
		int id=sc.nextInt();

		try {
			preparedStmt = con.prepareStatement("DELETE from employee where eId=?");
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
			preparedStmt=con.prepareStatement("SELECT * from Employee");
			rs=preparedStmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3));
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public void displayRecordById()  {

		try {
			preparedStmt=con.prepareStatement("select * from employee where eId=?");

			System.out.println("Enter Employee Id");
			int id=sc.nextInt();
			preparedStmt.setInt(1,id);
			rs=preparedStmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3));
			}
		} 
		catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public void displayRecordByName() {

		System.out.println("Enter Employee name");
		String name=sc.next();
		try {
			preparedStmt=con.prepareStatement("SELECT * from employee where eName=?");

			preparedStmt.setString(1,name);
			rs=preparedStmt.executeQuery();
			while(rs.next()) {			
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3));			
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public void displayRecordBySalary() {

		System.out.println("Enter product Price");
		double salary=sc.nextDouble();

		try {
			preparedStmt=con.prepareStatement("select * from employee where eSalary=?");

			preparedStmt.setDouble(1,salary);
			rs=preparedStmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3));
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}


	}


	public void copySrEmpDataFrmTbl()  {

		try {

			System.out.println("Enter Salary to Copy Emp Details Who having Salary greater than entered Salay");
			double sal = sc.nextDouble();

			preparedStmt1=con.prepareStatement("INSERT into emp_seniormgmt values(?,?,?)");

			preparedStmt=con.prepareStatement("SELECT * from employee where eSalary>?");
			preparedStmt.setDouble(1, sal);
			rs=preparedStmt.executeQuery();
			while(rs.next()) {
				preparedStmt1.setInt(1, rs.getInt(1));
				preparedStmt1.setString(2, rs.getString(2)); 
				preparedStmt1.setDouble(3, rs.getDouble(3));
				preparedStmt1.addBatch();
//				preparedStmt1.executeUpdate();
			}
			preparedStmt1.executeBatch();

		} catch (SQLException e) {

			System.out.println(e.getMessage());
		}

		System.out.println("Data copied from table Successful!");
	}

	public void copyMidLvlEmpDataFrmTbl()  {

		try {

			System.out.println("Enter Salary Range to Copy Emp Details Who having Salary in that Range");
			double minSal = sc.nextDouble();
			double maxSal = sc.nextDouble();

			preparedStmt1=con.prepareStatement("INSERT into emp_midmgmt values(?,?,?)");

			preparedStmt=con.prepareStatement("SELECT * from employee where eSalary between ? and ?");
			preparedStmt.setDouble(1, minSal);
			preparedStmt.setDouble(2, maxSal);
			rs=preparedStmt.executeQuery();
			while(rs.next()) {
				preparedStmt1.setInt(1, rs.getInt(1));
				preparedStmt1.setString(2, rs.getString(2)); 
				preparedStmt1.setDouble(3, rs.getDouble(3));
				preparedStmt1.addBatch();
//				preparedStmt1.executeUpdate();
			}
			preparedStmt1.executeBatch();

		} catch (SQLException e) {

			System.out.println(e.getMessage());
		}

		System.out.println("Data copied from table Successful!");

	}

	public void copyJrEmpDataFrmTbl()  {
		try {

			System.out.println("Enter Salary to Copy Emp Details Who having Salary less than entered Salay");
			double sal = sc.nextDouble();

			preparedStmt1=con.prepareStatement("INSERT into emp_juniormgmt values(?,?,?)");

			preparedStmt=con.prepareStatement("SELECT * from employee where eSalary<?");
			preparedStmt.setDouble(1, sal);
			rs=preparedStmt.executeQuery();
			while(rs.next()) {
				preparedStmt1.setInt(1, rs.getInt(1));
				preparedStmt1.setString(2, rs.getString(2)); 
				preparedStmt1.setDouble(3, rs.getDouble(3));
				preparedStmt1.addBatch();
//				preparedStmt1.executeUpdate();
			}
			preparedStmt1.executeBatch();

		} catch (SQLException e) {

			System.out.println(e.getMessage());
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
