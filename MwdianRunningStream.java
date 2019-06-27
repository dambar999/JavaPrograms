package arrays;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MwdianRunningStream {
	public static void addNumber(int element,PriorityQueue<Integer>upper,PriorityQueue<Integer>lower) {
		if(lower.size()==0||element< lower.peek()) {
			lower.add(element);
			
		}
		else {
			upper.add(element);
		}
		
		System.out.println(lower.peek() + "  :" + upper.peek ());
		
	}
	public static void reBalance(PriorityQueue<Integer>upper,PriorityQueue<Integer>lower) {
		PriorityQueue<Integer>biggerHeap=lower.size()>upper.size()?lower:upper;
		PriorityQueue<Integer>smallerHeap=lower.size()>upper.size()?upper:lower;
		if(biggerHeap.size()-smallerHeap.size()>=2) {
			smallerHeap.add(biggerHeap.poll());
		}
		
	}
	public static  double findMedian(PriorityQueue<Integer>upper,PriorityQueue<Integer>lower) {
		PriorityQueue<Integer>biggerHeap=lower.size()>upper.size()?lower:upper;
		PriorityQueue<Integer>smallerHeap=lower.size()>upper.size()?upper:lower;
		if(biggerHeap.size()==smallerHeap.size()) {
			return (double)(biggerHeap.peek()+smallerHeap.peek())/2;
		}
		else {
			return biggerHeap.peek();
		}
		
	}

	public static void main(String[] args) {
		int[]stream= {4,8,15,1,12,67,3,2};
		medianUtil(stream);

	}
	public static void  medianUtil(int stream[]) {
		//min heap;
				PriorityQueue<Integer>upper= new PriorityQueue<Integer>();
				//max heap
				PriorityQueue<Integer>lower= new PriorityQueue<Integer>(new Comparator<Integer>(){
					@Override
					public int compare(Integer a1,Integer a2) {
						return -1*  a1.compareTo(a2);
						
					}
				});
		double median[]= new double[stream.length];
		for(int i=0;i<stream.length;i++) {
			addNumber(stream[i],upper,lower);
			reBalance(upper,lower);
			median[i]=findMedian(upper ,lower);
			System.out.println("median is :" + median[i]);
		}
		
	}

}
