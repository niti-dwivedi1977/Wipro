package com.wipro.oops.encapsulation;

import java.util.Scanner;


//POJO Class , Bean Class
//Data Hiding
public class Patient implements Hospital, Admin{

	private String name;
	private int age;
	private String Hospital_Name="Birla Hospital Management System";
	
	//getter & setter 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age> 0) {
		this.age = age;
		} else {
			System.out.println("Age cannot be negative or Zero");
		}
		
		
		
	}
	public String getHospital_Name() {
		return Hospital_Name;
	}
	
	
	

	 
	
}
