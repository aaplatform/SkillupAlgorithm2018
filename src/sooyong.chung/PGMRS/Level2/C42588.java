class Solution {
    public int[] solution(int[] heights) {
        int[] answer = new int[heights.length];
    
        for(int i=heights.length-1; i>=0; i--) {
            for(int j=heights.length-1; j>i; j--) {
                if(answer[j] == 0 && heights[i] > heights[j]) {
                    answer[j] = i+1;
                }
            }
        }      
        
        return answer;
    }
}
