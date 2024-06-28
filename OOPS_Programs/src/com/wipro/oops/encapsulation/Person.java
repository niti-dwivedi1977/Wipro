package com.wipro.oops.encapsulation;

import java.util.Scanner;

public class Person {

	public static void main(String[] ar)
	{
		
			Patient p = new Patient();
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your Name : ");
			String p_Name = sc.next();
			p.setName(p_Name);
			System.out.println("Enter your Age : ");
			int p_Age = sc.nextInt();
			p.setAge(p_Age);
			
			 System.out.println("Welcome To :" + p.getHospital_Name()); // Reading 
			 System.out.println("***********Patient Details***********");
			 System.out.println("Patient Name" + p_Name);
			 System.out.println("Patient Age" + p_Age);
		 
	}
}
