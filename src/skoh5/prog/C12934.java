package skoh5.prog;

/**
 * 정수 제곱근 판별 
 * https://programmers.co.kr/learn/courses/30/lessons/12934?language=java
 * @author skoh5
 *
 */
public class C12934 {

	public long solution(long n) {
		long answer = 0;
		double numSqrt = Math.sqrt(n);
		if(numSqrt - (int)numSqrt > 0.0d) {
			answer =  -1;
		} else {
			answer =  (long)Math.pow(numSqrt + 1, 2);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(new C12934().solution(Long.parseLong(args[0])));
	}
}
