package Graph;

public class DijkstraShotestPath {
static final int V=9;

	public static void main(String[] args) {
		int graph[][] = new int[][]{{0, 4, 0, 0, 0, 0, 0, 8, 0}, 
            {4, 0, 8, 0, 0, 0, 0, 11, 0}, 
            {0, 8, 0, 7, 0, 4, 0, 0, 2}, 
            {0, 0, 7, 0, 9, 14, 0, 0, 0}, 
            {0, 0, 0, 9, 0, 10, 0, 0, 0}, 
            {0, 0, 4, 14, 10, 0, 2, 0, 0}, 
            {0, 0, 0, 0, 0, 2, 0, 1, 6}, 
            {8, 11, 0, 0, 0, 0, 1, 0, 7}, 
            {0, 0, 2, 0, 0, 0, 6, 7, 0} 
           }; 
      //ShortestPath t = new ShortestPath(); 
        dijkstra(graph, 0); 
        
	}	
     public static void dijkstra(int[][]graph,int g) {
    	 int []dist= new int[V];
    	 for(int i=0;i<V;i++) {
    		 dist[i]=Integer.MAX_VALUE;
    		 
               }
    	 boolean []djset= new boolean[V];
    	 for(int i=0;i<V;i++) {
    		 djset[i]=false;
    	 }
    	 dist[0]=0;
    	 djset[0]=true;
    	
    	 for(int i=0;i<V-1;i++) {
    		/// pick the minum value
    		 int m=getMinimumFrom(dist,djset);
    		 djset[m]=true;
    		 for(int v=0;v<V;v++) {
    	      if(djset[v]==false && graph[m][v]!=0 &&
    	    		  dist[m]!=Integer.MAX_VALUE &&
    	    		 dist[m]+graph[m][v]<=dist[v] )
    	    	dist[v]=  dist[m]+graph[m][v];
                    		 
    		 }
    	 }
    	 printSolution(dist, V); 
    	 
     }
     public static int getMinimumFrom(int[]dist,boolean []djset) {
    	 int min=Integer.MAX_VALUE;
    	 int index=0;
    	 for(int i=0;i<V;i++) {
    		 if(djset[i]==false && dist[i]<min ) {
    			 min=dist[i];
    		      index=i;
    		 }
    	 }
    	 return index;
     }
    public static  void printSolution(int dist[], int n) 
     { 
         System.out.println("Vertex   Distance from Source"); 
         for (int i = 0; i < V; i++) 
             System.out.println(i+" tt "+dist[i]); 
     } 
}

