package in.cdac.acts;

public class BMITracker {
	float weight;
	float height;
	float bmi;
	String classy;
	
	public String getClassy() {
		return classifyBMI();
	}

	public void setClassy(String classy) {
		this.classy = classy;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getBmi() {
		return calculateBMI();
	}

	public void setBmi(float bmi) {
		this.bmi = bmi;
	}

	
	
   public BMITracker(){
	   this(0.0f,0.0f);
   }
   
   public BMITracker(float a, float b) {
	   this.weight = a;
	   this.height = b;
   }
	
	//BUSINESS LOGIC
	float calculateBMI() {
		bmi = getWeight()/(getHeight()*getHeight());
		return bmi;
		
	}
	
	String classifyBMI() {
		if(getBmi()<18.5) {
			return "Underweight";
		}
		else if(getBmi()>=18.5 && getBmi()<24.9) {
			return "Normal weight";
			
		}
		else if(getBmi()<=25 && getBmi()>29.9) {
			return "Overweight";
		}else {
			return "Obese";
		}
	}
}
