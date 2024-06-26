package com.wipro.basics;

public class ArrayExample {
  
	 public static void main(String[] arr)
	 {
	
	int number[] = new int[5]; // array declaration and initialization
	
	int[] numbers1 = {23,45,56,77,89};
	
	//array is static in nature
	int[] product = {101,102,103,104,105}; // array declaration
	
	product = new int[5];
	
	int firstnumber = product[0]; // accessed the first element
	
	product[3] = 108; // changes the third element to a certain value
	
	int[] productid = {1,2,3,4,5};
	System.out.println("The total array length is : " + productid.length);
	//for(int i=0 ;i<productid.length;i++)
	for(int item:productid)
	{
		System.out.println(item);
		
	}
	
	
	 }
}
