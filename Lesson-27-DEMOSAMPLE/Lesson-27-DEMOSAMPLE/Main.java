class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){

    // Proposal 1 (keyboard opposite mapping)
    char[] sub1 = {
      'Q','W','E','R','T','Y','U','I','O','P',
      'L','K','J',
      '1','2','3','4','5'
    };

    char[] sub1b = {
      'M','N','B','V','C','X','Z','A','S','D',
      'F','G','H',
      '0','9','8','7','6'
    };

    // Proposal 2
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

    String file = Input.readFile("test.txt");

    // Proposal 1
    String encodedMsg1 = subEncryption(file, sub1, sub1b);

    // Proposal 2
    String encodedMsg2 = subEncryption(encodedMsg1, sub2, sub2b);

    // Proposal 3 (double same letter -> next letter)
    String encodedMsg3 = doubleCharEncode(encodedMsg2);

    String encodedMsg4 = encode(encodedMsg3);

    String encodedMsg5 = reverse(encodedMsg4);
    Input.writeFile("Encode3.txt", encodedMsg5);

    // Decoding message
    String file2 = Input.readFile("Encode3.txt");

    // Reverse back
    String decodedMsg1 = reverse(file2);

    // Caesar back
    String decodedMsg2 = decode(decodedMsg1);

    // Reverse Proposal 2
    String decodedMsg3 = subEncryption(decodedMsg2, sub2b, sub2);

    // Reverse Proposal 1
    String decodedMsg4 = subEncryption(decodedMsg3, sub1b, sub1);

    // NOTE: Proposal 3
    Input.writeFile("DecodeFinal.txt", decodedMsg4);
  }

  // Level 1 reverse string
  String reverse(String txt){
    String bld = "";
    for(int i = txt.length() - 1; i >= 0; i--){
      bld = bld + txt.charAt(i);
    }
    return bld;
  }

  // Level 2 Cipher encodin
  String encode(String txt){
    String bld = "";
    for(int i = 0; i < txt.length(); i++){
      char ch = txt.charAt(i);
      int ascii = (int)ch;
      ch = (char)(ascii + 1);
      bld = bld + ch;
    }
    return bld;
  }

  // Decode 
  String decode(String txt){
    String bld = "";
    for(int i = 0; i < txt.length(); i++){
      char ch = txt.charAt(i);
      int ascii = (int)ch;
      ch = (char)(ascii - 1);
      bld = bld + ch;
    }
    return bld;
  }

  // Proposal 3: double same letter -> next letter
  String doubleCharEncode(String txt){
    String bld = "";

    for(int i = 0; i < txt.length(); i++){
      if(i < txt.length() - 1 && txt.charAt(i) == txt.charAt(i + 1)){
        char ch = txt.charAt(i);
        int ascii = (int)ch;
        char next = (char)(ascii + 1);
        bld = bld + next;
        i++; 
      }else{
        bld = bld + txt.charAt(i);
      }
    }

    return bld;
  }

  // Substitution encoding
  String subEncryption(String s, char[] sub, char[] sub2){
    String bld = "";
    for(int i = 0; i < s.length(); i++){
      char ch = s.charAt(i);
      char out = ch;

      for(int j = 0; j < sub.length; j++){
        if(ch == sub[j]){
          out = sub2[j];
        }
      }

      bld = bld + out;
    }
    return bld;
  }

  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }
}