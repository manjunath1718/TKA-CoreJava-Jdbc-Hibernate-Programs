package com.tka.col2;

public class Student {
	
	Integer studentId;
	String studentName;
    Double studentFees;
    
	public Student(Integer studentId, String studentName, Double studentFees) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentFees = studentFees;
	}
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Double getStudentFees() {
		return studentFees;
	}
	public void setStudentFees(Double studentFees) {
		this.studentFees = studentFees;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentFees=" + studentFees
				+ "]";
	}
	
    
}
