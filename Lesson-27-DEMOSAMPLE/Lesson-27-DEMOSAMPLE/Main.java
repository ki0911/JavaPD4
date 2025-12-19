class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }

  // proposal 1
  char[] sub1 = {
    'Q','W','E','R','T','Y','U','I','O','P',
    'L','K','J',
    'q','w','e','r','t','y','u','i','o','p',
    'l','k','j',
    '1','2','3','4','5'
  };

  char[] sub1b = {
    'M','N','B','V','C','X','Z','A','S','D',
    'F','G','H',
    'm','n','b','v','c','x','z','a','s','d',
    'f','g','h',
    '0','9','8','7','6'
  };

  // proposal 2
  char[] sub2 = {
    'a','b','c','d','e','f','g','h','i','j',
    'k','l','m','n','o','p','q','r','s','t',
    'u','v','w','x','y','z',
    '1','2','3','4','5','6','7','8','9','0'
  };

  char[] sub2b = {
    'A','B','C','D','E','F','G','H','I','J',
    'K','L','M','N','O','P','Q','R','S','T',
    'U','V','W','X','Y','Z',
    '!','@','#','$','%','^','&','*','(',')'
  };

  void init(){

    // test
    System.out.println("TESTS");
    String a = "Whatever";
    System.out.println("Original: " + a);

    String p1 = proposal1Encode(a);
    System.out.println("P1 Encode: " + p1);
    System.out.println("P1 Decode: " + proposal1Decode(p1));

    System.out.println("--------------------");

    String p2 = proposal2Encode(a);
    System.out.println("P2 Encode: " + p2);
    System.out.println("P2 Decode: " + proposal2Decode(p2));

    System.out.println("--------------------");

    String p3 = proposal3Encode(a);
    System.out.println("P3 Encode: " + p3);
    System.out.println("P3 Decode: " + proposal3Decode(p3));

    System.out.println("==========================\n");

    // ENCRYPT / DECRYPT
    String file = Input.readFile("test.txt");

    String e1 = proposal1Encode(file);
    String e2 = proposal2Encode(e1);
    String e3 = proposal3Encode(e2);
    Input.writeFile("Encode.txt", e3);

    String enc = Input.readFile("Encode.txt");
    String d1 = proposal3Decode(enc);
    String d2 = proposal2Decode(d1);
    String d3 = proposal1Decode(d2);
    Input.writeFile("Decode.txt", d3);
  }

  // proposal 1 
  String proposal1Encode(String txt){
    return swapEncryption(txt, sub1, sub1b);
  }

  String proposal1Decode(String txt){
    return swapEncryption(txt, sub1, sub1b);
  }

  // proposal 2 
  String proposal2Encode(String txt){
    return swapEncryption(txt, sub2, sub2b);
  }

  String proposal2Decode(String txt){
    return swapEncryption(txt, sub2, sub2b);
  }

  // proposal 3 
  String proposal3Encode(String txt){
    String bld = "";
    for(int i = 0; i < txt.length(); i++){
      char ch = txt.charAt(i);

      if(ch >= 'a' && ch <= 'z'){
        if(ch == 'z') ch = 'a';
        else ch = (char)((int)ch + 1);
      }else if(ch >= 'A' && ch <= 'Z'){
        if(ch == 'Z') ch = 'A';
        else ch = (char)((int)ch + 1);
      }

      bld = bld + ch;
    }
    return bld;
  }

  String proposal3Decode(String txt){
    String bld = "";
    for(int i = 0; i < txt.length(); i++){
      char ch = txt.charAt(i);

      if(ch >= 'a' && ch <= 'z'){
        if(ch == 'a') ch = 'z';
        else ch = (char)((int)ch - 1);
      }else if(ch >= 'A' && ch <= 'Z'){
        if(ch == 'A') ch = 'Z';
        else ch = (char)((int)ch - 1);
      }

      bld = bld + ch;
    }
    return bld;
  }

  // SWAP substitution
  String swapEncryption(String s, char[] left, char[] right){
    String bld = "";

    for(int i = 0; i < s.length(); i++){
      char ch = s.charAt(i);
      char out = ch;

      for(int j = 0; j < left.length; j++){
        if(ch == left[j]){
          out = right[j];
        }
      }

      for(int j = 0; j < right.length; j++){
        if(ch == right[j]){
          out = left[j];
        }
      }

      bld = bld + out;
    }

    return bld;
  }
}
 