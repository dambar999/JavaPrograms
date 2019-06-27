package Graph;

class Level{
	static int max;
	static int min=20;
	
}
public class NoOfIsland {
      static  int Col=5;
      static  int Row=5;
      
	public static void main(String[] args) {
		 int M[][]=  new int[][] {{1, 1, 0, 0, 0}, 
             {0, 1, 0, 0, 1}, 
             {1, 0, 0, 1, 1}, 
             {0, 0, 0, 0, 0}, 
             {1, 0, 1, 0, 1} 
            }; 
		// TODO Auto-generated method stub
            countIsland(M);

	}
	public static void countIsland(int[][]M) {
		int count=0;
		boolean visited[][] = new boolean[Row][Col];
		for(int i=0;i<Col;i++) {
			for(int j=0;j<Row;j++) {
				int c=0;
				if(M[i][j]==1 && !visited[i][j]) {
				int re=	DFS(M,i,j,visited,c);
					count++;
					if(re<Level.min) {
						Level.min=re;
					}
					
				}
				
			}
		}
		System.out.println(count);
		System.out.println(Level.max);
		System.out.println(Level.min+1);
		
	}
	public static int DFS(int[][]M,int r,int c,boolean[][]visited,int co) {
		visited[r][c]=true;
		
		int x[]= {1,1,1,0,0,-1,-1,-1};
		int y[]= {-1,0,1,-1,1,-1,0,1};
		for(int i=0;i<8;i++) {
			if(isSafe(M,r+x[i],c+y[i],visited)){
				
				co++;
				if(co>Level.max) {
					Level.max=co;
				}
				DFS(M,r+x[i],c+y[i],visited,co);
				
			}
			
		}
		return co;
	}
	public static boolean isSafe(int[][]M,int r,int c,boolean[][] visited) {
		if(r>=0 && r<Row && c>=0 && c<Col && M[r][c]==1 && !visited[r][c])
			return true;
		return false;
	}

}
