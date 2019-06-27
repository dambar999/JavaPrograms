
public class SubMatrixWithAllOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int M[][] = {{0, 1, 1, 0, 1},  
                {1, 1, 0, 1, 0},  
                {0, 1, 1, 1, 0}, 
                {1, 1, 1, 1, 0}, 
                {1, 1, 1, 1, 1}, 
                {0, 0, 0, 0, 0}}; 
          
    printMaxSubSquare(M); 

	}
	public static void printMaxSubSquare(int[][]M) {
		int r=M.length;
		int c= M[0].length;
		int[][]dp=new int[r][c];
		//firt column
		for(int i=0;i<r;i++) {
			dp[i][0]=M[i][0];
		}
		//first row
		for(int i=0;i<c;i++) {
			dp[0][i]=M[0][i];
		}
		for(int i=1;i<r;i++) {
			for(int j=1;j<c;j++) {
				if(M[i][j]==1) {
				dp[i][j]=Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]))+1;
				}
				else {
					M[i][j]=0;
				}
			}
		}
		int max_r=0;
		int max_c=0;
		int max_value=0;
		for(int i=1;i<r;i++) {
			for(int j=1;j<c;j++) {
				if(dp[i][j]>max_value) {
					max_value=dp[i][j];
					max_r=i;
					max_c=j;
				}
			}
		}
		for(int i=max_r;i>max_r-max_value;i--) {
			for(int j=max_c;j>max_c-max_value;j--) {
				System.out.print(M[i][j]);
			}
			System.out.println();
		}
	}

}
