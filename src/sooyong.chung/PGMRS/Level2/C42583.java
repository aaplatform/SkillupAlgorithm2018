import java.util.ArrayList;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        ArrayList<Integer> waitingTruck = new ArrayList<>();
        ArrayList<Integer> onBridge = new ArrayList<>();
        ArrayList<Integer> timeOnBridge = new ArrayList<>();
        
        for(int i=0; i<truck_weights.length; i++) {
            waitingTruck.add(truck_weights[i]);
        }
        
        int time = 0;
        int currentWeight = 0;
        while(!waitingTruck.isEmpty() || currentWeight != 0) {     
          // -------------- PRINT STATUS -----------------
        	System.out.println("<TIME " + time + ">");
        	System.out.println("==== BRIDGE STATUS (CURRENT WEIGHT : " + currentWeight + ") ====");
        	for(int i=0; i<onBridge.size(); i++) {
        		System.out.println("TRUCK " + i + "[" + onBridge.get(i) + "] -- " + timeOnBridge.get(i) + "/" + bridge_length);
        	}
        	System.out.println("==== WAITING LINE ====");
        	for(int i=0; i<waitingTruck.size(); i++) {
        		System.out.print(waitingTruck.get(i) + " ");
        	}System.out.println();
        	// ----------------------------------------------
          
        	if(!onBridge.isEmpty()) {
            	boolean out = false;
                for(int i=0; i<timeOnBridge.size(); i++) {
                    timeOnBridge.set(i, timeOnBridge.get(i)+1);
                    
                    if(timeOnBridge.get(i) > bridge_length) {
                    	out = true;
                    }
                }
                
                if(out) {
                	// complete to cross the bridge
                	currentWeight -= onBridge.remove(0);
                	timeOnBridge.remove(0);
                }
            }
        	
            if(!waitingTruck.isEmpty()) {
                if(weight - currentWeight >= waitingTruck.get(0)) {
                    currentWeight += waitingTruck.get(0);
                    onBridge.add(waitingTruck.remove(0));
                    timeOnBridge.add(1);
                } else {
                    // no more truck can cross the bridge
                }   
            }
            
            time++;
        }
        
        return time;
    }
}
