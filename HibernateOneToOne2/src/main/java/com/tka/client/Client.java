package com.tka.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tka.entity.Blood;
import com.tka.entity.Person;

public class Client {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().addAnnotatedClass(Person.class)
				.addAnnotatedClass(Blood.class).buildSessionFactory();

		Session session = sf.openSession();

		Transaction transaction = session.beginTransaction();

		Person p1=new Person("Raj");

		Blood b1=new Blood("A", '+');
		p1.setBlood(b1);

		Person p2=new Person("Ram");

		Blood b2=new Blood("B", '-');
		p2.setBlood(b2);
		
		Person p3=new Person("Raghu");
		p3.setBlood(b1);

		session.save(p1);
		session.save(p2);
		session.save(p3);
		
		transaction.commit();
		session.close();

	}

}
