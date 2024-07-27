package com.tka;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class ProductDao {

	public static int updateRecord() {


		Connection con = null;
		PreparedStatement preparedStmt;
		ResultSet rs;
		Scanner sc=new Scanner(System.in);
		int rowsAffected = 0;
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");


			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ims","root","root");


			System.out.println("Enter product Id");
			int id=sc.nextInt();
			System.out.println("Enter product name");
			String name=sc.next();
			System.out.println("Enter product Price");
			double price=sc.nextDouble();


			preparedStmt=con.prepareStatement("UPDATE product set pName=?,pPrice=? where pId=?");

			preparedStmt.setInt(3, id);
			preparedStmt.setString(1, name);	
			preparedStmt.setDouble(2, price);

			rowsAffected=preparedStmt.executeUpdate();
		}
		catch (SQLException e) {

			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}

		return rowsAffected;
	}

	public static void main(String[] args) {

		
		int rUpdated=ProductDao.updateRecord();

		if(rUpdated!=0) {
			System.out.println("record updated");
		}else {
			System.out.println("record not updated");
		}
	}

}
