class Solution {
  public int[] solution(int[] arr) {
      int[] answer;
      if(arr.length == 1) {
          answer = new int[1];
          answer[0] = -1;
      } else {
          int min = -1;
          for(int i=0; i<arr.length; i++) {
              if(min == -1 || arr[min] > arr[i]) {
                  min = i;
              }
          }
          
          answer = new int[arr.length-1];
          
          int cur = 0;
          for(int i=0; i<answer.length; i++) {
              if(i == min) {
                  cur = i + 1;
              }
              
              answer[i] = arr[cur++];
          }
      }
      return answer;
  }
}
