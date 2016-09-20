package org.sarindy.model;

import java.util.Date;
import java.util.List;

public class Student {

	private String studentName;
	private String studentHobbies;
	private long studentMobile;
	private Date studentDOB;
	private List<String> studentSkill;

	private Address address;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentHobbies() {
		return studentHobbies;
	}

	public void setStudentHobbies(String studentHobbies) {
		this.studentHobbies = studentHobbies;
	}

	public List<String> getStudentSkill() {
		return studentSkill;
	}

	public void setStudentSkill(List<String> studentSkill) {
		this.studentSkill = studentSkill;
	}

	public Date getStudentDOB() {
		return studentDOB;
	}

	public void setStudentDOB(Date studentDOB) {
		this.studentDOB = studentDOB;
	}

	public long getStudentMobile() {
		return studentMobile;
	}

	public void setStudentMobile(long studentMobile) {
		this.studentMobile = studentMobile;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
