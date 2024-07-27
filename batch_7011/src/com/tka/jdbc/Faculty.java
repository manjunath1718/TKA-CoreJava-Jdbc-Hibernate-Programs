package com.tka.jdbc;

public class Faculty {

	int fId;
	String fName;
	public Faculty() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Faculty(int fId, String fName) {
		super();
		this.fId = fId;
		this.fName = fName;
	}
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
	@Override
	public String toString() {
		return "Faculty [fId=" + fId + ", fName=" + fName + "]";
	}
	
	
}
