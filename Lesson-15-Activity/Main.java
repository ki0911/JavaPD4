class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){

    
    
  }
  String space (int N){
    String result = " ";
    for(int i=0; i <= N; i = i++){
    result = result + " ";
    }
    result = result + "DONE";
    return result;
}

  double harmonic (int N){
    double sum = 0.0;

    for (int i = 1; i <= N; i = i++) {
        sum = sum + 1.0 / i;   

    return sum;
    }
    return sum;
  }
  
double sin(int terms, double x) {
    double sum = 0.0;
    int sign = 1;  

    for (int i = 1; i <= terms; i = i + 1) {
        int power = 2 * i - 1;   // 1, 3, 5, 7, ...
        double factorial = 1.0;

        for (int j = 1; j <= power; j = j + 1) {
            factorial = factorial * j;
        }

        double term = sign * (Math.pow(x, power) / factorial);
        sum = sum + term;

        sign = sign * -1;
    }

    return sum;
}

}