import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public int solution(String numbers) {
      // count each digits
        int[] numDigit = new int[10];        
        for(int i=0; i<numbers.length(); i++) {
            numDigit[numbers.charAt(i) - '0']++;
        }
        
      //figure out the maximum number possible
        StringBuilder sb = new StringBuilder();
        for(int i=9; i>=0; i--) {
            for(int n=0; n<numDigit[i]; n++) {
                sb.append(i);
            }
        }
        int max = Integer.parseInt(sb.toString());
        
     
        ArrayList<Integer> primes = new ArrayList<>();
                
        int cnt = 0;
        for(int i=2; i<=max; i++) {
          // check whether the number is PRIME or not
            boolean isPrime = true;
            for(int j=0; j<primes.size(); j++) {
                if(i % primes.get(j) == 0) {
                    isPrime = false;
                    break;
                }
            }
            
            if(isPrime) {
                primes.add(i);
              // check this prime number is possible with the given digits
                String s = Integer.toString(i);
                int[] digit = new int[10];
                for(int d=0; d<s.length(); d++) {
                    digit[s.charAt(d) - '0']++;
                }
                
                boolean possible = true;
                for(int d=0; d<10; d++) {
                    if(digit[d] > numDigit[d]) {
                        possible = false;
                        break;
                    }
                }
                
                if(possible) {
                    cnt++;
                }
            }
        }
        
        return cnt;
    }
}
