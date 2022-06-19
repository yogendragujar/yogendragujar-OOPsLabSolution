package com.labsolution.service;

import java.util.Random;

import com.labsolution.model.Employee;
/*
 * generatePassword
 * generateEmailAddress
 * showCredentials
 */
public class CredentialService extends Employee{

	CredentialService(String firstName, String lastName) {
		super(firstName, lastName);
	}

	void showCredentials(String deptName) {
		System.out.println("Dear "+firstName+" your generated credentials are as follows");
		System.out.println("Email Address: "+generateEmailAddress(super.firstName, super.lastName, deptName));
		System.out.println("Password: "+generatePassword());
	}
	
	String generateEmailAddress(String firstName,String lastName, String deptName) {
		String mailAddress = null;
		mailAddress = firstName+lastName+"@"+deptName.toLowerCase().replaceAll(" ", "")+".abc.com";
		return mailAddress;
	}
	
	String generatePassword() {
		String password=null;
		StringBuilder sbPass = new StringBuilder();
		char [] passArray = new char [8];
		char rCharacter = ' ';
		for(int i=0;i<8;i++) {
			switch (i) {
				case 0:
					rCharacter=getRandCharacter(65,91);
//					System.out.println(getRandNum(65,91));
					passArray[i] = rCharacter;
//					sbPass.append(rCharacter); //upper case character
					break;
				case 2:
					rCharacter=getRandCharacter(48,58);
					passArray[i] = rCharacter;
//					sbPass.append(rCharacter); //number character
					break;
				case 4:
					rCharacter = getRandCharacter(58,65);
					passArray[i] = rCharacter;
//					sbPass.append(rCharacter); //special character
					break;
				case 6:
					rCharacter = getRandCharacter(97,123);
					passArray[i] = rCharacter;
//					sbPass.append(rCharacter); //special character
					break;
				default:
					rCharacter = getRandCharacter(48,123);
					passArray[i] = rCharacter;
//					sbPass.append(rCharacter); //any character
			}
		}
//		password = sbPass.toString();
		password = String.valueOf(passArray);
		return password;
	}
	
	static char getRandCharacter(int min, int max) {
		char randCharacter = ' ';
		Random rand = new Random();
//		int num = min + rand.nextInt(max);
		int num = rand.nextInt(max - min) + min;
		randCharacter = (char) num;
		return randCharacter;
	}
	
	
	
}
