class Solution {
  public String solution(int a, int b) {
      int days = 0;
      
			// calculate months
			for(int i=1; i<a; i++) {
          if(i==4 || i==6 || i==9 | i==11) {
              days += 30;
          } else if (i==1 || i==3 || i==5 || i==7 || i==8 || i==10) {
              days += 31;
          } else {
							// LEAP YEAR
              days += 29;
          }
      }
      
			// calculate days 
      if(days == 0) {
          days = b-1;
      } else {
          days += (b-1);
      }
            
      String answer = "";
      switch(days%7) {
          case 0:
              answer = "FRI";
              break;
          case 1:
              answer = "SAT";
              break;
          case 2:
              answer = "SUN";
              break;
          case 3:
              answer = "MON";
              break;
          case 4:
              answer = "TUE";
              break;
          case 5:
              answer = "WED";
              break;
          case 6:
              answer = "THU";
              break;
      }
      return answer;
  }
}
