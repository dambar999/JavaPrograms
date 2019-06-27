
public class MaximumStolenValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hval[] = {6, 7, 1, 3, 8, 2, 4};
		int k= hval.length;
		System.out.print(findMaximumStolen(hval,k));
	}

	static int findMaximumStolen(int[]val,int k) {
		if(k==1)
			return val[0];
		if(k==2) {
			return Math.max(val[0],val[1]);
		}
			int dp[]=new int[k];
			dp[0]=val[0];
			dp[1]=Math.max(val[0],val[1]);
			
			for(int i=2;i<k;i++) {
				dp[i]=Math.max(dp[i-1], dp[i-2]+val[i]);
			}
				
				return dp[k-1];
			
		}
	}

