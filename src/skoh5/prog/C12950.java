package skoh5.prog;

/**
 * 행렬의 덧셈
 * https://programmers.co.kr/learn/courses/30/lessons/12950?language=java
 * @author skoh5
 *
 */
public class C12950 {
	public static final int[][] BOARD_1 = {
			{0, 1, 1, 1}, 
			{1, 1, 1, 1}, 
			{1, 1, 1, 1}, 
			{0, 0, 1, 0}
			};
	public static final int[][] BOARD_2 = {
			{0, 1, 1, 1}, 
			{1, 1, 1, 1}, 
			{1, 1, 1, 1}, 
			{0, 0, 1, 0}
			};
	
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        
        for(int i=0;i<arr1.length;i++) {
        	for(int j=0;j<arr1[0].length;j++) {
        		answer[i][j] = arr1[i][j] + arr2[i][j];
        	}
        }

        return answer;
    }    
      
    public static void main(String[] args) {
    	C12950 cls = new C12950();
    	cls.solution(BOARD_1, BOARD_2);
    }
}
