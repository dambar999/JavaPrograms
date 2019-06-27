package Backtracking;

public class RatNMaze {
  static int N=4;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//RatMaze rat = new RatMaze(); 
        int maze[][] = {{1, 0, 0, 0}, 
            {1, 1, 0, 1}, 
            {0, 1, 0, 0}, 
            {1, 1, 1, 1} 
        }; 
        solveMaze(maze); 

	}
	public  static  void  solveMaze(int [][]M) {
		int sol[][] = {{0, 0, 0, 0}, 
	            {0, 0, 0, 0}, 
	            {0, 0, 0, 0}, 
	            {0, 0, 0, 0} 
	        };
		if(solveMazeUtil(M,sol,0,0)==true) {
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					System.out.print(sol[i][j]+" ");
				}
				System.out.println();
			}
		}
		else {
			System.out.println("No Solution exists");
		}
		
	}
	public static boolean solveMazeUtil(int[][]m,int[][]sol,int row,int col) {
		
		if(row==N-1 && col==N-1 && m[row][col]==1) {
			sol[row][col]=1;
			return true;
			
		}
		
		if(isSafe(m,row,col)){
			sol[row][col]=1;
			
			if(solveMazeUtil(m,sol,row+1,col))
				return true;
			if(solveMazeUtil(m,sol,row,col+1))
				return true;
			sol[row][col]=0;
			//return false;
		}
		return false;
	}	
		
   public static boolean isSafe(int maze[][],int row,int col) {
	   if(row>=0 && col>=0 && row<N && col<N && maze[row][col]==1) {
		   return true;
		   
	      }
	   return false;
     }
	

}
