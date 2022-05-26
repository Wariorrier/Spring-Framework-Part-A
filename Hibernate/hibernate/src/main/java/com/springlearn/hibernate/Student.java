package com.springlearn.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	
	@Id
	@Column(name="ID", unique=true, nullable=false)
	String ID;
	@Column(name="First_Name")
	String firstName;
	@Column(name="Last_Name")
	String lastName;
	@Column(name="Email")
	String email;
	
	public Student() {
		super();
	}

	public Student(String iD, String firstName, String lastName, String email) {
		super();
		ID = iD;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student [ID=" + ID + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
