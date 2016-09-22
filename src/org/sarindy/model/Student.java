package org.sarindy.model;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.Max;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.sarindy.Tu13.IsValidHobbiesAnotation;


public class Student {

	@Pattern(regexp="[^0-9]*") //This mean this name not to allow number and those sign
	@Size(max=10)
	private String studentName;
	
	@Size(min=2,max=5) //this will got the message from the properties file.
	@IsValidHobbiesAnotation//This com from 2 classes in HobbyValidator.java and IsValidHobbiesAnotation.java
	private String studentHobbies;
	
	@Max(222)//Number can not be greater than 222
	private long studentMobile;
	
	
	@Past //The date can not future
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
