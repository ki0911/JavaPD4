class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }

  void init(){
   
  System.out.println(collegeCredit("MKUFCE1"));
  System.out.println(collegeCredit("MKUFC1"));

  System.out.println(getCounsoler("1D0"));
  System.out.println(getCounsoler("D10"));
  System.out.println(getCounsoler("1F0"));
  System.out.println(getCounsoler("F10"));
  System.out.println(getCounsoler("1C0"));
  System.out.println(getCounsoler("C10"));
  System.out.println(getCounsoler("1G0"));
  System.out.println(getCounsoler("G10"));
  System.out.println(getCounsoler("1E0"));
  System.out.println(getCounsoler("E10"));
  System.out.println(getCounsoler("1B0"));
  System.out.println(getCounsoler("B10"));
  System.out.println(getCounsoler("1X0"));
  System.out.println(getCounsoler("X10"));

  System.out.println(imageType("fistQuater.png"));
  System.out.println(imageType("StudentList.PdF"));
  System.out.println(imageType("building1.JPEG"));
  System.out.println(imageType("building2q.jpg"));
  System.out.println(imageType("ironman.gif"));

    
  }

  boolean collegeCredit(String course){
    if(course.substring(5,6).equals("M") ||
       course.substring(5,6).equals("E") )
      return true;
    else
      return false;
  }
  

  String getCounsoler(String ofcl){
    if(ofcl.substring(0,1).equals("D") || 
       ofcl.substring(1,2).equals("D")){
      return  "Dinn";
    }
    else if(ofcl.substring(0,1).equals("F") || 
       ofcl.substring(1,2).equals("F")){
      return  "Flores";
    }
    else if(ofcl.substring(0,1).equals("C") || 
       ofcl.substring(1,2).equals("C")){
      return  "Chu";
    }
    else if(ofcl.substring(0,1).equals("G") || 
       ofcl.substring(1,2).equals("G")){
      return  "Gibson";
    }
    else if(ofcl.substring(0,1).equals("E") || 
       ofcl.substring(1,2).equals("E")){
      return  "Eyzengart";
    }
    else if(ofcl.substring(0,1).equals("B") || 
       ofcl.substring(1,2).equals("B")){
      return  "Berrouet";
    }
    else
      return "Unknown";
  }

  
  String imageType(String fileName){
    int pos = fileName.indexOf(".");
    
    if (fileName.substring(pos+1).equalsIgnoreCase("JPEG") ||
       fileName.substring(pos+1).equalsIgnoreCase("JPG")){
        return "Joint Photograpic Experts Group";
       }
    else if (fileName.substring(pos+1).equalsIgnoreCase("PNG") ){
        return "Portable Network Graphics";
       }
    else if (fileName.substring(pos+1).equalsIgnoreCase("GIF") ){
        return "Graphics Interchage Format";
       }
    else if (fileName.substring(pos+1).equalsIgnoreCase("PDF") ){
        return "Portalbe Document Format";
       }
    else 
      return "Unknow file type";
  }
  
}