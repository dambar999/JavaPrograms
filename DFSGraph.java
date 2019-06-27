package Graph;

import java.util.Iterator;
import java.util.LinkedList;

class Employee{
	
}
public class DFSGraph {
	
static int V;
 static LinkedList<Integer>adj[];
	DFSGraph(int v){
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
		DFSGraph g= new DFSGraph(5);
		 g.addEdge(0, 1); 
	        g.addEdge(0, 2); 
	        g.addEdge(1, 2); 
	        g.addEdge(2, 0); 
	        g.addEdge(2, 3); 
	        g.addEdge(3, 3); 
	        dfs(2);
	 
	}
	
	public static void dfs(int v) {
		boolean []visited= new boolean[V];
		dfsUtil(visited,v);
	}
	public static void dfsUtil(boolean[]visited,int v) {
		visited[v]=true;
		System.out.print(v+" ");
		Iterator itr= adj[v].iterator();
		while(itr.hasNext()) {
			int n= (int) itr.next();
			if(!visited[n]) {
				dfsUtil(visited,n);
			}
		}
		
	}

}
