package com.tka.controller;


import com.tka.service.Service;

public class Controller {

	Service service;

	public void setService(Service service) {
		this.service = service;
	}

	public void insertRecord()  {

		service.insertRecord();
	}

	public void updateRecord()  {

		service.updateRecord();
	
	}

	public void deleteRecord()  {
	
		service.deleteRecord();
		
	}

	public void displayAllRecord() {

		service.displayAllRecord();
		
	}

	public void displayRecordById()  {
		
		service.displayRecordById();
		
	}

	public void displayRecordByName()  {
		
		service.displayRecordByName();
		
	}

	public void copyDataFrmTbl()  {

		service.copyDataFrmTbl();

	}

	public void close() {

		service.close();

	}
}
