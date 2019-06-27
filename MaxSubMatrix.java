package MatrixRelated;

public class MaxSubMatrix {
	static int  N=5;

	public static void main(String[] args) {
		{ 
		    int mat[][] = {{1, 1, 1, 1, 1}, 
		        {2, 2, 2, 2, 2}, 
		        {3, 8, 6, 7, 3}, 
		        {4, 4, 4, 4, 4}, 
		        {5, 5, 5, 5, 5}, 
		    }; 
		    int k = 3; 
		   
		    maxSumsubMatrix(mat,k);

	}
		

   }
	static void maxSumsubMatrix(int[][]mat,int k) {
		int sumMatrix[][]=new int[N][N];
		int sum=0;
		for(int j=0;j<N-k+1;j++) {
			sum=0;
			for(int x=0;x<k;x++) {
				sum+=mat[x][j];
			}
			sumMatrix[0][j]=sum;
			for(int x=1;x<N-k+1;x++) {
				sum+=mat[k+x-1][j]-mat[x-1][j];
				sumMatrix[x][j]=sum;
			}
				
			}
		int max_sum=Integer.MIN_VALUE;
		 int sumT=0;int posRow=0;
		 int posCol=0;
            for(int i=0;i<N-k+1;i++) {
            	sumT=0;
			int x;
			for(x=0;x<k;x++) {
				sumT+=sumMatrix[i][x];
			}
			if(sumT>max_sum) {
				max_sum=sumT;
				posRow=i;
				posCol=0;
			}
			//sumMatrix[0][j]=sum;
			for( x=1;x<N-k+1;x++) {
				sumT+=sumMatrix[i][k+x-1]-sumMatrix[i][x-1];
				if(sumT>max_sum) {
					max_sum=sumT;
					posRow=i;
					posCol=x;
				}
			}
				
			}
            
            for(int a=posRow;a<k+posRow;a++) {
            	for(int b=posCol;b<k+posCol;b++) {
            		System.out.print(mat[a][b]);
            	}
            	System.out.println();
            }
		
		
	}
}
