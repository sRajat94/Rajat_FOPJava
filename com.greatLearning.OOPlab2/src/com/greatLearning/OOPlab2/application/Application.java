package com.greatLearning.OOPlab2.application;

import java.util.Scanner;

import com.greatLearning.OOPlab2.model.Employee;
import com.greatLearning.OOPlab2.service.CredentialServices;

public class Application {
	public static void main(String args[])
	{
		Employee employee = new Employee("Rajat","Sirohi");
		CredentialServices cs = new CredentialServices();
		String generatedEmail;
	    String generatedPassword;//char[] generatedPassword;
	    System.out.println("Please enter the department from the following ");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		switch(input)
		{
		case 1: {
			generatedEmail = cs.generateEmailAddress(employee.getFirstName(), employee.getLastName(), "tech");
			generatedPassword = cs.generatePassword();
			cs.showCredentials(employee, generatedEmail, generatedPassword);
			break;
		}
		case 2: {
			generatedEmail = cs.generateEmailAddress(employee.getFirstName(), employee.getLastName(), "adm");
			generatedPassword = cs.generatePassword();
			cs.showCredentials(employee, generatedEmail, generatedPassword);
			break;
		}
		case 3:{
			generatedEmail = cs.generateEmailAddress(employee.getFirstName(), employee.getLastName(), "HR");
			generatedPassword = cs.generatePassword();
			cs.showCredentials(employee, generatedEmail, generatedPassword);
			break;
		}
		case 4:{
			generatedEmail = cs.generateEmailAddress(employee.getFirstName(), employee.getLastName(), "legal");
			generatedPassword = cs.generatePassword();
			cs.showCredentials(employee, generatedEmail, generatedPassword);
			break;

		}
	}
		sc.close();

		

		
	}

}
