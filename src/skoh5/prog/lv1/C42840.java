package skoh5.prog.lv1;


/**
 * 모의고사   
 * https://programmers.co.kr/learn/courses/30/lessons/42840?language=java
 * @author skoh5
 *
 */
public class C42840 {

	public static int[] AS = {};
    public int[] solution(int[] answers) {
    	int[] answer = {};
    	int[] num1 = {1, 2, 3, 4, 5};
    	int[] num2 = {2, 1, 2, 3, 2, 4, 2, 5};
    	int[] num3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
    	
    	int[] correctCnt = {0, 0, 0};
    	for(int i=0;i<answers.length;i++) {
    		if(answers[i] == num1[(i%num1.length)]) {
    			correctCnt[0]++;
    		}
    		if(answers[i] == num2[(i%num2.length)]) {
    			correctCnt[1]++;
    		}
    		if(answers[i] == num3[(i%num3.length)]) {
    			correctCnt[2]++;
    		}
    	}
    	int maxCorrectCnt = 0;
    	for(int i=0;i<correctCnt.length;i++) {
    		if(correctCnt[i] > maxCorrectCnt) {
    			maxCorrectCnt = correctCnt[i];
    		}
    	}
    	int maxCorrectNum = 0;
    	for(int i=0;i<correctCnt.length;i++) {
    		if(correctCnt[i] == maxCorrectCnt) {
    			maxCorrectNum++;
    		}
    	}
    	int idx = 0;
    	answer = new int[maxCorrectNum];
    	for(int i=0;i<correctCnt.length;i++) {
    		if(correctCnt[i] == maxCorrectCnt) {
    			answer[idx++] = (i+1);
    		}
    	}
    	return answer;
    }
    
    public static void main() {
    	System.out.println(new C42840().solution(AS));
    }
}
