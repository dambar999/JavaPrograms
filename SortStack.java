package stackqueuelist;

import java.util.ListIterator;
import java.util.Stack;

public class SortStack {
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Stack<Integer>s= new Stack<Integer>();
      s.push(30); 
      s.push(-5); 
      s.push(18); 
     s.push(14); 
      s.push(-3); 
      printStck(s);
      sortStack(s);
      printStck(s);
     
	}
	
	public static  void sortStack(Stack st) {
		
		if(!st.isEmpty()) {
			//System.out.println("repeatakz" + st.size());
			int ele=(int) st.pop();
			sortStack(st);
			orderInsertion(st,ele);
		}
		//System.out.println("repeat" + st.size());
	}
	public static void orderInsertion(Stack<Integer> st,int n) {
		//System.out.println("order insertion");
		if(st.isEmpty()||st.peek()<=n) {
			st.push(n);
			return ;
		}
		int e=(int) st.pop();
		orderInsertion(st,n);
		st.push(e);
		
	}
	public static  void printStck(Stack<Integer>s) {
		 ListIterator<Integer> lt = s.listIterator(); 
         
	       // forwarding 
	       while(lt.hasNext()) 
	          System.out.println(lt.next()); 
	}

}
