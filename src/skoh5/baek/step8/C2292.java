package skoh5.baek.step8;

import java.util.Scanner;

public class C2292 {

	public int run() {
		Scanner sc = null;
		int idx = 0;
		try {
			sc = new Scanner(System.in);
			int num = sc.nextInt();
			if(num == 1) {
				return 1;
			}
			int sum = 1;
			/**
			 * 주변 숫자가 6*1, 6*2, 6*3, 6*4 ... 개수만큼 
			 * 둘러싸고 있으므로 이를 계산
			 */
			while(num > sum) {
				sum += (6*++idx);
			}
			idx++;
		} finally {
			if(sc != null) {
				sc.close();
			}
		}
		return idx;
	}
	public static void main(String[] args) {
		System.out.println(new C2292().run());
	}
}
