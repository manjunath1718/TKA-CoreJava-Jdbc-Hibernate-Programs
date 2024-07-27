package com.tka.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tka.entity.EmpTblCreate;
import com.tka.entity.Employee;

public class ClientEmpTblCreate {

	public static void main(String[] args) {
		
		Configuration config=new Configuration();
		config.configure();
		config.addAnnotatedClass(EmpTblCreate.class);
		
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
		EmpTblCreate emp=new EmpTblCreate(1, "raj", 10000);
		session.persist(emp);
		trans.commit();
		session.close();
		
	}

}
