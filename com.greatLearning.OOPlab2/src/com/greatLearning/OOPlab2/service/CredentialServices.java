package com.greatLearning.OOPlab2.service;

import java.util.Random;

import com.greatLearning.OOPlab2.model.Employee;

public class CredentialServices {

		public String generatePassword() {
			String caps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			String lowerCaps = "abcdefghijklmnopqrstuvxyz";
			String specialCharacters = "!@#$%^&*()_+";
			String number = "0123456789";
			String newString = caps+lowerCaps+specialCharacters+number;
			Random random= new Random();
			char [] password= new char[8];
			for(int i=0; i<8; i++)
			{
				password[i]=newString.charAt(random.nextInt(newString.length()));
			}
			return new String(password);
			
		}
		public String generateEmailAddress(String firstName, String lastName, String string) {
			
			return firstName+lastName+"@"+string+".greatLearning.com";
		}
		public void showCredentials(Employee emp, String email,String password) {
			System.out.println("Dear "+emp.getFirstName()+" your generated credentials are as follows: ");
			System.out.println("Email   --->"+email);
			System.out.println("Password   --->"+password);
		}
	

	
}
