package skoh5.prog.lv1;

/**
 * 약수의 합
 * https://programmers.co.kr/learn/courses/30/lessons/12928?language=java
 * @author skoh5
 *
 */
public class C12928 {
	public int solution(int n) {
		int answer = 0;
		if(n == 0) {
			return answer;
		}
		answer = 1;
		if(n > 1) {
			answer += n;
		}
		for(int i=2;i<=n/2;i++) {
			if(n % i == 0) {
				answer += i;
			}
		}	
		return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(new C12928().solution(Integer.parseInt(args[0])));
	}
}
