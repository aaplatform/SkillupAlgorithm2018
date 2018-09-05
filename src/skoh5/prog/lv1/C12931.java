package skoh5.prog.lv1;

/**
 * 자릿수 더하기
 * https://programmers.co.kr/learn/courses/30/lessons/12931?language=java
 * @author skoh5
 *
 */
public class C12931 {
	public int solution(int n) {
		int answer = 0;
		int mod = 0;
		while(true) {
			mod = n % 10;
			answer += mod;
			n = n/10;
			if(n == 0) {
				break;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(new C12931().solution(Integer.parseInt(args[0])));
	}

}
