package com.wipro.oops.abstractions;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mobile2 mob = new Samsung1();
		System.out.println("For Samsung Users");
		mob.manufacturing();
		mob.poweronoff();
		
		Mobile2 mob1 = new Apple1();
		System.out.println("For Apple  Users");
		mob.manufacturing();
		mob1.poweronoff();
	}

}
