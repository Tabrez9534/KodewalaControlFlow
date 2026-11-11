package com.kodewala.control.flow;

public class Booking{
	
	// max 6 tickets are not allowed
	public String doBooking(String from , String to , int maxpxz) {
		String pnr = null;
		if(maxpxz > 6) {
			
			System.err.println("As per IRCTC rule , only you can book maxmimum 6 pnr");
		}
		
		else {
			pnr = "989489038";
			System.out.println("Confirming the booking ticket pnr is "+pnr);
			System.out.println("Status confirmed ");
			System.out.println("Seat 23 B2");
			
		}
		
		return pnr;
	}

}