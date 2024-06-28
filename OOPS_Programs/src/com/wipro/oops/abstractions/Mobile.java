package com.wipro.oops.abstractions;

abstract class Mobile {
	
	String name;
	//abstract method
	abstract void poweronoff();
	
	//Non- abstract method
	void manufacturedby()
	{
		
		System.out.println("Main Mobiles are manufactured by XYZ Company");
	}
   
}

class Samsung extends Mobile
{

	@Override
	void poweronoff() {
		// TODO Auto-generated method stub
		System.out.println("simply use red button to power on or off");
	}
	
}

class Apple extends Mobile
{

	@Override
	void poweronoff() {
		// TODO Auto-generated method stub
		System.out.println("simply use green button to power on or off");
	}
	
}


