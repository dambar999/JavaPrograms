package dynamicprograming;

public class Knapsack01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int wt[]= {1,2,3,5};
	       int val[]= {3,5,4,10};
	       int w=6;
	       int n=val.length;
	      System.out.println(solveKnapSack(wt,val,w,n));

	}
   public static int solveKnapSack(int []wt,int []val,int W,int n){
	   int dp[][]= new int [W+1][n+1];
	   
	   for(int w=0;w<=W;w++) {
		   for (int i = 0; i <= n; i++) {
			   if(w==0||i==0) 
				   dp[w][i]=0;
			   else {


				   if(wt[i-1]>w) {
					   dp[w][i]=dp[w][i-1];
				   }
				   else {
					   dp[w][i]= Math.max(dp[w][i-1], dp[w-wt[i-1]][i-1]+val[i-1]);
				   }
			   }

		   }

	   }
	   return dp[W][n];
    }
}
