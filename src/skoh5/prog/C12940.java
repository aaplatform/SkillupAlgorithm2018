package skoh5.prog;

/**
 * 최대공약수와 최소공배수   
 * https://programmers.co.kr/learn/courses/30/lessons/12940?language=java
 * @author skoh5
 *
 */
public class C12940 {

	public int[] solution(int n, int m) {
		int[] answer = new int[2];
		int gcd = (int)gcd(n, m);
		int lcm = (int)lcm(n, m);
		answer[0] = gcd;
		answer[1] = lcm;
		return answer;
	}
	
	// 최대공약수
	private long gcd(int p, int q) {
		if(q == 0) return p;
		return gcd(q, p%q);
	}

	// 최소공배수	
	private long lcm(int p, int q) {
		return (long)(p*q)/gcd(p, q);
	}
	
	public static void main(String[] args) {		
		int[] answer = new C12940().solution(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
		for(int i=0;i<answer.length;i++) {
			System.out.println(answer[i]);
		}
	}
}
