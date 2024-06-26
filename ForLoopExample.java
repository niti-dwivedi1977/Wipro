package com.wipro.basics;

public class ForLoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
	/*	System.out.println("Counting from 10 to 1 ");
		for (int i=10 ; i>=1 ; i--)
		{
			
			System.out.println("at position : " + i + " : niti" );
		}*/
		
/*	 for(int i=0 , j=10 ; i<j ; i++ , j--)
	 {
		 System.out.println("i : " + i + " , j: " + j);
	 }*/
		
		
    // how to declare an array  -  collection of similar data types:
		
		int a[] = {10 ,20,30 ,40 ,50};
		
		// for each loop 
		
		for(int i=0; i < a.length ; i++)
		
	  //  for(int num : a)
		{
			System.out.println("The value at index no : " + i + " is : " + a[i]);
			  
		}
		
		
		
	} 
		


}
