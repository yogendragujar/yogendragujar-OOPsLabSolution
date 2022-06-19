package com.labsolution.model;

public class Employee {
	protected String firstName;
	protected String lastName;
	
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
	
	protected Employee(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}
}
