package com.tka.service;


import com.tka.dao.CollegeDAO;

public class Service {

	CollegeDAO clgDao;

	public Service(CollegeDAO clgDao) {

		this.clgDao = clgDao;
	}

	public Service() {

	}

	public void addCollegeName(){

		clgDao.addCollegeName();

	}

	public void displayCollegeNameByChar(){

		clgDao.displayCollegeNameByChar();

	}

	public void displayCollegeNameAscOrd(){

		clgDao.displayCollegeNameAscOrd();

	}

	public void displayAllCollegeName(){

		clgDao.displayAllCollegeName();

	}

}
