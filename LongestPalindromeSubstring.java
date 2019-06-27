package dynamicprograming;

public class LongestPalindromeSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word="madam";
		int len=word.length();
		findLongPalinSubstring(word,len);
	}
	
	public static void findLongPalinSubstring(String word,int n) {
		boolean dp[][]=new boolean[n][n];
		int start =0,maxlen=1;
		for(int i=0;i<n;i++) {
			dp[i][i]=true;
		}
		for(int i=0;i<n-1;i++) {
			if(word.charAt(i)==word.charAt(i+1)) {
			dp[i][i+1]=true;
			start =i;
			maxlen=2;
			}
		}
		for(int i=3;i<=n;i++) {
			for(int j=0;j<n-i+1;j++) {
				int k=j+i-1;
				if(dp[j+1][k-1] && word.charAt(j)==word.charAt(k)) {
					dp[j][k]=true;
				    start =j;
				    if(maxlen<i)
				    	maxlen=i;
				}
			}
		}
		System.out.println(maxlen+" "+ word.substring(start, start+maxlen));
	}

}
