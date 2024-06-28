package com.wipro.oops.polymorphism;

public class Payment {
	
	
	void doPayment(int orderno , String address){}
	void doPayment(int orderno, int cardno) {}
	void doPayment(int orderno , int accno, String Bankname) {}
	void doPayment(String address,int orderno) {}
	void doPayment(String address,String orderno) {}

}
