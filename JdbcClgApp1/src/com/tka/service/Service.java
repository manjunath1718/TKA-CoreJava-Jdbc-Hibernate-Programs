package com.tka.service;

import java.sql.SQLException;

import com.tka.dao.CollegeDAO;

public class Service {
	
	CollegeDAO dao;
	
	public Service(CollegeDAO dao) {
		
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

	public void copyDataFrmTbl()  {

		dao.copyDataFrmTbl();

	}
	
	public void close() {
		
		dao.close();
		
	}
	
	
}
