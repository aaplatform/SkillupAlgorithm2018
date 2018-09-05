class Solution {
  public long solution(long n) {
      double rt = Math.sqrt(n);
      
      if((long)rt*rt == n) {
          return (long)((rt+1)*(rt+1));
      } else {
          return -1;
      }
  }
}
