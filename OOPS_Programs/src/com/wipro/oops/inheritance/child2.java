package com.wipro.oops.inheritance;

class Parent {
	
	public String name;
	protected int height;
	public int weight;

	
      public  Parent() {
    	  System.out.println("Parent class constructor");
	}
	
	 private Parent(int a , int b) {
		 
		System.out.println("Value of a & b :"+ a + "," + b);
	}
	
//	void eat()
//	{
//		
//		System.out.println("Parent eats food");
//	}

  
  
}

 class Child1 extends Parent
{
	public String name;
	public int weight;
	
	Child1()
	{
		
		  System.out.println("Child1 class constructor");
	}

	
  
}

public class child2 extends Child1
{
	child2()
	{
		
		  System.out.println("Child2 class constructor");
	}
	
	public static void main(String[] args)
	{
		child2 p1 = new child2();
	
	}
	
}

