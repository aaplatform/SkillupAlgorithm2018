import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> priorityStack = new ArrayList<>();
        
        for(int i=0; i<priorities.length; i++) {
            queue.add(priorities[i]);
            priorityStack.add(priorities[i]);
        }
        
        // stack for checking the highest priority
        Collections.sort(priorityStack, Collections.reverseOrder());
        
        int printed = 0;
        boolean isPrinted = false;
        while(!isPrinted) {
            // if this document doesn't have the highest priority
            if(queue.peek() != priorityStack.get(0)) {
                queue.add(queue.poll());
                
                if(location != 0) {
                    location--;
                } else {
                    location = queue.size()-1;
                }
            } else {
                queue.poll();
                priorityStack.remove(0);
                printed++;
                
                if(location != 0) {
                    location--;
                } else {
                    isPrinted = true;
                }
            }
        }
        
        return printed;
    }
}
