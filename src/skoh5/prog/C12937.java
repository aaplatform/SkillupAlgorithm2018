package skoh5.prog;

/**
 * 짝수와 홀수
 * https://programmers.co.kr/learn/courses/30/lessons/12937?language=java
 * @author skoh5
 *
 */
public class C12937 {
	public String solution(int n) {		
		return n % 2 == 0 ? "Even" : "Odd";
	}
	
	public static void main(String[] args) {
		System.out.println(new C12937().solution(Integer.parseInt(args[0])));
	}
}
