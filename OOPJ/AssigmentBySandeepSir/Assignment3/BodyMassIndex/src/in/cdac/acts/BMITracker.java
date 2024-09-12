package in.cdac.acts;

public class BMITracker {
	
	float weight;
	float height;
	float bmi;
	
	void acceptRecord(float w, float h) {
		weight=w;
		height=h;
	}
	
	double calculateBMI() {
		bmi = weight/(height*height);
		return bmi;
		
	}
	
	String classifyBMI() {
		if(calculateBMI()<18.5) {
			return "Underweight";
		}
		else if(calculateBMI()>=18.5 && calculateBMI()<24.9) {
			return "Normal weight";
			
		}
		else if(calculateBMI()<=25 && calculateBMI()>29.9) {
			return "Overweight";
		}else {
			return "Obese";
		}
	}
	
	void printRecord() {
		System.out.println("Weight :"+weight);
		System.out.println("Height :"+height);
		System.out.println("BMI :"+calculateBMI());
		System.out.println("ClassifyBMI :"+classifyBMI());
	}

}
