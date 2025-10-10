
class Main {

	private static final boolean Senior = false;
	public static void main(String[] args) {
    	(new Main()).init();
	}

	void init(){
  
   

  }
  double gpa(double yourGPA){
	double finalGPA = 0;

	if (yourGPA > 90){
	return finalGPA * 1.1;
  }else{
	return finalGPA;
  }
}


	boolean gratudating(String gardeLevel, int credits){
		int Credits = 0;
		String gradeLevel = "";
		if (gradeLevel == "Senior" && Credits >= 44) {
	return true;
		}else{
			return false;
		}

}

	String BMI (double weight, double height){
		double bmi = 703 * weight / (height * height);
		String result;
		if (bmi <= 18.4){
			result = "Underweight";
		}else if (bmi <= 24.9){
			result = "Normal";
		}else if(bmi <= 39.9){
			result = "Overweight";
		}else{
			result = "Obese";
		}
		return result;
	} 

	double shippingCost(double weight){
		double cost = 0.0;
		if (cost <= 10){
			cost = 0.00;
		}else if (cost <= 15){
			cost = 5.00;
		}else if (cost <= 25){
			cost = 10.00;
		}else if (cost > 25){
			cost = 10.00 + (weight - 25)*0.02;
		}
		return cost;
	}	

	boolean blueOrViolent(double frequency){
		double fre = 0.00;
		if (fre >= 600 && fre <= 670);
		if (fre >= 700 && fre <= 750){
		return true;
	}else{
		return false;
	}
}
}