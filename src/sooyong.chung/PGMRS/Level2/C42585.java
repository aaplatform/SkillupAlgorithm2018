import java.util.ArrayList;

class Solution {
    public int solution(String arrangement) {
        int answer = 0;
        int currentBeam = 0;
        char prev = ' ';
        for(int i=0; i<arrangement.length(); i++) {
            if(arrangement.charAt(i) == '(') {
                currentBeam++;
            } else {
                currentBeam--;
                if(prev == '(') {     
                    // laser
                    answer += currentBeam;    
                } else {          
                    // end of the top beam
                    answer++;
                }
            }
            prev = arrangement.charAt(i);
        }
        
        return answer;
    }
}
