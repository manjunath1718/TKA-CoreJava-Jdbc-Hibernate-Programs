package com.tka.controller;


import com.tka.service.Service;

public class Controller {

	Service service;

	public void setService(Service service) {
		this.service = service;
	}

	public void addCollegeName(){

		service.addCollegeName();

	}

	public void displayCollegeNameByChar(){

		service.displayCollegeNameByChar();

	}

	public void displayCollegeNameAscOrd(){

		service.displayCollegeNameAscOrd();

	}

	public void displayAllCollegeName(){

		service.displayAllCollegeName();

	}

}
