package dynamicprograming;

public class KnapsackProblem {
	static int max=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int wt[]= {1,2,3,};
       int val[]= {3,5,4};
       int w=4;
       int n=val.length;
       System.out.println(findMaximumValue(wt,val,w,n));
       System.out.println(findMaximumValueDynamic(wt,val,w,n));
       }

 public static int findMaximumValue(int wt[],int val[],int w,int n) {
	  if(w==0||n==0)
			return 0;
		if(wt[n-1]>w) {
			findMaximumValue(wt,val,w,n-1);
			}
		else {
		max= Math.max(findMaximumValue(wt,val,w,n-1),val[n-1]+findMaximumValue(wt,val,w-wt[n-1],n-1));
		}
		return max;
		}
 public static int findMaximumValueDynamic(int wt[],int val[],int w,int n) {
	 
 
	 int dp[][]= new int[w+1][n+1];

	 for (int i = 0; i <=n; i++) {
	    dp[0][i]=0;
     }
	 for (int d = 0; d <=w; d++) {
		 dp[d][0]=0;
		
	}
	 
	
    for(int i=1;i<=w;i++) {
    	for(int j=1;j<=n;j++) {
    		if(wt[j-1]<=i) {
    			//int wt[]= {1,2,3,};
    		      //   int val[]= {3,5,4};
    			dp[i][j]=Math.max(dp[i][j-1],dp[i-wt[j-1]][j-1]+val[j-1]); 
    			
    		}
    		else
    			dp[i][j]=dp[i][j-1];
		
	
		}
         }
    return dp[w][n];
       }
 
}   
