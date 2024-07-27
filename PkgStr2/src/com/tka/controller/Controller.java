package com.tka.controller;


import com.tka.service.Service;

public class Controller {

	Service service;

	public void setService(Service service) {
		this.service = service;
	}

	public void addMovieName(){

		service.addMovieName();

	}

	public void displayMovieNameByChar(){

		service.displayMovieNameByChar();

	}

	public void displayMovieNameAscOrd(){

		service.displayMovieNameAscOrd();

	}

	public void displayAllMovieName(){

		service.displayAllMovieName();

	}


	public void addWebSeriesName(){

		service.addWebSeriesName();
	}

	public void displayWebSeriesNameByChar(){

		service.displayMovieNameByChar();
	}

	public void displayWebSeriesNameAscOrd(){

		service.displayMovieNameAscOrd();
	}

	public void displayAllWebSeriesName(){

		service.displayAllWebSeriesName();
		
	}

	public void displayAllShowsCategoryWise(){
		
		service.displayAllShowsCategoryWise();
	}
}
