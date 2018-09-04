class Solution {
  public String solution(String s, int n) {
      StringBuilder answer = new StringBuilder();
      
      for(int i=0; i<s.length(); i++) {
          char c = s.charAt(i);
          if(c != ' ') {
              if(c <= 'Z') {
                  if(c + n > 'Z') {
                      c = (char)(c + n - 26);
                  } else {
                      c += n;
                  }
              } else {
                  if(c + n > 'z') {
                      c = (char)(c + n - 26);
                  } else {
                      c += n;
                  }
              }
          }
          answer.append(c);
      }
      
      return answer.toString();
  }
}
