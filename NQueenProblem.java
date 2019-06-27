package Backtracking;

public class NQueenProblem {
  static final int N=4;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int board[][] = {{0, 0, 0, 0}, 
	            {0, 0, 0, 0}, 
	            {0, 0, 0, 0}, 
	            {0, 0, 0, 0} 
	        }; 
		 if (NQueenUtil(board, 0) == false) 
	        { 
	            System.out.print("Solution does not exist"); 
	            
	        } 
		 else {
	        printSolution(board);
		 }

	}
	 public static boolean NQueenUtil(int[][]mat,int col) {
		boolean flag =true;
		
		if(col>=N) {
			return true;
		}
		for (int i = 0; i < N; i++) {
			
			 if(isSafe(mat,i,col)){
        		 mat[i][col]=1;
        		 if(NQueenUtil(mat,col+1)) {
        			 return true;
        		 }
        		 else
        		 {
        			 mat[i][col]=0; 
        		 }
          }
			
		}
		return false;
		
	 }
	 
	public static boolean isSafe(int mat[][],int row, int col) {
		
		for(int i=0;i<col;i++) {
			if(mat[row][i]==1)
				return false;
		}
			
			for (int r=row,c=col;r>=0 && c>=0;r--,c--) {
				
					if(mat[r][c]==1) {
						return false;
					}
				}
				
			
				for(int r=row,c=col; r<N && c>=0;c--,r++) {
					if(mat[r][c]==1) {
						return false;
					}
				}
				
			
			return true;
		 
	 }
	/* A utility function to print solution */
   public static  void printSolution(int board[][]) 
    { 
        for (int i = 0; i < N; i++) 
        { 
            for (int j = 0; j < N; j++) 
                System.out.print(" " + board[i][j] 
                                 + " "); 
            System.out.println(); 
        } 
    } 
  
     
  
   }
