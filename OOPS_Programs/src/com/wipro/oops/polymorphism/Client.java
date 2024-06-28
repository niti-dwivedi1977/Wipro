package com.wipro.oops.polymorphism;

public class Client {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Payment p = new Payment();
        p.doPayment(101, "XYZ");
        System.out.println("Congratulations payment done via cash");
	}

}
