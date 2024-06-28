package com.wipro.collection;

import java.util.*;


class Student
{
	
String name;
int cl;
int rollno;
@Override
public String toString() {
	return "Student [name=" + name + ", cl=" + cl + ", rollno=" + rollno + "]";
}

}

public class LinkedListDemo {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//We want to create a list of 10 students
		
	List al = new ArrayList();
		
	LinkedList<Student> listofstudent = new LinkedList<>();
		
		al.add(10);
		al.add("Collection Example");
		al.add(new Student());
		al.add(0,20);
		System.out.println(al);
		

	
		List l = new LinkedList();
		
		//Type Safety in generic 
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.add(10);
		//list.add("Collection Example");
	//	list.add(new Student());
		list.add(0,20);
	//	list.addAll(al);
	//	System.out.println(list);
		
		//convert list into arraylist
	//	ArrayList arraylist = new ArrayList(list);
		
	//	System.out.println(list);
		
	  //System.out.println(  list.remove();
	 //   list.remove(2);
	 //   list.removeFirstOccurrence(10);// in duplicacy you can use it
	 //   list.removeAll(list);
	    
	//    list.addLast("10");
		
		System.out.println(list.size());
		System.out.println(list.isEmpty());
	    
	  Iterator itr = list.iterator();
	  
	  while(itr.hasNext()) // verify if there is any further data or not
	  {
		  
		  System.out.println("Element :" + itr.next()); // fetches the data
		  
	  }
	  
	  //In Collections class sort is the static  method
	  Collections.sort(list); 
	  System.out.println("After Sorting " +list);
		
	//	System.out.println("After Removing the elements :" + list);
		
	}
	

}
