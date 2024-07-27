package com.tka.service;


import com.tka.dao.EntertainmentAppDAO;

public class Service {

	EntertainmentAppDAO ntrtnmntAppDao;

	public Service(EntertainmentAppDAO ntrtnmntAppDaogDao) {

		this.ntrtnmntAppDao = ntrtnmntAppDaogDao;
	}

	public Service() {

	}

	public void addMovieName(){

		ntrtnmntAppDao.addMovieName();

	}

	public void displayMovieNameByChar(){

		ntrtnmntAppDao.displayMovieNameByChar();

	}

	public void displayMovieNameAscOrd(){

		ntrtnmntAppDao.displayMovieNameAscOrd();

	}

	public void displayAllMovieName(){

		ntrtnmntAppDao.displayAllMovieName();

	}

	
	
	public void addWebSeriesName(){

		ntrtnmntAppDao.addWebSeriesName();
	}

	public void displayWebSeriesNameByChar(){

		ntrtnmntAppDao.displayMovieNameByChar();
	}

	public void displayWebSeriesNameAscOrd(){

		ntrtnmntAppDao.displayMovieNameAscOrd();
	}

	public void displayAllWebSeriesName(){

		ntrtnmntAppDao.displayAllWebSeriesName();
		

	}

	public void displayAllShowsCategoryWise(){

		
		ntrtnmntAppDao.displayAllShowsCategoryWise();
	}
		
		
}
