
public class NextSmallestPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num[] = { 9, 4, 1, 8, 7, 9, 7, 8, 3, 2, 2 }; 
        generateNextPalindrome(num, num.length); 

	}
	public static void printArray(int[]num) {
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]);
		}
	}
   public static void  generateNextPalindrome(int []num,int n) {
	   
	  if(checkAll9s(num)) {
		  System.out.print("1");
		  for(int i=1;i<=n-1;i++) {
			  System.out.print("0");
		  }
		  System.out.print("1");
	  }
	  else {
		  generateNextPalindromeUtil(num,n);
		  printArray(num);
	  }
}
   public static boolean checkAll9s(int []num) {
	   for(int i=0;i<num.length;i++) {
		   if(num[i]!=9) {
			   return false;
		   }
	   }
	   return true;
	   
   }
   public static void generateNextPalindromeUtil(int []num,int n) {
	   
	   int mid=n/2;
	   int left=mid-1;
	   int right= (n%2==0)?mid:mid+1;
		boolean leftSmaller=false;
	   while(left>=0 && right<n && num[left]==num[right]) {
		   left--;
		   right++;
	   }
	   
	   if(left>=0 && right<n && num[left]< num[right]) {
		   
		   leftSmaller=true;
	   }
	   
	   while(left>=0 && right<n) {
		   num[right++]=num[left--];
	   }
	   if(leftSmaller) {
		   int cary=1;
		   
		   /*if(n%2==1) {
			   num[mid]+=1;
			   cary=num[mid]/10;
			   num[mid]=num[mid]%10;
		   }*/
		  int i=mid-1;
		  int j=(n%2==0)?mid:mid+1;
		  
		  while(i>=0) {
			  num[i]=num[i]+cary;
			  cary= num[i]/10;
			  num[i]=num[i]%10;
			  num[j++]=num[i--];
		  }
	   }
		   
	   }
}
