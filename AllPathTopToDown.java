package dynamicprograming;

public class AllPathTopToDown {
private static int n=3,m=2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//123  -3
		//1234- 1 1 1 1 ,  1 2 1  , 1 1 2   2  1 1,  2 2 
		//  12345-- 1 
  
		  int mat[][] = { 
				  {0, 0, 0},
				  {0, 0, 0}, 
				  {0, 0, 0},
				  {0, 0, 0}};
		  int m=mat.length;
		  int n=mat[0].length;
		  System.out.println(findAllPath(mat,m,n));
	}

	     public static int findAllPath(int[][]mat,int m,int n) {
	    	int  dp[][]=new int[m][n];
		    for (int i = 0; i < m; i++) {
		    	for (int j = 0; j <n; j++) {
		    		dp[i][j]=0;
					}
				}
		    if(mat[0][0]==0) {
		    	dp[0][0]=1;
		    	
		    }
		    for(int i=1;i<m;i++) {
		    	if(mat[i][0]==0)
		    	dp[i][0]=dp[i-1][0];
		    }
		    for (int i = 1; i < n; i++) {
		    	
				if(mat[0][i]==0) {
					dp[0][i]=dp[0][i-1];
					
				}
			}
		    for (int i = 1; i < m; i++) {
		    	for (int j = 1; j <n; j++) {
		    		if(mat[i][j]==0) {
		    			dp[i][j]=dp[i-1][j]+dp[i][j-1];
		    		}
					}
				}
		    return dp[m-1][n-1];
		
	}
}
