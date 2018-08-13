package skoh5.baek.step8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * ACM 호텔  
 * https://www.acmicpc.net/problem/10250 
 * @author skoh
 *
 */
public class C10250 {
	
	public void run() {
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			int testNum = sc.nextInt();
			List<String> list = new ArrayList<>(testNum);
			while(testNum > 0) {
				list.add(calcRoomNum(sc.nextInt(), sc.nextInt(), sc.nextInt()));
				testNum--;
			}
			for(String answer: list) {
				System.out.println(answer);
			}
		} finally {
			if(sc != null) {
				sc.close();
			}
		}
	}
	
	private String calcRoomNum(int height, int width, int guestNum) {
		int floor = 0;
		int no = 0;
		floor = guestNum%height;
		no = guestNum/height+1;
		if(floor == 0) {
			floor = height;
			no--;
		}
		return String.format("%d%02d", floor, no);
	}
	
	public static void main(String[] args) {
		new C10250().run();
	}
}
