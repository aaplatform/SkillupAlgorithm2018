class Solution {
  public long solution(int a, int b) {
      long answer = 0;
      
      if(a == b) {
          answer = a;
      } else {
          if(Math.min(a,b) > 0 || Math.max(a,b) < 0) {
              // same sign
              for(int i=Math.min(a,b); i<=Math.max(a,b); i++) {
                  answer += i;
              }
          } else {
              // different sign ---> off-setting
              if(Math.abs(a) == Math.abs(b)) {
                  answer = 0;
              } else {
                if(Math.abs(a) > Math.abs(b)) {       
                    if(a > 0) {
                        for(int i=(b-1)*-1; i<=a; i++) {
                            answer += i;
                        }
                    } else {
                        for(int i=(b+1)*-1; i>=a; i--) {
                            answer += i;
                        }
                    }
                } else {
                    if(b > 0) {
                        for(int i=(a-1)*-1; i<=b; i++) {
                            answer += i;
                        }
                    } else {
                        for(int i=(a+1)*-1; i>=b; i--) {
                            answer += i;
                        }
                    }
                }
              }
          }
      }
      
      return answer;
  }
}
