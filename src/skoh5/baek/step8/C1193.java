package skoh5.baek.step8;

import java.util.Scanner;

/**
 * 분수찾기 
 * https://www.acmicpc.net/problem/1193
 * @author skoh
 *
 */
public class C1193 {

	public String run() {
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			int num = sc.nextInt();
			if(num == 1) {
				return "1/1";
			}
			int sum = 1;
			int idx = 1;
			/**
			 * 지그재그가 +1씩 증가 
			 */
			while(num > sum) {
				sum += ++idx;
			}
			/**
			 * 지그재그 라인이 짝수인 경우 분모가 크고, 분자는 1
			 * 홀수인 경우 분모는 1, 분자가 큼 
			 * 숫자 차이나는만큼 +- 수행 
			 */
			int diff = sum - num;
			int upNum=0, downNum=0;
			if(idx % 2 == 0) {
				upNum = idx - diff;
				downNum = 1 + diff;
			} else {
				upNum = 1 + diff;
				downNum = idx - diff;
			}
			return String.valueOf(upNum+"/"+downNum);
		} finally {
			if(sc != null) {
				sc.close();
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println(new C1193().run());
	}
}
