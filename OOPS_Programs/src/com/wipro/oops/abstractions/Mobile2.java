package com.wipro.oops.abstractions;


interface  Mobile2 {
	
	final int validity=2 ;
	//abstract method
	abstract void poweronoff();
	
	//Non- abstract method
	default void manufacturing()
	{
		
		System.out.println("Main Mobiles are manufactured by XYZ Company");
	}
   
}

class Samsung1 implements  Mobile2
{

	@Override
	public
	void poweronoff() {
		// TODO Auto-generated method stub
		System.out.println("simply use red button to power on or off");
	}
	
}

class Apple1 implements  Mobile2
{

	@Override
	public
	void poweronoff() {
		// TODO Auto-generated method stub
		System.out.println("simply use green button to power on or off");
	}
	
}


