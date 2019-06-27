package Graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class BFSGraph1 {
	 static int V=5;
	static  LinkedList<Integer>[] adj;
	 
 BFSGraph1(){
		 adj= new LinkedList[V];
		 for(int i=0;i<V;i++) {
			 adj[i]= new LinkedList<Integer>();
		 }
	 }
 public static void addEdge(int u,int v) {
	 adj[u].add(v);
 }
 
 public void BFS(int start) {
	 Queue<Integer>q= new LinkedList<Integer>();
	 q.add(start);
	boolean visited[] = new boolean[V];
	 while(!q.isEmpty()) {
		 
		 int n= q.poll();
		 visited[n]=true;
		 System.out.println(n);
		 Iterator itr= adj[n].iterator();
		 while(itr.hasNext()) {
			 int no=(int) itr.next();
			 if(!visited[no]) {
				 q.add(no);
			 }
		 }
	 }
	 
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BFSGraph1 g=new BFSGraph1();
		g.addEdge(0, 1); 
        g.addEdge(0, 2); 
        g.addEdge(1, 2); 
        g.addEdge(2, 0); 
        g.addEdge(2, 3); 
        g.addEdge(3, 3); 
        g.addEdge(3, 4); 
        g.BFS(2);

	}

}
