package dynamicprograming;

public class LongestPathInMatrix {
	static int n=3,m=3;

	public static void main(String[] args) {
		 int  mat[][] = { {1, 2, 9}, 
                 {5, 3, 8}, 
                 {4, 6, 7} 
                 }; 
   System.out.println("Length of the longest path is " +  
		   findLongestPath(mat,3,3)); 
		

	}
	public static int findLongestPath(int [][]mat,int n,int m) {
		int result=1;
		
		int dp[][]=new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				dp[i][j]=-1;
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				
				if(dp[i][j]==-1) {
					findLongestPathFromCell(i,j,mat,dp);
					result=Math.max(result,dp[i][j]);
				}
			}
		}
		return result;
	}
	 public static int findLongestPathFromCell(int i,int j,int[][]mat,int[][]dp) {
		if(i<0||i>=n||j<0||j>=m) {
			return 0;
		}
		// If this subproblem is already solved 
        if (dp[i][j] != -1) 
            return dp[i][j]; 
   
		
		if(i+1<n && (mat[i][j]+1==mat[i+1][j])) {
			dp[i][j]=1+findLongestPathFromCell(i+1,j,mat,dp);
			
		}
		if(i>0 && (mat[i][j]+1==mat[i-1][j])) {
			dp[i][j]=findLongestPathFromCell(i-1,j,mat,dp);
			
		}
		if(j+1<n && (mat[i][j]+1==mat[i][j+1])) {
			dp[i][j]=findLongestPathFromCell(i,j+1,mat,dp);
			
		}
		if(j>0 && (mat[i][j]+1==mat[i][j-1])) {
			dp[i][j]=findLongestPathFromCell(i,j-1,mat,dp);
			
		}
		return dp[i][j]=1;
	}

}
