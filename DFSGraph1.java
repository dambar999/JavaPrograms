package Graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class DFSGraph1 {
	 static int V=5;
	static  LinkedList<Integer>[] adj;
	 
 DFSGraph1(){
		 adj= new LinkedList[V];
		 for(int i=0;i<V;i++) {
			 adj[i]= new LinkedList<Integer>();
		 }
	 }
 public static void addEdge(int u,int v) {
	 adj[u].add(v);
 }
 
 public void DFS(int n, boolean visited[]) {
	//boolean visited[]= new boolean[V];
		 visited[n]=true;
		 System.out.println(n);
		 Iterator itr= adj[n].iterator();
		 while(itr.hasNext()) {
			 int no=(int) itr.next();
			 if(!visited[no]) {
				 DFS(no,visited);
			 }
		 }
	 }
	 
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DFSGraph1 g=new DFSGraph1();
		g.addEdge(0, 1); 
        g.addEdge(0, 2); 
        g.addEdge(1, 2); 
        g.addEdge(2, 0); 
        g.addEdge(2, 3); 
        g.addEdge(3, 3); 
        g.addEdge(3, 4);
      boolean visited[]= new boolean[V];
        g.DFS(2,visited);

	}

}
