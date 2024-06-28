package com.wipro.collection;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Map<Integer , Integer> m = new HashMap<Integer , Integer>();
		
		m.put(101, 500);
		m.put(102, 500);
		m.put(103, 400);
		
		System.out.println(m.size());
		
	    for(Map.Entry<Integer, Integer> obj :m.entrySet())
	    {
	    	System.out.println("Key : " + obj.getKey() + "Values are :" + obj.getValue());
	    	
	    }
	}

}

//Student class studentid as a key and studentname as a value  , use a loop 
