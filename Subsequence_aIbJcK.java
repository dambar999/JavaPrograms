package String;

public class Subsequence_aIbJcK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abbcbcc";
		System.out.println(numberOfSubsequence(str));

	}
	public static int numberOfSubsequence(String str) {
		int aCount=0,bCount=0,cCount=0;
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)=='a') {
				aCount=1+2*aCount;
			}
			if(str.charAt(i)=='b') {
				bCount=aCount+2*bCount;
			}
			if(str.charAt(i)=='c') {
				cCount=bCount+2*cCount;
			}
		}
		return cCount;
	}

}
