package skoh5.baek.step8;

import java.util.Scanner;

/**
 * 부녀회장이 될테야 
 * https://www.acmicpc.net/problem/2775 
 * @author skoh
 *
 */
public class C2775 {
	
	public void run() {
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			int testNum = sc.nextInt();
			while(testNum > 0) {
				calc(sc.nextInt(), sc.nextInt());
				testNum--;
			}
		} finally {
			if(sc != null) {
				sc.close();
			}
		}
	}
	
	private void calc(int floor, int no) {
		int[] arrInt = new int[no];
		for(int i=0;i<no;i++) {
			arrInt[i] = i+1;
		}
		System.out.println(innerCalc(floor, no, arrInt));
	}
	
	private int innerCalc(int floor, int no, int[] arrInt) {
		int sum = 0;
		if(floor == 1) {
			for(int i=0;i<no;i++) {
				sum += arrInt[i];
			}
			return sum;
		}
		
		int[] arrNewInt = new int[no];
		for(int i=0;i<no;i++) {
			sum = 0;
			for(int j=0;j<=i;j++) {
				sum += arrInt[j];
			}
			arrNewInt[i] = sum;
		}
		return innerCalc(floor-1, no, arrNewInt);
	}
	
	public static void main(String[] args) {
		new C2775().run();
	}
}
