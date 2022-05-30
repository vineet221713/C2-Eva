package com.masai;

public class Car {
	private int numberOfPassenger;
	private int numberOfKms;
      public Car() {
		
	}
      public Car(int numberOfPassenger,int numberOfKms){
  		this.numberOfPassenger=numberOfPassenger;
  		this.numberOfKms=numberOfKms;
//  	
  		}
	
	class Sedan extends Car{
		final int farePerKm = 20;
		
	}
	class HatchBack extends Car{
		final int farePerKm =15;
	}
	
	
	

	public int getNumberOfPassenger() {
		return numberOfPassenger;
	}




	public void setNumberOfPassenger(int numberOfPassenger) {
		this.numberOfPassenger = numberOfPassenger;
	}




	public int getNumberOfKms() {
		return numberOfKms;
	}




	public void setNumberOfKms(int numberOfKms) {
		this.numberOfKms = numberOfKms;
	}

	public void showDetails(){
		System.out.println("numberOfPassenger:"+numberOfPassenger);
		System.out.println("numberOfKms :"+numberOfKms);
	
		}


	
	
}
