package com.wipro.basics;

public class ControlStatement1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//to declare a variable for switch expression
		int day=5;
		
		switch (day)
		{
		case 1:
			System.out.println("Day 1: Monday");
			break;
		case 2:
			System.out.println("Day 2: Tuesday");
			break;
		case 3:
			System.out.println("Day 3: Wednesday");
			break;
			
		case 4:
			System.out.println("Day 4: Thursday");
			break;
			
		default:
			System.out.println("Sorry Wrong choice");
			break;
		}
				
	}

}
