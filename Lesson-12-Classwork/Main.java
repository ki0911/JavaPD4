class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
   

    
  }
  boolean collegeCredit(String CourseCode){
    if (CourseCode.length() < 6){
      return false;
    }
    char sixthChar = CourseCode.charAt(5);
    return sixthChar == 'E' || sixthChar == 'M';
  }

  String getCounsoler(String officialClass){
     if (officialClass == null || officialClass.length() == 0) {
      return "Unknown";
    }
    char firstChar = officialClass.charAt(0);
        char middleChar = officialClass.charAt(officialClass.length() / 2);
        switch (firstChar) {
            case 'B': return "Berrouet";
            case 'C': return "Chu";
            case 'D': return "Dinn";
            case 'E': return "Eyzengart";
            case 'F': return "Flores";
            case 'G': return "Gibson";
            case 'L': return "Shim Lee";
            case 'M': return "Meltzer";
            case 'P': return "Paccione";
            case 'S': return "Fiore";
            case 'T': return "Tsai";
            case 'Z': return "Zayes";
        }
         switch (middleChar) {
            case 'B': return "Berrouet";
            case 'C': return "Chu";
            case 'D': return "Dinn";
            case 'E': return "Eyzengart";
            case 'F': return "Flores";
            case 'G': return "Gibson";
            case 'L': return "Shim Lee";
            case 'M': return "Meltzer";
            case 'P': return "Paccione";
            case 'S': return "Fiore";
            case 'T': return "Tsai";
            case 'Z': return "Zayes";
  }
  return "Unknown";
}
}

 
