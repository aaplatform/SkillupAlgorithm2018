class Solution {
  public String solution(String s) {
      StringBuilder sb = new StringBuilder();
      
      int id = 0;
      for(int i=0; i<s.length(); i++) {
          if(s.charAt(i) == ' ') {
              id =  0;
              sb.append(' ');
          } else {
              String str = s.substring(i,i+1);
              if(id%2 == 0) {
                  sb.append(str.toUpperCase());
              } else {
                  sb.append(str.toLowerCase());
              }
              id++;
          }
       }
      
      return sb.toString();
  }
}
