package skoh5.baek.step8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 * 방 번호 
 * https://www.acmicpc.net/problem/1475
 * @author skoh
 *
 */
public class C1475 {

	public int run() {
		Scanner sc = null;
		int max = 0;
		try {
			sc = new Scanner(System.in);
			int num = sc.nextInt();
			if(num == 0) {
				return 1;
			}
			Map<Integer, Integer> mapNum = new HashMap<>();
			int mod = 0;
			Integer cnt = 0;
			while(num > 0) {
				mod = num % 10;
				if(mod == 9) {
					mod = 6;
				}
				cnt = mapNum.get(mod);
				if(cnt == null) {
					mapNum.put(mod, 1);
				} else {
					mapNum.put(mod, cnt+1);
				}
				num = num / 10;
			}
			cnt = mapNum.get(6);
			if(cnt != null) {
				if(cnt % 2 == 1) {
					cnt++;
				}
				mapNum.put(6, cnt/2);
			}
			Iterator<Integer> iter = mapNum.keySet().iterator();
			while(iter.hasNext()) {
				num = iter.next();
				cnt = mapNum.get(num);
				if(cnt > max) {
					max = cnt;
				}
			}
		} finally {
			if(sc != null) {
				sc.close();
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		System.out.println(new C1475().run());
	}
}
