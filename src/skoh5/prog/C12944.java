package skoh5.prog;

/**
 * 평균 구하기  
 * https://programmers.co.kr/learn/courses/30/lessons/12944?language=java
 * @author skoh5
 *
 */
public class C12944 {

	public double solution(int[] arr) {
		double answer = 0;		
		for(int i=0;i<arr.length;i++) {
			answer += arr[i];
		}
		
		return (double)answer/arr.length;
	}
	
	public static void main(String[] args) {
		int[] arr = new int[args.length];
		for(int i=0;i<args.length;i++) {
			arr[i] = Integer.parseInt(args[i]);
		}
		System.out.println(new C12944().solution(arr));
	}
}
