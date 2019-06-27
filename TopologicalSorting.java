package Graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class TopologicalSorting {
 static LinkedList<Integer>[] adj;
  static int V;
  TopologicalSorting(int v){
		this.V=v;
		
		adj= new LinkedList[V];
		for(int i=0;i<V;i++) {
			adj[i]=new LinkedList();
		}
		
	}
  public static void addEdge(int u,int v) {
	  adj[u].add(v);
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TopologicalSorting g = new TopologicalSorting(6); 
        g.addEdge(5, 2); 
        g.addEdge(5, 0); 
        g.addEdge(4, 0); 
        g.addEdge(4, 1); 
        g.addEdge(2, 3); 
        g.addEdge(3, 1); 
        topologicalSort();

	}
	
	public static void topologicalSort() {
		Stack stk= new Stack();
		boolean visited[]= new boolean[V];
		for(int i=0;i<V;i++) {
			if(!visited[i]) {
				topologicalSortUtil(i,visited,stk);
			}
		}
		while(!stk.isEmpty()) {
			System.out.println(stk.pop());
		}
	}
public static void topologicalSortUtil(int i,boolean[]visited,Stack stk) {
	visited[i]=true;
	Iterator itr= adj[i].iterator();
	while(itr.hasNext()) {
		int e=  (int) itr.next();
		if(!visited[e]) {
			topologicalSortUtil(e,visited,stk);
		}
	}
	stk.push(i);
}
}
