import java.util.Stack;

public class SortStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stk= new Stack<Integer>();
		stk.push(-5);
		stk.push(5);
		stk.push(51);
		stk.push(1);
		stk.push(8);
		stk.push(0);
		sortStack(stk);
		stk.forEach( (i)->System.out.println(i)  );

	}
  public static void sortStack(Stack<Integer> s) {
	  
	  if(!s.isEmpty()) {
		 int e=s.pop(); 
		 sortStack(s);
		 insertSortStck(s,e);
	  }
	
}
  public static void insertSortStck(Stack<Integer> s,int ele) {
	  if(s.isEmpty() || s.peek()<ele) {
		  s.push(ele);
		  return ;
	  }
		  
		 int e=s.pop();
		 insertSortStck(s,ele);
		 s.push(e);
	  }
	  
 

  
}