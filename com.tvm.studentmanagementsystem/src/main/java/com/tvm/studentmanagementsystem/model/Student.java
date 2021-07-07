package com.tvm.studentmanagementsystem.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private long studentId;
	private String studentName;
	private String studentEmail;
	private int studentPhoneno;
	public long getStudentId() {
		return studentId;
	}
	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentEmail() {
		return studentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}
	public int getStudentPhoneno() {
		return studentPhoneno;
	}
	public void setStudentPhoneno(int studentPhoneno) {
		this.studentPhoneno = studentPhoneno;
	}
	
		
	
	

}
