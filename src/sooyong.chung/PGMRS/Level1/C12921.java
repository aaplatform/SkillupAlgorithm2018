import java.util.ArrayList;

class Solution {
  public int solution(int n) {
      ArrayList<Integer> primes = new ArrayList<>();
      
      if(n==2) {
          return 1;
      } else {
          primes.add(2);
          
          for(int i=3; i<=n; i++) {
              boolean isPrime = true;
              for(int j=0; j<primes.size(); j++) {
                  if(primes.get(j) > Math.sqrt(i)) {
                      break;
                  }
                  
                  if(i % primes.get(j) == 0) {
                      isPrime = false;
                      break;
                  }
              }
              
              if(isPrime) {
                  primes.add(i);
              }
          }
          
          return primes.size();
      }
      
      
      
  }
}
