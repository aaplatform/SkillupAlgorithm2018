package skoh5.prog.lv2;

/**
 * 땅따먹기 
 * https://programmers.co.kr/learn/courses/30/lessons/12913?language=java
 * @author skoh5
 *
 */
public class C12913 {
	public static final int[][] BOARD_1 = {
			{1, 2, 3, 5}, 
			{5, 6, 7, 8}, 
			{4, 3, 2, 1}
			};
	public static final int[][] BOARD_2 = {
			{6, 8, 5, 4}, 
			{9, 8, 7, 6}, 
			{12, 3, 2, 1}
			};
	private int max = 0;
    public int solution(int[][] board) {
        innerSum(board, 0, 0, -1);
        return max;
    }    
    
    private void innerSum(int[][] board, int sum, int rowIdx, int excludeColIdx) {
    	if(rowIdx == board.length) {
    		if(sum > max) {
    			max = sum;
    		}
    		return;
    	}
    	for(int i=0;i<board[rowIdx].length;i++) {
    		if(i == excludeColIdx) {
    			continue;
    		}
    		innerSum(board, sum+board[rowIdx][i], rowIdx+1, i);
    	}
    }
    
    public static void main(String[] args) {
    	System.out.println(new C12913().solution(BOARD_2));
    }
}
