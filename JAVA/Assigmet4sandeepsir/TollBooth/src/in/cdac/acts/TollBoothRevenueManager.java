package in.cdac.acts;

public class TollBoothRevenueManager {
	int noOfCar,noOfTruck,noOfMc;
	double carRate,truckRate,mcRate,totalRevenue;
	
	public void setnoOfCars(int c) {
		this.noOfCar = c;
		
	}
	
	public void setnoOfTruck(int c) {
		this.noOfTruck = c;
		
	}
	
	public void setnoOfCMc(int c) {
		this.noOfMc= c;
		
	}
	
	public void setRateCar(double rate) {
		this.carRate = rate;
	}
	
	public void setRateTruck(double rate) {
		this.truckRate = rate;
	}
	
	public void setRateMc(double rate) {
		this.mcRate = rate;
	}
	
	
	public int getnoOfCars() {
		return noOfCar;
		
	}
	
	public int getnoOfTruck() {
		return noOfTruck;
		
	}
	
	public int getnoOfCMc() {
		return noOfMc;
		
	}
	
	public double getRateCar() {
		return carRate ;
	}
	
	public double getRateTruck() {
		return truckRate;
	}
	
	public double getRateMc() {
		return mcRate;
	}
	
	public int getTotalNoOfVechile() {
		return (getnoOfCars()+getnoOfCMc()+getnoOfTruck());
	}
	
	
	public double totalRevanue() {
		return ((getRateCar()*getnoOfCars()) + (getRateMc()*getnoOfCMc()) + (getRateTruck()*getnoOfTruck()));

	}
	
}
