
class Main {
	public static void main(String[] args) {
    	(new Main()).init();
	}

  void init(){
/*  
    Challenge 1:
    1) Create the variables, ask the user for the variable values, write the equation in file EQ1-act6 and display the equation value.
*/
    System.out.println("enter x");
    double x = Input.readDouble();
    double y = 0;
    y = Math.pow(x,7);
    System.out.println(y);


/*  
    Challenge 2:
    1) Create the variables, ask the user for the variable values, write the equation in fileEQ1.1-act6 and display the equation value.
*/
    System.out.println("Enter z");
    double z = Input.readDouble();
    double q = 0;
    q = Math.pow(z,3)+5;
    System.out.println(q);

/*  
    Challenge 3:
    Create the variables, ask the user for the variable values, write the equation in file EQ2-act6 and display the equation value..
    
*/
    System.out.println("Enter r");
    double r = Input.readDouble();
    System.out.println("Enter t");
    double t = Input.readDouble();
    double s = 0;
    s = Math.pow(t,5)*Math.pow(r+2,4);
    System.out.println(s);


/*  
    Challenge 4:
    Create the variables, ask the user for the variable values, write the equation in file EQ3-act6 and display the equation value..
    
*/
    System.out.println("Enter A");
    double A = Input.readDouble();
    System.out.println("Enter B");
    double B = Input.readDouble();
    double C = 0;
    C = Math.sqrt(A+B);
    System.out.println(C);


/*  
    Challenge 5:
    Create the variables, ask the user for the variable values, write the equation in file EQ4-act6 and display the equation value..
    
*/
    System.out.println("Enter x2");
    double x2 = Input.readDouble();
    System.out.println("Enter x1");
    double x1 = Input.readDouble();
    System.out.println("Enter y2");
    double y2 = Input.readDouble();
    System.out.println("Enter y1");
    double y1 = Input.readDouble();
    double d = 0;
    d = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
    System.out.println(d);
    

/*  
    Challenge 6:
    Create the variables, ask the user for the variable values, write the equation g=sin(deg) and display the equation value..
    
*/
    System.out.println("Enter deg");
    double deg = Input.readDouble();
    double g = 0;
    g = Math.sin(Math.toRadians(deg));
    System.out.println(g);



/*  
    Challenge 7:
    Create the variables, ask the user for the variable values, write the equation in file EQ5-act6 and display the equation value.
    
*/
    System.out.println("Enter m");
    double m = Input.readDouble();
    System.out.println("Enter n");
    double n = Input.readDouble();
    double k = 0;
    k = Math.pow(m,5) / Math.sqrt(n+1);
    System.out.println(k);



/*  
    *** Bonus Challenge ***:
    Create the variables, ask the user for the variable values, write the equation in file Ch-act6 and display the equation value.

    HINT: What does the "plus minus: after "-b" mean.
*/





    // **************************************************
    // **** Don't write any code below here.  ***********
    // **************************************************
  }
}