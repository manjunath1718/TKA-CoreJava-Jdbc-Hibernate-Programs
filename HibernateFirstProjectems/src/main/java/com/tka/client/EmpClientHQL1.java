package com.tka.client;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.tka.entity.Employee;

public class EmpClientHQL1 {

	public static void main(String[] args) {
		
		SessionFactory sf=null;
		Session session=null;
				
		sf=new Configuration().configure().addAnnotatedClass(Employee.class)
				.buildSessionFactory();
		session=sf.openSession();
		
		
//		Query que = session.createQuery("from Employee");
//		
//		 List<Employee> list = que.list();
//		 
//		 for(Employee e:list) {
//			 System.out.println(e);
//		 }
		
//		Query que = session.createQuery("SELECT eName from Employee");		
//		 List<String> names = que.list();		 
//		 for(String name:names) {
//			 System.out.println(name);
//		 }
		 
//		Query que = session.createQuery("from Employee where eSalary>25000");		
//		 List<Employee> list = que.list();		 
//		 for(Employee e:list) {
//			 System.out.println(e);
//		 }
		
//		Query que = session.createQuery("SELECT eName from Employee where eSalary>25000");		
//		List<String> names = que.list();		 
//		 for(String name:names) {
//			 System.out.println(name);
//		 }
		
//		Query que = session.createQuery("from Employee where eSalary>:sal");		
//		que.setParameter("sal", 30000.0);
//		 List<Employee> list = que.list();		 
//		 for(Employee e:list) {
//			 System.out.println(e);
//		 }
		 
		 Query que = session.createQuery("from Employee order by eSalary DESC");		
		 List<Employee> list = que.list();		 
		 for(Employee e:list) {
			 System.out.println(e);
		 }

		
		
	}

}
