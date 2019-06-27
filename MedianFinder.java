package practise;

import java.util.Comparator;
import java.util.PriorityQueue;

class MedianFinder {
	PriorityQueue<Integer> minHeap = null;
	PriorityQueue<Integer> maxHeap = null;

	public static void main(String args[]) {
		MedianFinder mf= new MedianFinder();
		mf.addNum(7);
		mf.addNum(1);
		mf.addNum(3);
		mf.addNum(4);
		//System.out.println(mf.findMedian());
		//mf.addNum(10);
		//mf.addNum(18);
		//System.out.println(mf.findMedian());
		
	}
	/** initialize your data structure here. */
	public MedianFinder() {
		minHeap = new PriorityQueue<>();
		maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
	}

	public void addNum(int num) {
		minHeap.offer(num);
		maxHeap.offer(minHeap.poll());

		if(minHeap.size()<maxHeap.size()){
			minHeap.offer(maxHeap.poll());
		}
	}

	public double findMedian() {
		System.out.println(minHeap.peek());
		System.out.println(maxHeap.peek());
		if(minHeap.size() > maxHeap.size()){
			return minHeap.peek();
		}else {
			
			return (minHeap.peek()+maxHeap.peek())/2.0;
		}
		
	}
}

