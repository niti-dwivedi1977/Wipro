package com.wipro.basics;

import java.util.Scanner;

public class ArrayExample3 {
  
	 public static void main(String[] arr)
	 {
	  
		 Scanner s  = new Scanner(System.in);
	
		 System.out.println("Enter the size or length of an Array");
		int arrLength = s.nextInt();
		
		int[] anArray = new int[arrLength]; 
		
		System.out.println("Enter the array elements");
		for(int i=0 ; i<arrLength ; i++)
		{
			//taking input in an array
			anArray[i]= s.nextInt();
			
		}
		
		System.out.println("Elements of one dimensional array are: ");
		for (int i= 0 ; i<arrLength ; i++)
		{
			
			System.out.println(anArray[i] + " ");
		}
	
	 }
}
