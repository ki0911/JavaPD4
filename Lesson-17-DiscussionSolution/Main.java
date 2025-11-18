class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){

    print(reverse("Hello"));
    print(encryption1("Hello"));
    print(encryption1("yellow"));

  }
  
  String reverse(String s){
    String bld="";

    for(int x=s.length()-1;x>=0; x--)
      bld+=s.substring(x,x+1);

    return bld;
  }

  //Swap every two characters
  String encryption1(String s){
    String bld = "";
    for(int x=0; x<=s.length()-2;x+=2){
      bld+= s.substring(x+1,x+2) + s.substring(x,x+1);
    }

    //if odd number of characters, add the last
    //character and the end of the new string
    if(s.length()%2==1)
      bld+=s.substring(s.length()-1);
    return bld;
  }
  
  

}