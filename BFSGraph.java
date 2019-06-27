package Graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;


public class BFSGraph {
	
static int V;
 static LinkedList<Integer>adj[];
	BFSGraph(int v){
		this.V=v;
		adj= new LinkedList[V];
		for(int i=0;i<V;i++) {
			adj[i]= new LinkedList<Integer>();
		}
		
	}
public void addEdge(int i,int e) {
	adj[i].add(e);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BFSGraph g= new BFSGraph(5);
		 g.addEdge(0, 1); 
	        g.addEdge(0, 2); 
	        g.addEdge(1, 2); 
	        g.addEdge(2, 0); 
	        g.addEdge(2, 3); 
	        g.addEdge(3, 3); 
	        BFS(2);
	 
	}
	
	public static void BFS(int v) {
		boolean []visited= new boolean[V];
		BFSUtil(visited,v);
	}
	public static void BFSUtil(boolean[]visited,int v){
		
		
		Queue<Integer>queue= new LinkedList<Integer>();
		queue.add(v);
		
		visited[v]=true;
		
		while(!queue.isEmpty()) {
			int ele= queue.poll();
			System.out.print(ele+" ");
			Iterator itr= adj[ele].iterator();
		          while(itr.hasNext()) {
			      int n= (int) itr.next();
			      if((!visited[n])) {
			      queue.add(n);
			      visited[n]=true;
			      }
			      
		   }
		}
		
		
		
		}
	}


