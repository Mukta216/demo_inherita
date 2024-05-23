package com.code.reservation;

public class Makemytrip extends Indigo {
	
	
	public void bookmytrip(double flight_price) {
		//System.out.println("hellosM");
		double discount_price=20;
		double total_price=(flight_price-(discount_price*flight_price/100));
		System.out.println("ngp to pune flight price as :"+total_price);
	}

	
	
	
}
