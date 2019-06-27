package dynamicprograming;


public class LongestIncreasingSubsequence {
static int  max_all=1;
	public static void main(String[] args) {
		//int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 }; 
		int arr[] = { 8,15,20,6,26};
		 int n = arr.length; 
		System.out.println(findLonIncSubsequence(arr,n));
		System.out.println(findLonIncSubsequenceDynamic(arr,n));
		// int n = arr.length; 
		 
		

	}
	public static int findLonIncSubsequence(int []arr,int n) {
		if(n==1)
			return 1;
		int res, max_ending_here=1;
		
		for(int i=1;i<n;i++) {
		 res=findLonIncSubsequence(arr,i);
			if(arr[i-1]<arr[n-1]&& res+1>max_ending_here) {
				max_ending_here=res+1;
			}
		}
		if(max_ending_here>max_all) {
			max_all=max_ending_here;
		}
		// Return length of LIS ending with arr[n-1] 
        //return max_ending_here; 
		return max_ending_here;
	}
	public static int findLonIncSubsequenceDynamic(int []arr,int n) {
		
		int  max=0;
		int m[]=new int[n];
		for(int i=0;i<n;i++) {
			m[i]=1;
		}
		
		for (int i = 0; i < n; i++) {
			for(int j=0;j<i;j++) {
				if(arr[j]<arr[i] && m[i]<(m[j]+1))
					m[i]=m[j]+1;
			}
			
		}
	for (int i = 0; i < n; i++) {
		if(max<m[i]) {
			max=m[i];
		}
		
	}
	return max;
	}
}
