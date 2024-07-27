package com.tka.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tka.entity.Accident;
import com.tka.entity.Car;


public class Client {

	public static void main(String[] args) {

		SessionFactory sf = new Configuration().configure().addAnnotatedClass(Car.class)
				.addAnnotatedClass(Accident.class).buildSessionFactory();

		Session session = sf.openSession();

		Transaction transaction = session.beginTransaction();

		
		Car car1=new Car("MG");
		
		Accident acc1=new Accident("pune");

		car1.setA(acc1);

		session.save(car1);
		
		

		transaction.commit();
		session.close();

	}

}
