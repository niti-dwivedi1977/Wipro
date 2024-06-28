package com.wipro.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {

		
	//	Set hs = new HashSet();
		
		// hashset doesnot store duplicate items hashcode()
	TreeSet<Integer> hs = new TreeSet<>();
	
		hs.add(1001);
		hs.add(300);
		hs.add(1012);
		hs.add(325);
		hs.add(325);
		hs.add(1234);
		hs.add(5678);
		hs.add(10034);
		hs.add(1897);
		hs.add(2367);
		hs.add(2890);
		Iterator itr = hs.iterator();
		
		while(itr.hasNext())
		{
			
			System.out.println("Iterator data : "+ itr.next() + "\t Hash code" + hs.hashCode());
		}
		
		
		TreeSet<Integer> hs1 = new TreeSet<>();
		hs1.add(500);
		hs1.add(400);
		hs1.add(600);
		
		System.out.println("Tree Set -2 :");
		Iterator itr1 = hs1.iterator();
		
		while(itr1.hasNext())
		{
			
			System.out.println("Iterator data : "+ itr1.next() + "\t Hash code" + hs1.hashCode());
		}
		
		
		
	}

}
