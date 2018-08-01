import java.util.*;

public class Solution {
	public int[] solution(int []arr) {
      int prev = -1;      // previous number
		  StringBuffer sb = new StringBuffer();
      for(int i=0; i<arr.length; i++) {
        if(prev == -1 || prev != arr[i]) {
          sb.append(arr[i]);
          prev = arr[i];
        }
      }
      String[] str = sb.toString().split("");

      int[] answer = new int[str.length];
      for(int i=0; i<str.length; i++) {
        answer[i] = Integer.parseInt(str[i]);
      }

      return answer;
	}
}
