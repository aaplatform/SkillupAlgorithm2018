package skoh5.prog;

/**
 * 하샤드 수  
 * https://programmers.co.kr/learn/courses/30/lessons/12947?language=java
 * @author skoh5
 *
 */
public class C12947 {

	public boolean solution(int x) {
		int num = x;
		int sum = 0;
		while(x > 0L) {
			sum += x % 10;
			x = x / 10;
		}
		return num % sum == 0 ? true : false;
	}
	
	public static void main(String[] args) {
		System.out.println(new C12947().solution(Integer.parseInt(args[0])));
	}
}
