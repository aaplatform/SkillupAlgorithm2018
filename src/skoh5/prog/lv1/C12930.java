package skoh5.prog.lv1;

/**
 * 이상한 문자 만들기
 * https://programmers.co.kr/learn/courses/30/lessons/12930?language=java
 * @author skoh5
 *
 */
public class C12930 {
	public String solution(String s) {
		String answer = "";
		char[] arrChar = null;
		String[] arrStr = s.toLowerCase().split(" ");
		for(int i=0;i<arrStr.length;i++) {
			arrChar = arrStr[i].toCharArray();
			for(int j=0;j<arrChar.length;j++) {
				if(j % 2 == 0) {
					arrChar[j] = Character.toUpperCase(arrChar[j]);
				}
			}
			arrStr[i] = new String(arrChar);
		}
		answer = String.join(" ", arrStr);      
		if(s.length() > answer.length()) {
			char[] repeat = new char[s.length() - answer.length()];
			java.util.Arrays.fill(repeat, ' ');
			answer += new String(repeat);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(new C12930().solution(args[0]));
	}
}
