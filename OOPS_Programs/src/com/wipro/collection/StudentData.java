package com.wipro.collection;

import java.util.HashMap;
import java.util.Scanner;

public class StudentData {

	public static void main(String[] args) {
		
		HashMap<Integer , String> mapStudent = new HashMap<>();
		
		boolean loopContinue = true;
		
		Scanner scan = new Scanner(System.in);
		
		do
		{
			System.out.println("Enter the student id : ");
			Integer idNumber = scan.nextInt();
			
			
			System.out.println("Enter the student name : ");
			String name = scan.next();
			
			mapStudent.put(idNumber, name);
			
		/*	if(oldValue!=null)
			{
				System.out.println("Student Id Number: " + idNumber + "is " + oldValue + " and has been overwritten by " + name);
				
			}*/
			
			System.out.println("Do you want to add another student (Y/N) ? ");
			String answer = scan.next();
			
			if(answer.equals("y") || answer.equals("Y")) {
				
				continue;
			}else {
				
				break;
			}
			
			
		}
		while(loopContinue);
		scan.close();
		

		
		System.out.println("\n*************************");
		System.out.println("The following students are entered in a collection :");
		System.out.println("ID Number :" +  "   Name");
		for(int id : mapStudent.keySet())
		{
			
			System.out.println("  " + id +  "    " + mapStudent.get(id));
		}
	}

}
