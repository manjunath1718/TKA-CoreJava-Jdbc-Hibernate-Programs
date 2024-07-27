package com.tka.dao;

public interface DAO {

	public void insertRecord();

	public void updateRecord();

	public void deleteRecord();

	public void displayAllRecord();

	public void displayRecordById();

	public void displayRecordByName();

	public void displayRecordByPrice();
	
	public void close();

}
