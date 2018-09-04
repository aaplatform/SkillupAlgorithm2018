class Solution {
  public int solution(String s) {
      int i = 0;
      if(s.charAt(0) == '-') {
          i = Integer.parseInt(s.substring(1)) * -1;
      } else {
          i = Integer.parseInt(s);
      }
      return i;
  }
}
