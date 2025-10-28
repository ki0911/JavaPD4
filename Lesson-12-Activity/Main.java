class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
   
  }

String creditCardType(String card){
    if (card.substring(0,2).equals("34") || card.substring(0,2).equals("37")){
        return "America Express";
    } else if (card.substring(0,2).equals("36")){
        return "Diner Club";
    } else if (card.substring(0,2).equals("51") || card.substring(0,2).equals("55")){
        return "Mastercard";
    } else if (card.substring(0,4).equals("6011") || card.substring(0,2).equals("65")){
        return "Discovery";
    } else if (card.substring(0,1).equals("4")){
        return "Visa";
    } else {
        return "Unknown";
    }
}
  String pigLatin(String word){
    String first = word.substring(0,1);   
    String rest = word.substring(1);   
    return rest + first + "ay";
}

String nycLocate(String zip){
    String firstThree = zip.substring(0,3); 

    if (firstThree.equals("100") || firstThree.equals("101") || firstThree.equals("102")) {
        return "Manhattan";
    } else if (firstThree.equals("103")) {
        return "Staten Island";
    } else if (firstThree.equals("104")) {
        return "Bronx";
    } else if (firstThree.equals("112")) {
        return "Brooklyn";
    } else if (firstThree.equals("111") || firstThree.equals("113") || firstThree.equals("114")) {
        return "Queens";
    } else {
        return "Unknown";
    }
}
String getMonth(String date){
    String month = date.substring(0,2);  

    if (month.equals("01")) {
        return "January";
    } else if (month.equals("02")) {
        return "February";
    } else if (month.equals("03")) {
        return "March";
    } else if (month.equals("04")) {
        return "April";
    } else if (month.equals("05")) {
        return "May";
    } else if (month.equals("06")) {
        return "June";
    } else if (month.equals("07")) {
        return "July";
    } else if (month.equals("08")) {
        return "August";
    } else if (month.equals("09")) {
        return "September";
    } else if (month.equals("10")) {
        return "October";
    } else if (month.equals("11")) {
        return "November";
    } else if (month.equals("12")) {
        return "December";
    } else {
        return "Unknown";
    }
}
boolean validatePswd(String pswd){
    if (pswd.length() >= 5 && pswd.length() <+8){
        return false;
    }

    if (pswd.contains("^") || pswd.contains("*") || pswd.contains("(") || pswd.contains(")")){
        return false;
    }

    return true;
}

}