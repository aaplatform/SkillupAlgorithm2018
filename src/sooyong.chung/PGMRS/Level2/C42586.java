import java.util.ArrayList;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> release = new ArrayList<>();
        
        int complete = 0;
        int numFunc = progresses.length;
    
        while(complete < numFunc) {
            int numRelease = 0;
            
            // progress each function
            for(int i=complete; i<numFunc; i++) {
                progresses[i] += speeds[i];
            }
            
            // release functions completed
            while(complete < numFunc && progresses[complete] >= 100) {
                numRelease++;
                complete++;
            }
            
            // if there is any releases, add the number of them
            if(numRelease != 0) {
                release.add(numRelease);    
            }
        } 
        
        // array conversion
        int[] answer = new int[release.size()];
        for(int i=0; i<release.size(); i++) {
            answer[i] = release.get(i);
        }
                
        return answer;
    }
}
