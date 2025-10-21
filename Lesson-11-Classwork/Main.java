class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
   

    
  }

  String getUsernam(String email){
    int pos = email.indexOf("@");
    return email.substring(0,pos);
  }
  
}