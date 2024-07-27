package com.tka.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


@Entity
public class Company {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	int cId;
	
	String cName;
	
	String founder;
	
	String headQuarters;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="cId")
	List<Branch> branches;
	
	public Company() {
		
	}
	public Company(String cName, String founder, String headQuarters) {
		
		this.cName = cName;
		this.founder = founder;
		this.headQuarters = headQuarters;
	}
	public Company(int cId, String cName, String founder, String headQuarters) {
		
		this.cId = cId;
		this.cName = cName;
		this.founder = founder;
		this.headQuarters = headQuarters;
	}
	public Company(int cId, String cName, String founder, String headQuarters, List<Branch> branches) {
		
		this.cId = cId;
		this.cName = cName;
		this.founder = founder;
		this.headQuarters = headQuarters;
		this.branches = branches;
	}
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getFounder() {
		return founder;
	}
	public void setFounder(String founder) {
		this.founder = founder;
	}
	public String getHeadQuarters() {
		return headQuarters;
	}
	public void setHeadQuarters(String headQuarters) {
		this.headQuarters = headQuarters;
	}
	public List<Branch> getBranches() {
		return branches;
	}
	public void setBranches(List<Branch> branches) {
		this.branches = branches;
	}
	@Override
	public String toString() {
		return "Company [cId=" + cId + ", cName=" + cName + ", founder=" + founder + ", headQuarters=" + headQuarters
				+ ", branches=" + branches + "]";
	}
	
	

}
