package com.rahul.api1.entities;

import java.util.Date;

public class Students {
	
	private int studId;
	private String studName;
	private String studClass;
	private int studRollNo;
	private Date studDOB;
	
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Students(int studId, String studName, String studClass, int studRollNo, Date studDOB) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.studClass = studClass;
		this.studRollNo = studRollNo;
		this.studDOB = studDOB;
	}

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public String getStudClass() {
		return studClass;
	}

	public void setStudClass(String studClass) {
		this.studClass = studClass;
	}

	public int getStudRollNo() {
		return studRollNo;
	}

	public void setStudRollNo(int studRollNo) {
		this.studRollNo = studRollNo;
	}

	public Date getStudDOB() {
		return studDOB;
	}

	public void setStudDOB(Date studDOB) {
		this.studDOB = studDOB;
	}

	@Override
	public String toString() {
		return "Students [studId=" + studId + ", studName=" + studName + ", studClass="
				+ studClass + ", studRollNo=" + studRollNo + ", studDOB=" + studDOB + "]";
	}
	
	
}
