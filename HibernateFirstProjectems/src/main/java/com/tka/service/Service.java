package com.tka.service;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.tka.entity.Employee;

public class Service {

	SessionFactory sf=null;
	Session session=null;
	Transaction trans=null;
	Criteria criteria=null;
	Projection projection=null;
	Projection projection1=null;
	ProjectionList projectionList=null;

	{
		sf=new Configuration().configure().addAnnotatedClass(Employee.class)
				.buildSessionFactory();


	}

	Scanner sc=new Scanner(System.in);

	public void insertRecord(){

		session=sf.openSession();
		trans=session.beginTransaction();
		System.out.println("Enter employee Id");
		int id=sc.nextInt();
		System.out.println("Enter employee Name");
		String name=sc.next();
		System.out.println("Enter employee Salary");
		double salary=sc.nextDouble();

		session.save(new Employee(id,name,salary)) ;
		trans.commit();
		session.close();

		System.out.println("Record inserted successfully!");
	}

	public void updateRecord(){

		session=sf.openSession();
		trans=session.beginTransaction();
		System.out.println("Enter employee Id");
		int id=sc.nextInt();
		System.out.println("Enter employee Name");
		String name=sc.next();
		System.out.println("Enter employee Salary");
		double salary=sc.nextDouble();

		session.update(new Employee(id,name,salary));
		trans.commit();
		session.close();

		System.out.println("Record updated successfully!");

	}

	public void deleteRecord(){

		session=sf.openSession();
		trans=session.beginTransaction();

		System.out.println("Enter employee Id");
		int id=sc.nextInt();

		Employee emp=new Employee();
		emp.seteId(id);

		session.delete(emp);

		trans.commit();
		session.close();

		System.out.println("Record deleted successfully!");

	}

	public void saveOrUpdateRecord(){

		session=sf.openSession();
		trans=session.beginTransaction();
		System.out.println("Enter employee Id");
		int id=sc.nextInt();
		System.out.println("Enter employee Name");
		String name=sc.next();
		System.out.println("Enter employee Salary");
		double salary=sc.nextDouble();

		session.saveOrUpdate(new Employee(id,name,salary));
		trans.commit();
		session.close();

		System.out.println("Record Inserted Or Saved successfully!");

	}
	
	public void displayAllRecords(){

		session=sf.openSession();
		criteria=session.createCriteria(Employee.class);

		List<Employee> list=criteria.list();

		for(Employee e:list) {
			System.out.println(e);
		}
		session.close();
	}

	public void displayRecordById(){

		session=sf.openSession();
		System.out.println("Enter employee Id of Records you want");
		int id=sc.nextInt();

		Employee emp = session.load(Employee.class, id);

		System.out.println(emp);

		session.close();
	}

	

	public void displayRecordsById(){

		System.out.println("Enter Id");
		int id=sc.nextInt();
		session=sf.openSession();
		criteria=session.createCriteria(Employee.class);

		criteria.add(Restrictions.eq("eId", id));

		List<Employee> list=criteria.list();

		for(Employee e:list) {
			System.out.println(e);
		}
		session.close();
	}
	
	public void displayRecordsByName(){

		System.out.println("Enter Name");
		String name=sc.next();
		session=sf.openSession();
		criteria=session.createCriteria(Employee.class);

		criteria.add(Restrictions.eq("eName", name));

		List<Employee> list=criteria.list();

		for(Employee e:list) {
			System.out.println(e);
		}
		session.close();
	}

	public void displayAllRecordsOfColName(){


		session=sf.openSession();
		criteria=session.createCriteria(Employee.class);

		projection=Projections.property("eName");
		criteria.setProjection(projection);

		List<String> list=criteria.list();

		for(String name:list) {
			System.out.println(name);
		}
		session.close();
	}

	public void displayAllRecordsOfColNameAndSalary(){


		session=sf.openSession();
		criteria=session.createCriteria(Employee.class);

		projection=Projections.property("eName");
		projection1=Projections.property("eSalary");

		projectionList=Projections.projectionList();
		projectionList.add(projection);
		projectionList.add(projection1);

		criteria.setProjection(projectionList);

		//		List<Object[]> list=criteria.list();
		//
		//		for(Object[] obj:list) {
		//			for(Object nameAndSal:obj ) {
		//				
		//				System.out.println(nameAndSal.toString());
		//			}
		//			
		//		}

		List<Object[]> list=criteria.list();

		for(Object[] obj:list) {

				System.out.println(obj[0]+"----->"+obj[1]);
		}

		session.close();
	}


	

	public void closeConnection(){


		sf.close();

	}



}
