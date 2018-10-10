import java.util.ArrayList;

class Solution {
    public int solution(int[] scoville, int K) {
        int mixCount = 0;
		    MinHeap heap = new MinHeap(scoville.length);
        
        for(int i=0; i<scoville.length; i++) {
        	heap.push(scoville[i]);
        }
        
        while(heap.peek() < K) {
        	if(heap.size == 1) {
        		mixCount = -1;
        		break;
        	}
        	
        	int min1 = heap.pop();
        	int min2 = heap.pop();
        	
        	heap.push(min1 + min2*2);
        	
        	mixCount++;
        }
        
        return mixCount;
    }
}

class MinHeap {
	int[] heap;
	int size;
	
	public MinHeap(int maxSize) {
		size = 0;
		heap = new int[maxSize+1];
	}
	
	public void push(int e) {
		if(this.size >= this.heap.length) {
			System.out.println("Heap overflow");
			return;
		} else {
      // insert at the end
			this.size++;
			heap[this.size] = e;
			
			int cur = this.size;
			
      // move higher until parent is smaller than child node
			while(cur>1 && heap[cur/2] > heap[cur]) {
				int tmp = heap[cur/2];
				
				heap[cur/2] = heap[cur];
				heap[cur] = tmp;
				
				cur /= 2;
			}
		}
	}
	
	public int pop() {
		if(this.size == 0) {
			System.out.println("Empty heap");
			return -1;
		} else if(this.size == 1) {
			return heap[this.size--];
		} else {
			int val = heap[1];
			heap[1] = heap[this.size--];
			
			int cur = 1;
      // choose smaller child node
			int next = this.size <= cur*2 ? cur*2 : (heap[cur*2] < heap[cur*2+1] ? cur*2 : cur*2+1);
			
      // move lower until child node is bigger than parent node
			while(next<=this.size && heap[next] < heap[cur]) {
				int tmp = heap[next];
				
				heap[next] = heap[cur];
				heap[cur] = tmp;
				
				cur = next;
				next = this.size <= cur*2 ? cur*2 : (heap[cur*2] < heap[cur*2+1] ? cur*2 : cur*2+1);
			}
			
			return val;			
		}
	}
	
	public int peek() {
		return heap[1];
	}
}
