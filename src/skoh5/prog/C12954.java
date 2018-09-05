package skoh5.prog;

/**
 * x만큼 간격이 있는 n개의 숫자 
 * https://programmers.co.kr/learn/courses/30/lessons/12954?language=java
 * @author skoh5
 *
 */
public class C12954 {
	public long[] solution(int x, int n) {
		long[] answer = new long[n];
		int idx = 0;
		while(idx < n) {
			answer[idx] = x + (long)x*idx;
			idx++;
		}
		return answer;
	}

	public static void main(String[] args) {
		long[] answer = new C12954().solution(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
		for(int i=0;i<answer.length;i++) {
			System.out.println(answer[i]);
		}
	}
}
