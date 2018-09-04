import java.util.ArrayList;

class Solution {
  public long[] solution(int x, int n) {
      long[] arr = new long[n];
      long sum = 0;
      for(int i=0; i<n; i++) {
          sum += x;
          arr[i] = sum;
      }
      
      return arr;
  }
}
