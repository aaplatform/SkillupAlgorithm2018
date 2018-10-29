package skoh5.prog.lv2;

/**
 * 숫자의 표현  
 * https://programmers.co.kr/learn/courses/30/lessons/12924?language=java
 * @author skoh5
 *
 */
public class C12924 {
	public boolean solution(String s) {
		int sum = 0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) == '(') {
				sum++;
			} else if(s.charAt(i) == ')') {
				sum--;
			}
			if(sum < 0) {
				break;
			}
		}
		if(sum == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(new C12924().solution(args[0]));
	}
}
