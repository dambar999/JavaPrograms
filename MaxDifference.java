
public class MaxDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {1,5,6,43,63,0,64};
		System.out.println(findMaxDiff(arr));
	  }

	public static int findMaxDiff(int[]arr){
		int maxdiff=arr[1]-arr[0];
		int min=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]-min>maxdiff) {
				maxdiff=arr[i]-min;
			}
			if(arr[i]<min) {
				min=arr[i];
			}
			
		}
		return maxdiff;
		
		
		
		
	}

}
