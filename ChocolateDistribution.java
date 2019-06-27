package arrays;

import java.util.Arrays;

public class ChocolateDistribution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = {12, 4, 7, 9, 2, 23, 
                 25, 41, 30, 40, 28, 
                 42, 30, 44, 48, 43, 
                50}; 
                  
     int m = 7;  // Number of students 
       
     int n = arr.length; 
     System.out.println("Minimum difference is "
             + findMinDiff(arr, n, m)); 

	}
   public static int findMinDiff(int []arr,int n,int m) {
	 Arrays.sort(arr); 
	 int min=Integer.MAX_VALUE;
	 int max_diff= Integer.MAX_VALUE;
	 int diff=0;
	 for(int i=0;i<n-m+1;i++ ) {
		 diff= arr[i+m-1]-arr[i];
		 if(diff<max_diff) {
			 max_diff=diff;
		 }
	 }
	 return max_diff;
	
    }

}
