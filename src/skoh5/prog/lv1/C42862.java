package skoh5.prog.lv1;

/**
 * 체육복 
 * https://programmers.co.kr/learn/courses/30/lessons/42862?language=java
 * @author skoh
 *
 */
public class C42862 {

	private static int N = 5;
	private static int[] LOST = {2, 3, 4};
	private static int[] RESERVE = {3, 4, 5};
	
	public int solution(int n, int[] lost, int[] reserve) {
		java.util.Arrays.sort(lost);
		java.util.Arrays.sort(reserve);
		int no = 0;
		boolean bRent = false;
		//여분이 있지만 도난당한 학생 제거 
		for(int i=0;i<lost.length;i++) {
			for(int j=0;j<reserve.length;j++) {
				if(lost[i] == reserve[j]) {
					reserve[j] = 0;
					lost[i] = 0;
					break;
				}
			}
		}
		for(int i=0;i<reserve.length;i++) {
			if(reserve[i] == 0) {
				continue;
			}
			no = reserve[i]-1;
			bRent = false;
			for(int j=0;j<lost.length;j++) {
				if(lost[j] == 0) {
					continue;
				}
				if(lost[j] == no) {
					lost[j] = 0;
					bRent = true;
					break;
				}
			}
			if(bRent) {
				continue;
			}
			no = reserve[i]+1;
			for(int j=0;j<lost.length;j++) {
				if(lost[j] == 0) {
					continue;
				}
				if(lost[j] == no) {
					lost[j] = 0;
					bRent = true;
					break;
				}
			}
		}
		int lostCnt = 0;
		for(int i=0;i<lost.length;i++) {
			if(lost[i] > 0) {
				lostCnt++;
			}
		}
		return n-lostCnt;
	}
	
	public static void main(String[] args) {
		System.out.println(new C42862().solution(N, LOST, RESERVE));
	}
}
