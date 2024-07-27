package com.tka.client;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tka.entity.Faculty;
import com.tka.entity.Subject;

public class Client {

	public static void main(String[] args) {

		SessionFactory sf = new Configuration().configure().addAnnotatedClass(Faculty.class)
				.addAnnotatedClass(Subject.class).buildSessionFactory();

		Session session = sf.openSession();

		Transaction transaction = session.beginTransaction();

//		Faculty f1=new Faculty("MeghanaMam");
//
//		List<Subject> subjectsOfF1=new ArrayList<>();
//		subjectsOfF1.add(new Subject("CoreJava"));
//		subjectsOfF1.add(new Subject("AdvJava"));
//		subjectsOfF1.add(new Subject("SQL"));
//		f1.setSubjects(subjectsOfF1);
//		
//		session.persist(f1);
		

		Faculty f2=new Faculty("PratikshaMam");

		List<Subject> subjectsOfF2=new ArrayList<>();
		subjectsOfF2.add(new Subject("CoreJava"));
		subjectsOfF2.add(new Subject("SQL"));
		f2.setSubjects(subjectsOfF2);
		
		session.save(f2);
		

		transaction.commit();
		session.close();

	}

}
