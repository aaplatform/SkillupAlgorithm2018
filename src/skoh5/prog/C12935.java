package skoh5.prog;

/**
 * 제일 작은수 제거하기  
 * https://programmers.co.kr/learn/courses/30/lessons/12935?language=java
 * @author skoh5
 *
 */
public class C12935 {

	public int[] solution(int[] arr) {
		int[] answer = {-1};
		if(arr.length == 1) {
			return answer;
		}
		int minIdx = -1;
		int min = Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] < min) {
				min = arr[i];
				minIdx = i; 
			}
		}
		answer = new int[arr.length-1];
		if(minIdx == 0) {
			System.arraycopy(arr, 1, answer, 0, answer.length);	
		} else if(minIdx == answer.length){
			System.arraycopy(arr, 0, answer, 0, answer.length);
		} else {
			System.arraycopy(arr, 0, answer, 0, minIdx);
			System.arraycopy(arr, minIdx+1, answer, minIdx, answer.length - minIdx);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		int[] arr = new int[args.length];
		for(int i=0;i<args.length;i++) {
			arr[i] = Integer.parseInt(args[i]);
		}
		int[] answer = new C12935().solution(arr);
		for(int i=0;i<answer.length;i++) {
			System.out.println(answer[i]);
		}
	}
}
