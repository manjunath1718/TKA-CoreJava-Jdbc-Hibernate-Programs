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
public class Faculty {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int fId;
	
	String fName;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "fId")
	List<Subject> subjects;

	public int getfId() {
		return fId;
	}

	public void setfId(int fId) {
		this.fId = fId;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public List<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}

	public Faculty() {
		
	}

	public Faculty(String fName) {
		
		this.fName = fName;
	}

	public Faculty(int fId, String fName) {
		
		this.fId = fId;
		this.fName = fName;
	}

	@Override
	public String toString() {
		return "Faculty [fId=" + fId + ", fName=" + fName + ", subjects=" + subjects + "]";
	}
	

	
	

}
