package dynamicprograming;

public class EggDropping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1,2 3 5,6
   System.out.println(findMinimumTrial(12,2));
   System.out.println(findMinimumTrialDynamic(12,2));
	}
     public static int  findMinimumTrial(int floors, int eggs) {
    	
    	 if(floors==0||floors==1)
    		 return floors;
    	 if(eggs==1) {
    		 return floors;
    	 }
    	 int min,i;
    	 int overall_min=Integer.MAX_VALUE;
    		 for( i=1;i<=floors;i++) {
    			min= Math.max(findMinimumTrial(i-1,eggs-1),findMinimumTrial(floors-i,eggs));
    			if(min<overall_min) {
    				overall_min=min;
    			}
    			
    		 }
    		 return overall_min+1;
    		 
    	 }
     public static int  findMinimumTrialDynamic(int floors, int eggs) {
    	 int dp[][]= new int [floors+1][eggs+1];
    	/*for(int i=1;i<=floors;i++) {
    			 dp[i][0]=0;
			}*/
    	 for(int i=1;i<=floors;i++) {
			 dp[i][1]=floors;
		}
    	 for(int i=1;i<=eggs;i++) {
			 dp[0][i]=0;
		}
    	 for(int i=1;i<=eggs;i++) {
			 dp[1][i]=1;
		}
    	 int min;
    
    	for(int f=2;f<=floors;f++) {
    		for(int e=2;e<=eggs;e++) {
    			dp[f][e]=Integer.MAX_VALUE;
    			for (int i = 1; i <=f; i++) {
    				min=1+Math.max(dp[i-1][e-1],dp[f-i][e]);
    				if(min<dp[f][e])
    					dp[f][e]=min;
    					}
    			}
    		
    	}
    	return dp[floors][eggs];
    	 
    	 
     }
      
    	 
}
