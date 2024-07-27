package com.tka.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tka.entity.EmpIdGen;


public class ClientEmpIDGen {

	public static void main(String[] args) {
		
		Configuration config=new Configuration();
		config.configure();
		config.addAnnotatedClass(EmpIdGen.class);
		
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
		EmpIdGen emp1=new EmpIdGen("raj", 10000);
		EmpIdGen emp2=new EmpIdGen("ram", 20000);
		session.persist(emp1);
		session.persist(emp2);
		trans.commit();
		session.close();

	}

}
