package com.ITSupport;

import java.util.Scanner;

public class Department{
	String deptName;
//	Department(){
//		this.deptName=getDepartment();
//	}
	
	String getDepartment() {
		String departmentName = null;
		Scanner in = new Scanner(System.in);
		int option;
		System.out.println("Please enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		option = in.nextInt();
		
		switch (option) {
		case 1:
			departmentName="Technical";
			break;
		case 2:
			departmentName="Admin";
			break;
		case 3:
			departmentName="Human Resource";
			break;
		case 4:
			departmentName="Legal";
			break;
		default:
			departmentName=null;
			
		}
		in.close();
		return departmentName;
	}
}
