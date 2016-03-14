package com.ephesoft.timesheet.core.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="registration")
public class Registration {

	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String dob;
	private String contactNo;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstrName() {
		return firstName;
	}

	public void setFirstrName(String firstrName) {
		this.firstName = firstrName;
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

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

}
