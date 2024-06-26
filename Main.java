package com.wipro.basics;

import java.util.Scanner;


class Students {
    
	Scanner sc = new Scanner(System.in);
     Students[] student;

     	String name ;
     	int age;
	
	   Students()
	   {
		   
	   }
		public Students(String name, int age) {
				this.name = name;
				this.age = age;
	}

		void add()
		{
		System.out.println("Enter no. of student details you want to add");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		     student = new Students[size];
			for (int i=0; i<size ; i++)
			{
				System.out.println("Enter details for student " + (i+1) + ":");
				
				System.out.println("Enter Student Name :");
				String name = sc.next();
				
				System.out.println("Enter Student Age:");
				int age = sc.nextInt();
				
				student[i] = new Students(name , age);
			}
		}
		
		void display()

		{
			
		System.out.println("Student details you have entered are given : ");
		for(Students s: student)
		{
			System.out.println(s.name + " his age is :" + s.age);
			
		}
		}
}

public class Main
{
	static Students stud ;

	public static void main(String[] arr)
	 {
		stud = new Students();
		
		while (true) {  
			
			System.out.println("Write Menu : enter your choice ");
			System.out.println("1 : for add student details ");
			System.out.println("2 : for display student details");
			System.out.println("0 : for exit ");
			
		
		Scanner sc = new Scanner(System.in);
		int choice =  sc.nextInt();
		switch(choice)
		{
		   case 1:
			stud.add();
			
		   case 2:
			 stud.display();
		}
		
		
		}
	 }}
		
		
		 
	 

