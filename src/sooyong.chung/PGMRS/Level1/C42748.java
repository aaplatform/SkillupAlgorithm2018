import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int c=0; c<commands.length; c++) {
            int i = commands[c][0];
            int j = commands[c][1];
            int k = commands[c][2];
            
            int[] partial = new int[j-i+1];
            
            for(int n=0; n<partial.length; n++) {
                partial[n] = array[n+i-1];
            }
            
            Arrays.sort(partial);
            
            answer[c] = partial[k-1];
        }
        
        return answer;
    }
}
