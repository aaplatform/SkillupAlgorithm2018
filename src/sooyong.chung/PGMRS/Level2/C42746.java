import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Solution {
    public String solution(int[] numbers) {
        ArrayList<String> numList = new ArrayList<>();
        
        for(int i=0; i<numbers.length; i++) {
            numList.add(Integer.toString(numbers[i]));
        }
        
        Collections.sort(numList, new Comparator<String>() {
        	@Override
        	public int compare(String s1, String s2) {
        		long i1 = Long.parseLong(s1+s2);
        		long i2 = Long.parseLong(s2+s1);
        		
        		if(i1 < i2) {
        			return 1;
        		} else {
        			return -1;
        		}
        	}
        });
        
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<numList.size(); i++) {
            sb.append(numList.get(i));
        }
        
        return sb.toString();
    }
}
