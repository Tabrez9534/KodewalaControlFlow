package com.kodewala.control.flow;

public class Driver {

	public static void main(String[] args) {
	
		Booking booking = new Booking();
		
		
		String pnr = booking.doBooking("Delhi", "patna" , 5);
		System.out.println("Your pnr is : "+pnr);

	}

}
