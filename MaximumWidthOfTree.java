package Tree;

import java.util.LinkedList;
import java.util.Queue;

class Node{
	int data;
	Node left;
	Node right;
	Node(int item){
		this.data = item;
		left= right=null;
		
	}
}

public class MaximumWidthOfTree {
 static Node root ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         root= new Node(1);
         root.left = new Node(2); 
         root.right = new Node(3); 
         root.left.left = new Node(4); 
         root.left.right = new Node(5); 
         root.right.right = new Node(8); 
         root.right.left = new Node(8); 
         root.right.right.left = new Node(6); 
         root.right.right.right = new Node(7); 
         System.out.println(maxWidth(root));
	}
   public static  int maxWidth(Node node) {
	Queue<Node>q= new LinkedList<Node>();
	int maxWidth=0;
	q.add(node);
	while(!q.isEmpty()) {
		int count=q.size();
		maxWidth= Math.max(count, maxWidth);
		while(count>0) {
			Node temp=q.poll();
			if(temp.left!=null)
				q.add(temp.left);
			if(temp.right!=null) {
				q.add(temp.right);
			}
			
			count--;
		}
	}
	return maxWidth;
	
  }
}
