class Solution {
  public String solution(int n) {
		String ternaryStr = ternaryScale(n);
		
		if(!ternaryStr.contains("0")) {
      // no need 0-4 conversion
			return ternaryStr;
		} else {
			boolean hasZero = true;
      
      // 0-4 conversion loop
			while(hasZero) {
				StringBuilder sb = new StringBuilder();
				hasZero = false;
				boolean zeroFound = false;
				int zeroCnt = 0;
				
				for(int i=ternaryStr.length()-1; i>=0; i--) {
					char c = ternaryStr.charAt(i);
					if(zeroFound) {
            // after 0-4 conversion applied, just copy original string
						sb.append(c);
					} else {
						if(c == '0') {
							zeroCnt++;
						} else {
              // 0-4 conversion part
							if(zeroCnt > 0) {
								sb.append(4);
								for(int z=0; z<zeroCnt-1; z++) {
									sb.append(2);
								}
								
								if(c == '2') {
									sb.append(1);
								} else {
                  // generate new ZERO ---> finish current loop and convert on next loop
									sb.append(0);
									zeroFound = true;
								}
								zeroCnt = 0;
							} else {
								sb.append(c);
							}
						}
					}	
				}
				
				ternaryStr = sb.reverse().toString();
				
        // zero detection
				for(int i=0; i<ternaryStr.length(); i++) {
					if(ternaryStr.charAt(i) == '0') {
						hasZero = true;
					}
				}
			}
			
			return ternaryStr;
        }
  }
    
    public static String ternaryScale(int n) {
		int val = n;
		StringBuilder sb = new StringBuilder();
		
		while(val >= 1) {
			sb.append(val%3);
			val /= 3;
		}
		
		return sb.reverse().toString();
	}
}
