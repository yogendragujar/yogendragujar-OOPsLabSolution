package com.ITSupport;

public class MainClassITSupport {

	public static void main(String[] args) {
		Department dept = new Department();
		String deptName = dept.getDepartment();
		CredentialService cs = new CredentialService("yogendra", "gujar");
		cs.showCredentials(deptName);
	}

	
}
