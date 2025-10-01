class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

  void init(){

  }
  	void print(String msg){
	System.out.println(msg);
  }
   
 	double FtoC(double F){
	double c = (F-32)* 9.0/5;
	return c;
  }

  	double sphereVolume(double r){
	double V = (4.0/3)*Math.PI*Math.pow(r,3);
	return V;
	}

	double coneVolume(double r2, double h){
	double CV = Math.PI*Math.pow(r2,2)*(h/3.0);
	return CV;

}
	double distance(double x1,double x2, double y1, double y2){
	double d = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
	return d;
	}
}
