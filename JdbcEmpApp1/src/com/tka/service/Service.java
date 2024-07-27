package com.tka.service;

import com.tka.dao.EmployeeDAO;

public class Service {

	EmployeeDAO dao;

	public Service(EmployeeDAO dao) {

		this.dao = dao;
	}
	
	public Service() {

	}
	
	public void setDao(EmployeeDAO dao) {
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

	public void displayRecordBySalary()  {

		dao.displayRecordBySalary();

	}

	public void copySrEmpDataFrmTbl()  {

		dao.copySrEmpDataFrmTbl();

	}

	public void copyMidLvlEmpDataFrmTbl() {

		dao.copyMidLvlEmpDataFrmTbl();

	}
	
	public void copyJrEmpDataFrmTbl() {

		dao.copyJrEmpDataFrmTbl();

	}
	public void close() {

		dao.close();

	}


}
