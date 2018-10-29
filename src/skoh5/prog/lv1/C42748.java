package skoh5.prog.lv1;

import java.util.Arrays;

/**
 * K번째수 
 * https://programmers.co.kr/learn/courses/30/lessons/42748?language=java
 * @author skoh
 *
 */
public class C42748 {
	
	public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		int[] command = {};
		int[] sub = {};
		int idx = 0;
		for(int i=0;i<commands.length;i++) {
			command = commands[i];
			sub = new int[command[1]-command[0]+1];
			idx = 0;
			for(int j=command[0]-1;j<command[1];j++) {
				sub[idx++] = array[j];
			}
			Arrays.sort(sub);
			answer[i] = sub[command[2]-1];
		}
		return answer;
	}
	
	public static void main() {
		
	}
}
