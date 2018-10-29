package skoh5.prog.lv1;


/**
 * 핸드폰 번호 가리기 
 * https://programmers.co.kr/learn/courses/30/lessons/12930?language=java
 * @author skoh5
 *
 */
public class C12948 {
	public String solution(String s) {
		if(s.length() == 4) {
			return s;
		}
		//return Collections.nCopies(s.length()-4, "*").stream().collect(Collectors.joining(""))+s.substring(s.length()-4, s.length());
		return new String(new char[s.length()-4]).replace("\0", "*")+s.substring(s.length()-4, s.length());
	}
	
	public static void main(String[] args) {
		System.out.println(new C12948().solution(args[0]));
	}
}
