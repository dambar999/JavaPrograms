package Backtracking;

import java.util.Iterator;

public class SudokuSolver {
	static int num=9;


	public static void main(String[] args) {
		 int grid[][] = {{3, 0, 6, 5, 0, 8, 4, 0, 0}, 
                 {5, 2, 0, 0, 0, 0, 0, 0, 0}, 
                 {0, 8, 7, 0, 0, 0, 0, 3, 1}, 
                 {0, 0, 3, 0, 1, 0, 0, 8, 0}, 
                 {9, 0, 0, 8, 6, 3, 0, 0, 5}, 
                 {0, 5, 0, 0, 9, 0, 6, 0, 0}, 
                 {1, 3, 0, 0, 0, 0, 2, 5, 0}, 
                 {0, 0, 0, 0, 0, 0, 0, 7, 4}, 
                 {0, 0, 5, 2, 0, 6, 3, 0, 0}}; 
		 
		 System.out.println(soveSudoko(grid,9));
		 print(grid,9);
	

	}
	
	public static  boolean soveSudoko(int[][]su,int n) {
		int col=-1,row=-1;
		boolean flag=true;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(su[i][j]==0) {
					row=i;
					col=j;
					flag=false;
					break;

				}
			}
			if(!flag) {
				break;
			}
		}

		if(flag) {
			return flag;
		}

	
			for(int k=1;k<=n;k++) {
				if(isSafec(su,row,col,k)){
					su[row][col]=k;
					if(soveSudoko(su,n)) {
						return true;
					}
					else {
						su[row][col]=0;
						//soveSudoko(su,n);
					}

				}

			}
		

		return false;
	}

	
	public static boolean isSafe(int su[][],int row,int col,int k) {

		boolean flag=true;
		for (int i = 0; i < row; i++) {
			if(su[i][col]==k) {
				flag=false;
			}
		}
		for (int i = 0; i < col; i++) {
			if(su[row][i]==k) {
				flag=false;
			}
		}
		for (int i = row-1; i <=row+1 ; i++) {
			for (int j = col-1; j <=col+1; j++) {
				if(i>=0 && j>=0 && i<num && j< num) {
					if(su[i][j]==k) {
						flag =false;
					}
				}

			}

		}
return flag;
	}
	public static boolean isSafec(int[][] board,  
			int row, int col,  
			int num)  
	{ 
		// row has the unique (row-clash) 
		for (int d = 0; d < board.length; d++)  
		{ 
			// if the number we are trying to  
			// place is already present in  
			// that row, return false; 
			if (board[row][d] == num)  
			{ 
				return false; 
			} 
		} 

		// column has the unique numbers (column-clash) 
		for (int r = 0; r < board.length; r++) 
		{ 
			// if the number we are trying to 
			// place is already present in 
			// that column, return false; 

			if (board[r][col] == num) 
			{ 
				return false; 
			} 
		} 

		// corresponding square has 
		// unique number (box-clash) 
		int sqrt = (int) Math.sqrt(board.length); 
		int boxRowStart = row - row % sqrt; 
		int boxColStart = col - col % sqrt; 
		//boxstart= row-row%sqrt ;

		for (int r = boxRowStart; 
				r < boxRowStart + sqrt; r++)  
		{ 
			for (int d = boxColStart;  
					d < boxColStart + sqrt; d++)  
			{ 
				if (board[r][d] == num)  
				{ 
					return false; 
				} 
			} 
		} 

		// if there is no clash, it's safe 
		return true; 
	} 
	public static void print(int[][] board, int N) 
	{ 
	    // we got the answer, just print it 
	    for (int r = 0; r < N; r++) 
	    { 
	        for (int d = 0; d < N; d++) 
	        { 
	            System.out.print(board[r][d]); 
	            System.out.print(" "); 
	        } 
	        System.out.print("\n"); 
	          
	        if ((r + 1) % (int) Math.sqrt(N) == 0)  
	        { 
	            System.out.print(""); 
	        } 
	    } 
	} 
	  

}
