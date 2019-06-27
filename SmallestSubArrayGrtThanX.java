
public class SmallestSubArrayGrtThanX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {1, 4, 45, 6, 10, 19}; 
		int len= arr1.length;
		int x=51;
		System.out.println(findSmallestSubarray(arr1,x,len));
	}

	
	  public  static  int findSmallestSubarray(int[]a,int x,int n) {
		  int sum=0;
		  int start =0;
		  int end=0;
		  int min=Integer.MAX_VALUE;
		  while(end<n) {
			  while(sum<=x && end<n ) {
				  sum+=a[end++];
			  }
			  while(sum>x&& start<n) {
				  if(end-start<min) {
					  min=end-start;
				  }
				  sum-=a[start++];
			  }
		  }

		  return min;
	  }
}
