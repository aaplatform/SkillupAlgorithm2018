import java.util.Arrays;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        for(int i=0; i<completion.length; i++) {
            if(!participant[i].equals(completion[i])){
                return participant[i];
            }
        }
        
        // if no difference is found until the last participant, that person didn't finish the marathon.
        return participant[participant.length-1];
    }
}
