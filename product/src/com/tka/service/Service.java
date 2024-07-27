package com.tka.service;

import com.tka.dao.DAO;

public class Service {
	
	DAO dao;
	
	public void setDao(DAO dao) {
		this.dao = dao;
	}


	public void insertRecord()  {

		dao.insertRecord();
	}


	public void updateRecord()  {

		dao.updateRecord();
	
	}

	public void deleteRecord()  {
	
		dao.deleteRecord();
		
	}

	public void displayAllRecord() {

		dao.displayAllRecord();
		
	}

	public void displayRecordById()  {
		
		dao.displayRecordById();
		
	}

	public void displayRecordByName()  {
		
		dao.displayRecordByName();
		
	}

	public void displayRecordByPrice() {

		dao.displayRecordByPrice();
	
	}
	
	public void close() {
		
		dao.close();
		
	}
	
	
}
