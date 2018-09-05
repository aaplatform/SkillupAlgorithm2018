package skoh5.prog;

/**
 * 콜라츠 추측
 * https://programmers.co.kr/learn/courses/30/lessons/12943?language=java
 * @author skoh5
 *
 */
public class C12943 {
	public int solution(int n) {
		long num = n;
		int calcCnt = 0;
		while(calcCnt < 500 && num != 1) {
			num = calc(num);
			calcCnt++;
		}
		return calcCnt == 500 ? -1 : calcCnt;
	}
	
	private long calc(long n) {
		return (n%2 == 0) ? n/2 : n*3+1;
	}

	public static void main(String[] args) {
		System.out.println(new C12943().solution(Integer.parseInt(args[0])));
	}
}
