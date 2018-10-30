package skoh5.prog.lv2;

/**
 * 다음 큰 숫자 
 * https://programmers.co.kr/learn/courses/30/lessons/12911?language=java
 * @author skoh5
 *
 */
public class C12911 {
	public int solution(int num) {
		int srcNum1 = getNum1(num);
		int resultNum1 = 0;
		while(srcNum1 != resultNum1) {
			resultNum1 = getNum1(++num);
		}
		return num;
	}
	
	private int getNum1(int num) {
		return (int)Integer.toString(num, 2).chars().filter(c -> c == '1').count();
	}

	public static void main(String[] args) {
		System.out.println(new C12911().solution(Integer.parseInt(args[0])));
	}
}
