
public class LongestCommonSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   String fstring="abc";
	   String sstring="abc";
		System.out.println(longestSubstring(fstring,sstring));

	}
///abdeejkn
	///abcjkm
	public static int longestSubstring(String str1,String str2) {
		int m=str1.length();
		int n= str2.length();
		int mem[][]=new int[m+1][n+1];
		int result=0;
		
		for(int i=0;i<=m;i++) {
			
			for (int j = 0; j <=n; j++) {
				if(i==0||j==0) {
				mem[i][j]=0;
					
				}
				else if(str1.charAt(i-1)==str2.charAt(j-1)) {
					mem[i][j]=mem[i-1][j-1]+1;
					result=Math.max(result, mem[i][j]);
					
					
				}
				else {
					mem[i][j]=0;
				}
				
			}
		}
	  return result;
      }
}
