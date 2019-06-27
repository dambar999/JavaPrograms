package dynamicprograming;

public class LongestPalindromeSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word="kucumkyu";
		int len= word.length();
		System.out.println(findLongPalindromeSub(word,0,len-1));
		System.out.println(findLongPalindromeSubDynamic(word,0,len));
	}
    public static int findLongPalindromeSub(String word,int start,int end){
    	if(start==end) {
    		return 1;
    	}
    	if(word.charAt(start)==word.charAt(end)) {
    		if(start+1==end) {
    			return 2;
    		}
    		else {
    		return findLongPalindromeSub(word,start+1,end-1)+2;
    		}
    	}
    	else {
    		return Math.max(findLongPalindromeSub(word,start,end-1), findLongPalindromeSub(word,start+1,end));
    	}
    	
    }
    public static int findLongPalindromeSubDynamic(String word,int start,int end){
    	int dp[][]= new int[end][end];
    	//f
    	
    	for(int i=0;i<end;i++) {
    		dp[i][i]=1;
    	}
    	for(int i=2;i<=end;i++) {
    		for(int j=0;j<=end-i;j++) {
    			int k=j+i-1;
    			if(word.charAt(j)==word.charAt(k)) {
    				if(i==2) {
    					dp[j][k]=2;
    				}
    				else
    					dp[j][k]=dp[j+1][k-1]+2;
    				
    			}
    			else
    				dp[j][k]=Math.max(dp[j+1][k], dp[j][k-1]);    			
    		}
    	}
    	return dp[0][end-1];
    	
    }
}
