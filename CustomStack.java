package stackqueuelist;

import java.util.Stack;

public class CustomStack {
  static  Stack<Integer>st= new Stack<Integer>();
   static int min=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomStack s = new CustomStack(); 
        s.push(3); 
        s.push(5); 
        s.getMin(); 
        s.push(2); 
        System.out.println(getMin());
        s.push(1); 
        //Sysouts.getMin(); 
        System.out.println(getMin());
        s.pop(); 
       // s.getMin(); 
        System.out.println(getMin());
        s.pop(); 
        //s.peek(); 

	}
	public static int getMin() {
		return min;
		
	}
	public static void  push(int n) {
		if (st.isEmpty()) {
			st.push(n);
			min=n;
		}
			if(n<min) {
				st.push(2*n-min);
				min=n;
		}
			else {
				st.push(n);
			}
		
	}
    public static int  pop() {
    	int p=-1;
    	if(!st.isEmpty()) {
    		 p= st.pop();
    		if(p<min) {
    			min= 2*min-p;
    		}
    	}
	  return p;
  }
}
