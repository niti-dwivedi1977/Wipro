package com.wipro.basics;

public class ControlStatement2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year=2 , semester =2;
		
		switch(year)
		{
		case 1:
			switch(semester)
			{case 1:
				System.out.println("Total semester passed : 1");
				break;
			case 2:
				System.out.println("Total semester passed : 2");
				
			}
			
			break;
		case 2:
			switch(semester)
			{case 1:
				System.out.println("Total semester passed : 3");
				break;
			case 2:
				System.out.println("Total semester passed : 4");
				
			}
			
		case 3:
			switch(semester)
			{case 1:
				System.out.println("Total semester passed : 5");
				break;
			case 2:
				System.out.println("Total semester passed : 6");
				break;
			}
			break;
			
		case 4:
			switch(semester)
			{case 1:
				System.out.println("Total semester passed : 7");
				break;
			case 2:
				System.out.println("Total semester passed : 8");
				break;
			}
			break;
			
		default:
			System.out.println("Sorry Wrong choice");
			break;
		
		}
	}

}
