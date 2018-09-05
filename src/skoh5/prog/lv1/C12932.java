package skoh5.prog.lv1;

/**
 * 자연수 뒤집어 배열로 만들기
 * https://programmers.co.kr/learn/courses/30/lessons/12932?language=java
 * @author skoh5
 *
 */
public class C12932 {
	public int[] solution(long n) {
		int[] answer = {};
		int len =  (int)(Math.log10(n)+1);
		answer = new int[len];
		int idx = 0;
		long mod = 0;
		while(true) {
			mod = n % 10L;
			answer[idx++] = (int)mod;
			n = n/10;			
			if(n == 0) {
				break;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(new C12932().solution(Long.parseLong(args[0])));
	}
}
