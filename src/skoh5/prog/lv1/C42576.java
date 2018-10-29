package skoh5.prog.lv1;

import java.util.Arrays;

/**
 * 완주하지 못한 선수  
 * https://programmers.co.kr/learn/courses/30/lessons/42576?language=java
 * @author skoh5
 *
 */
public class C42576 {

	public static String[] P = {};
	public static String[] C = {};
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);
        for(int i=0;i<participant.length;i++) {
        	if(i >= completion.length || 
        			participant[i].equals(completion[i]) == false) {
        		answer = participant[i];
        		break;
        	}
        }
        return answer;
    }
    
    public static void main() {
    	System.out.println(new C42576().solution(P, C));
    }
}
