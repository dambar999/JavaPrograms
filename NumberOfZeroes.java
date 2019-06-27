
public class NumberOfZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 1, 1, 0, 0, 0, 0, 0}; 
		System.out.print(arr.length-countZeroes(arr,0,8));


	}
	public static int countZeroes(int[]arr,int low,int high) {
		
		if(low<high) {
			int mid=(low+high)/2;
			if(arr[mid]==0 && arr[mid-1]==1)
				return mid;
			if(arr[mid]==1) {
				return countZeroes(arr,mid+1,high);
			}
			else {
				return countZeroes(arr,low,mid-1);
				
			}
			
		}
		return  -1;
		
	}

}
