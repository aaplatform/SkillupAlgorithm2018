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
	public static final int[][] BOARD_5 = {
			{1, 1}, 
			{1, 1}, 
			{1, 1}, 
			{0, 1}
			};
	public static final int[][] BOARD_6 = {
			{1, 1, 1, 1}, 
			{1, 1, 0, 0}, 
			{1, 0, 0, 0}, 
			{1, 0, 0, 0}
			};
	public static final int[][] BOARD_7 = {
			{0, 0, 0, 0}
			};
	public static final int[][] BOARD_8 = {
			{1}
			};
	public static final int[][] BOARD_9 = {
			{1},
			{0},
			{1}	
			};
	public static final int[][] BOARD_10 = {
			{0}
			};
	
    public int solution(int[][] board) {
        int answer = 0;
        int maxRow = board.length;
        int maxCol = board[0].length;
        int size = 0;
        for(int idxR=0;idxR<maxRow;idxR++) {
        	for(int idxC=0;idxC<maxCol;idxC++) {
        		if(board[idxR][idxC] == 1) {
        			size = checkOutline(board, idxR, idxC, maxRow, maxCol);
        			if(size > answer) {
        				answer = size;
        			}
        		}
        	}
        }
        return answer;
    }    
    
    private int checkOutline(final int[][] board, final int initRow, 
    		final int initCol, final int maxRow, final int maxCol) {
    	int offset = 1;
    	int retVal = 0;
    	while(true) {
    		retVal = innerCheckOutline(board, initRow, initCol, offset, maxRow, maxCol);
    		if(retVal == offset) {
    			break;
    		}
    		offset++;
    	}
    	return offset * offset;
    }
    
    private int innerCheckOutline(final int[][] board, final int initRow,
    		final int initCol, final int offset, final int maxRow, int maxCol) {
    	int length = offset;
    	if(initRow+offset >= maxRow) {
    		return length;
    	}
    	if(initCol+offset >= maxCol) {
    		return length;
    	}
    	//가로 탐색 
    	for(int i=initCol;i<=initCol+offset;i++) {
    		if(board[initRow+offset][i] == 0) {
    			return length;
    		}
    	}
    	//세로 탐색
    	for(int i=initRow;i<=initRow+offset-1;i++) {
    		if(board[i][initCol+offset] == 0) {
    			return length;
    		}
    	}
    	return length+1;
    }

//    private int checkSquare(int[][] board, int r, int c, int maxRow, int maxCol) {
//    	int idxR = r;
//    	int idxC = c;
//    	for(idxR=r;idxR<maxRow;idxR++) {
//    		if(board[idxR][c] == 0) {
//    			break;
//    		}
//    	}
//    	int height = idxR-r;
//    	
//    	for(idxC=c;idxC<maxCol;idxC++) {
//    		if(board[r][idxC] == 0) {
//    			break;
//    		}
//    	}
//    	int width = idxC-c;
//    	
//    	int checkRange = Math.min(height, width);    	
//    	boolean isSquare = true;
//    	for(idxR=r;idxR<r+checkRange;idxR++) {
//    		for(idxC=c;idxC<c+checkRange;idxC++) {
//    			if(board[idxR][idxC] == 0) {
//    				isSquare = false;
//    				break;
//    			}
//    		}
//    		if(isSquare == false) {
//    			break;
//    		}
//    	}
//    	return isSquare ? (checkRange*checkRange) : 1;
//    }
    
    public static void main(String[] args) {
    	C12905 cls = new C12905();
    	assert  cls.solution(BOARD_1) == 9 : "board1 must be 9";    	
    	assert  cls.solution(BOARD_2) == 4 : "board2 must be 4";
    	assert  cls.solution(BOARD_3) == 4 : "board3 must be 4";
    	assert  cls.solution(BOARD_4) == 1 : "board4 must be 1";
    	assert  cls.solution(BOARD_5) == 4 : "board5 must be 4";
    	assert  cls.solution(BOARD_6) == 4 : "board6 must be 4";
    	assert  cls.solution(BOARD_7) == 0 : "board7 must be 0";
    	assert  cls.solution(BOARD_8) == 1 : "board8 must be 1";
    	assert  cls.solution(BOARD_9) == 1 : "board9 must be 1";
    	assert  cls.solution(BOARD_10) == 0 : "board10 must be 0";
    	System.out.println("all pass");
    }
}
