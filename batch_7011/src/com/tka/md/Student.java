package com.tka.md;

public class Student {
	
	String studentName;
	int studentId;
	double studentFees;
	public Student(String studentName, int studentId, double studentFees) {
		super();
		this.studentName = studentName;
		this.studentId = studentId;
		this.studentFees = studentFees;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public double getStudentFees() {
		return studentFees;
	}
	public void setStudentFees(double studentFees) {
		this.studentFees = studentFees;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentId=" + studentId + ", studentFees=" + studentFees
				+ "]";
	}
	
	

}
