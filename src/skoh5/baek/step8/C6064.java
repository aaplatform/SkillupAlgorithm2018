package skoh5.baek.step8;

import java.util.Scanner;

/**
 * 카잉 달력 
 * https://www.acmicpc.net/problem/6064
 * @author skoh
 *
 */
public class C6064 {

	public void run() {
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			int testNum = sc.nextInt();
			long result = 0;
			while(testNum > 0) {
				result = calc(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
				System.out.println(result);
				testNum--;
			}
		} finally {
			if(sc != null) {
				sc.close();
			}
		}
	}

	private long calc(int m, int n, int x, int y) {
		if(x > m || y > n) {
			return -1;
		}
		// long 타입 사용 
		long lcm = lcm(m, n);
		if(m == x && n == y) {
			return lcm;
		}
		// 작은 수의 배수로 탐색하기 위해 swap
		if(m > n) {
			int tmp = m;
			m = n;
			n = tmp;
			tmp = x;
			x = y;
			y = tmp;
		}
		int multiM = 0;
		int findNum = -1;
		int rest = 0;
		int numM = m * multiM++;
		while(numM + x < lcm) {
			rest = (numM + x) % n;
			// 나머지가 0이지만 y는 0이 올수 없기 때문에 변환 
			if(rest == 0) {
				rest = n;
			}
			if(rest == y) {
				findNum = numM + x;
				break;
			}
			numM = m * multiM++;
		}
		return findNum;
	}
	
	private long gcd(int p, int q) {
		if(q == 0) return p;
		return gcd(q, p%q);
	}
	
	private long lcm(int p, int q) {
		return (long)(p*q)/gcd(p, q);
	}
	
	public static void main(String[] args) {
		new C6064().run();
	}
}
