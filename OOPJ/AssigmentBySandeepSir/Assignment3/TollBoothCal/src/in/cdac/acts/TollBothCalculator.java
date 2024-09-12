package in.cdac.acts;

public class TollBothCalculator {
	
	int totalNoCars,totalNoTruck,totalNofMc;
	double rateofCar,rateOfTruck,rateOfMC;
	//double totalRevenue,totalNoOFVechicle;
	
	void acceptRecord(double rate, int count,double rate2, int count2, double rate3,int count3) {
		rateofCar = rate;
		totalNoCars=count;
		
		rateOfTruck=rate2;
		totalNoTruck=count2;
		
		rateOfMC=rate3;
		totalNofMc=count3;
	}
	
	
	double TotalVehicleRev() {
		return (rateofCar*totalNoCars + rateOfTruck*totalNoTruck + rateOfMC*totalNofMc);
	}
	
	int totalNoOfVechicle() {
		return (totalNoCars + totalNoTruck + totalNofMc);
	}
	
	void printRecord() {
		System.out.println("Total no of vechicle :"+ totalNoOfVechicle());
		System.out.println("Total reveune :"+TotalVehicleRev() );
	}
}
