
public class LongestCommonSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   String fstring="abcdfgb";
	   String sstring="abckdmhgb";
		System.out.println(longestcommSubsequence(fstring,sstring));

	}
///abdeejkn
	///abcjkm
	public static int longestcommSubsequence(String str1,String str2) {
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
					//result=Math.max(result, mem[i][j]);
					
					
				}
				else {
					mem[i][j]=Math.max(mem[i-1][j], mem[i][j-1]);
				}
				
			}
		}
	  return mem[m][n];
      }
}


