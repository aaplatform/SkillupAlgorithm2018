package skoh5.baek.step8;

import java.util.Scanner;

/**
 * 2007년 
 * https://www.acmicpc.net/problem/1924
 * @author skoh
 *
 */
public class C1924 {
	private static final int[] DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	private static final String[] WEEKS = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
	
	public String run() {
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			int month = sc.nextInt();
			int day = sc.nextInt();
			int idx = 0;
			while(idx < month-1) {
				day += DAYS[idx++];
			}
			return WEEKS[day%7];
		} finally {
			if(sc != null) {
				sc.close();
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println(new C1924().run());
	}
}
