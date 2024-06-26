package com.wipro.basics;

import java.util.Scanner;

public class StudInfo {
	
	// data members ( variables and methods)
	
	//member variables // attributes
	
	//primitive types
	String Name;
	int RollNo;
	String  StdSec;
	static String username;
	static String pass;
    // non parameterized    

	public StudInfo() {
		
	
	}



    //Parameterized constructor
	public StudInfo(String name, int rollNo, String stdSec) {
		
		Name = name;
		RollNo = rollNo;
		StdSec = stdSec;
	}
	
	//Input the student details
	//for no. of steps you want perform we need a method for 
	//that so that you can no. of times

    void input()
    {
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("Enter you name");
    	this.Name = sc.next();
    	
    	System.out.println("Enter you roll no");
    	
    	this.RollNo= sc.nextInt();
    	
    	System.out.println("Enter you section");
    	
    	this.StdSec = sc.next();
    	
    }

    void display()
    
    {
    	
    	System.out.println("**** Student Info *****");
    	System.out.println("Student Name :" + Name + " " + "Student Roll No. :" + RollNo + "Student Section :" + StdSec);
    	
    }
    
    void login()
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter your user name");
		 username = sc.next();
		System.out.println("Enter your password");
		 pass = sc.next();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// basically we need to create an object of class
		//obj -- reference type
		// default constructor
		StudInfo  obj = new  StudInfo();  //compiler 			
// Check if your username is admin and password is admin
		Scanner sc = new Scanner(System.in);
		
// to check the equality of two string values then we use equals method
	// equals() , hashcode(), toString()
		
		obj.login();
		if(username.equalsIgnoreCase("admin") && pass.equalsIgnoreCase("admin"))
		{
		while (true) {  
			System.out.println("Hello" + username + "you have successfully logged in");
			System.out.println("Write Menu : enter your choice ");
			System.out.println("1 : for input ");
			System.out.println("2 : for display ");
			System.out.println("0 : for exit ");
			int choice = sc.nextInt();
			
			switch (choice) {
			case 1:
			obj.input();
			break;			
			case 2:
			obj.display();
			break;
			default:
			System.out.println("Wrong key");
			System.exit(0);
				}

			}
		
	}
		else 
		{ System.out.println("Sorry either you have entered a wrong user name or password");
		}
		}

}

//Syntax : -

//Wap to take the employee details like empname , empdesign, empsalary
// Hr will take the input and then display all the data
