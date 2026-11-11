package com.kodewala.control.flow2;

public class MakeMyTripDiscount {
	
	public double doTrip(double fare , double dis){
	
		
		if(fare < 5000) {
			System.err.println("Discount is not applied");
			System.out.println("Your fare is "+fare);
		}
		
		else if(fare > 5000 && fare < 10000) {
			fare = (fare * dis ) / 100;
			
			System.out.println("Your fare with 10 % discount : "+fare);
			System.out.println("After discount is "+fare);
				
		}
		else if (fare >= 10000) {
			
			fare = (fare * 15 ) / 100;
			System.out.println("Your discount is 15 % and then total final fare is  : "+fare);
			System.out.println("Yuour discount is : "+dis);
		
		}
		else {
			fare = fare - dis ;
			System.out.println("Your total fare is : "+fare);
			System.out.println("Your total dis "+dis);
		}
		
		return fare;
		
	}

}
