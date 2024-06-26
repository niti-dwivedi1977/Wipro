package com.wipro.basics;

public class Student {
	
	// data members ( variables and methods)
	
	//member variables // attributes
	
	//primitive types
	String Name;
	int RollNo;
	String  StdSec;
	
	
	Student()
	{
		System.out.println(this.Name);
		System.out.println(this.RollNo);
		System.out.println(this.StdSec);
		
	}
	//constructor
	//constructor and class name must be the same 
	//Constructor is used to initialize the values to the attributes of a class
	
	Student(String name ,int rollno, String stdsec )
	{
		//this keyword is used to resolve the ambiguity between the 
		// class variable and local variable , it also points to the object of current class
		this.Name = name;
		this.RollNo = rollno;
		this.StdSec = stdsec;
		
		System.out.println(name);
		System.out.println(rollno);
		System.out.println(stdsec);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// basically we need to create an object of class
		//obj -- reference type
		// no args constructor
		Student  obj = new  Student();
		//args based constructor
		//each object represent as an entity which has its own behaviour or identity 
		Student  obj2 = new  Student("Preeti",102,"XIA");
		Student  obj3 = new  Student("Niti",102,"XIA");

	}

}

//Syntax : - 
