package com.tka.client;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tka.entity.Employee;

public class ClientHQLsetParam {

	public static void main(String[] args) {
		SessionFactory sf=null;
		Session session=null;
				
		sf=new Configuration().configure().addAnnotatedClass(Employee.class)
				.buildSessionFactory();
		session=sf.openSession();
		
		
//		Query que = session.createQuery("from Employee where esalary>:sal");
//		que.setParameter("sal", 30000);
		
//		Query que = session.createQuery("from Employee where esalary between :sal1 and :sal2");
//		que.setParameter("sal1", 30000);
//		que.setParameter("sal2", 40000);
		
//		Query que = session.createQuery("from Employee where eName like :name ");
//		que.setParameter("name", "r%");
		
//		Query que = session.createQuery("from Employee where esalary>:sal and eName like :name ");
//		que.setParameter("sal", 30000);
//		que.setParameter("name", "r%");
		
		
//		 List<Employee> list = que.list();
//		 
//		 for(Employee e:list) {
//			 System.out.println(e);
//		 }
		 
		 Query<String> que = session.createQuery("select eName from Employee where eName like :name",String.class);
		 que.setParameter("name", "r%");
			
	     List<String> list = que.list();
			 
			 for(String name:list) {
				 System.out.println(name);
			 }

	}

}
