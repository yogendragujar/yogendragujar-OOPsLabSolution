package com.labsolution.service;

import java.util.Scanner;

import com.labsolution.model.Department;

public class MainClassITSupport {

	public static void main(String[] args) {
		String strFirstName, strLastName; 
		Scanner scInput = new Scanner(System.in);
		
		System.out.println("Please provide your first name: ");
		strFirstName = scInput.next();
		
		System.out.println("Please provide your last name: ");
		strLastName = scInput.next();
		
		if(strFirstName.length() > 0 && strLastName.length() > 0) {
			Department dept = new Department();
			String deptName = dept.getDepartment();
			if(!deptName.equals("Invalid Department")) {
				CredentialService cs = new CredentialService(strFirstName, strLastName);
				cs.showCredentials(deptName);
			}else {
				System.out.println("Invalid input for department, exiting program");
			}
		}
	}
}
