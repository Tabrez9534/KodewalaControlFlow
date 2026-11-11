package com.kodewala.control.flow1;

public class TripPlan {
	
	public String doSuggest(String src , String dest , int budget) {
		
		if(budget <= 1000) {
			System.out.println("You are setting in the home becasue less than that it is not enough for travelling");
			System.out.println("So please collect the money for travelling");
		}
		else if(budget >= 1000 && budget <= 5000) {
			System.out.println("You are eligble for only booking ticlet so that's why how we can statying in other places money is enough");
			
		}
		
		else if(budget >= 10000) {
			System.out.println("So now you can travell because enough money for travelling");
		}
		
		return null;
	}

}
