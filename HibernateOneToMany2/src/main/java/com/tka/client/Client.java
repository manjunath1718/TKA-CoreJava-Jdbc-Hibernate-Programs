package com.tka.client;

import java.util.ArrayList;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tka.entity.Branch;
import com.tka.entity.Company;


public class Client {

	public static void main(String[] args) {

		SessionFactory sf = new Configuration().configure().addAnnotatedClass(Branch.class)
				.addAnnotatedClass(Company.class).buildSessionFactory();

		Session session = sf.openSession();

		Transaction transaction = session.beginTransaction();


		Company c1=new Company("Infosys", "NarayanMurthy", "Bengaluru");

		ArrayList<Branch> branchesOfC1=new ArrayList<>();
		branchesOfC1.add(new Branch("MysoreBranch", "Mysore"));
		branchesOfC1.add(new Branch("PuneBranch", "Mysore"));
		branchesOfC1.add(new Branch("HYBBranch", "Hyderabad"));

		c1.setBranches(branchesOfC1);

		Company c2=new Company("JBK", "KiranDigrase", "Pune");

		ArrayList<Branch> branchesOfC2=new ArrayList<>();
		branchesOfC2.add(new Branch("Deccan", "Pune"));
		branchesOfC2.add(new Branch("Chinchwad", "Pune"));
		branchesOfC2.add(new Branch("Warje", "Pune"));

		c2.setBranches(branchesOfC2);

		session.save(c1);
		session.save(c2);

		transaction.commit();
		session.close();

	}



}
