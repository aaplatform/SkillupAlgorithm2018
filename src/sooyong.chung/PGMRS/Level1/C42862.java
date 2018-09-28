import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] numTraining = new int[n];
        
        Arrays.fill(numTraining, 1);
        
        for(int i=0; i<reserve.length; i++) {
            numTraining[reserve[i]-1]++;
        }
        for(int i=0; i<lost.length; i++) {
            numTraining[lost[i]-1]--;
        }
       
        for(int i=0; i<n; i++) {
            if(numTraining[i] == 2) {
                if(i>0 && numTraining[i-1] == 0) {
                    numTraining[i-1] = 1;
                    numTraining[i] = 1;
                } else if(i<n-1 && numTraining[i+1] == 0) {
                    numTraining[i] = 1;
                    numTraining[i+1] = 1;
                }
            }
        }     
        
        int answer = 0;
        
        for(int i=0; i<n; i++) {
            if(numTraining[i] >= 1) {
                answer++;
            }
        }
        
        return answer;
    }
}
