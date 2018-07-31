package skoh5;

/**
 * 가장 큰 정사각형 찾기
 * https://programmers.co.kr/learn/courses/30/lessons/12905?language=java
 * @author skoh5
 *
 */
public class C12905 {
	public static final int[][] BOARD_1 = {
			{0, 1, 1, 1}, 
			{1, 1, 1, 1}, 
			{1, 1, 1, 1}, 
			{0, 0, 1, 0}
			};
	public static final int[][] BOARD_2 = {
			{0, 0, 1, 1},
			{1, 1, 1, 1}
			};
	public static final int[][] BOARD_3 = {
			{0, 1, 0, 0}, 
			{1, 1, 0, 0}, 
			{0, 1, 1, 1}, 
			{1, 1, 1, 1}
			};
	public static final int[][] BOARD_4 = {
			{0, 1, 0, 0}, 
			{1, 0, 1, 1}, 
			{0, 1, 1, 0}, 
			{1, 1, 0, 1}
			};
	
    public int solution(int[][] board) {
        int answer = 0;
        int maxRow = board.length;
        int maxCol = board[0].length;
        int area = 0;
        for(int idxR=0;idxR<maxRow;idxR++) {
        	for(int idxC=0;idxC<maxCol;idxC++) {
        		if(board[idxR][idxC] == 1) {
        			area = checkArea(board, idxR, idxC, maxRow, maxCol);
        			if(area > answer) {
        				answer = area;
        			}
        		}
        	}
        }

        return answer;
    }
    
    private int checkArea(int[][] board, int r, int c, int maxRow, int maxCol) {
    	int idxR = r;
    	int idxC = c;
    	for(idxR=r;idxR<maxRow;idxR++) {
    		if(board[idxR][c] == 0) {
    			break;
    		}
    	}
    	int height = idxR-r;
    	
    	for(idxC=c;idxC<maxCol;idxC++) {
    		if(board[r][idxC] == 0) {
    			break;
    		}
    	}
    	int width = idxC-c;
    	
    	int checkRange = Math.min(height, width);    	
    	boolean isSquare = true;
    	for(idxR=r;idxR<r+checkRange;idxR++) {
    		for(idxC=c;idxC<c+checkRange;idxC++) {
    			if(board[idxR][idxC] == 0) {
    				isSquare = false;
    				break;
    			}
    		}
    		if(isSquare == false) {
    			break;
    		}
    	}
    	return isSquare ? (checkRange*checkRange) : 1;
    }
    
    public static void main(String[] args) {
    	System.out.println(new C12905().solution(BOARD_4));
    }
}
