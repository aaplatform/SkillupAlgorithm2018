import java.util.Arrays;

class Solution {
  public int solution(int[] d, int budget) {
      Arrays.sort(d);
      
      int remain = budget;
      int answer = 0;
      for(int i=0; i<d.length; i++) {
          if(remain >= d[i]) {
              remain -= d[i];
              answer++;
          } else {
              break;
          }
      }
      
      return answer;
  }
}
