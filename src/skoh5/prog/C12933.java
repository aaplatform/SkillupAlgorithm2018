package skoh5.prog;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 정수 내림차순으로 배치하기 
 * https://programmers.co.kr/learn/courses/30/lessons/12933?language=java
 * @author skoh5
 *
 */
public class C12933 {

	public long solution(long n) {
		long answer = 0;
		List<Integer> list = new ArrayList<>();
		while(n > 0L) {
			list.add((int)(n % 10L));
			n = n / 10;
		}
		// 올림차순 정렬 
		Collections.sort(list);
		// 작은수부터 더함 
		int idx = 0;
		for(Integer i : list) {
			answer += i * Math.pow(10, idx++);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(new C12933().solution(Long.parseLong(args[0])));
	}
}
