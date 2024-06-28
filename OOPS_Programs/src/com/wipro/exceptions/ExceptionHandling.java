package com.wipro.exceptions;

class Student extends Exception
{
String getStudentName()
{
	return null;
	

}

}



public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		int result = 10/5;
		String str = "Niti";
		String[] arrL = null;
		
		int arr[] = {3,5,6,7,8};
		int length = str.length();
		System.out.println(length);
		
		
		Student s = new Student();

		s.getStudentName();
		}
		
		catch(ArithmeticException e )
		{
		
		System.out.println("OOPS There is some issue with the code :" + e.getMessage());
		
		}
		catch(ArrayIndexOutOfBoundsException e1 )
		{
		

			System.out.println("OOPS There is some issue with the code :" + e1.getMessage());
			}
		
		catch(Exception e3)
		{
			
			System.out.println("OOPS There is some issue with the code :" + e3.getMessage());
		}
		
		finally
		{
			System.out.println("Finally program got executed");
			
		}
	}
	
	

}
