
public class MinimumMergeOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 4, 5,6, 5,1};
		int j= arr.length;
		int i=0;
		System.out.println(minOperation(arr));
	}
  public static int minOperation(int[]arr) {
	  int ans=0;
		for(int i=0,j=arr.length-1;i<j;) {
			
			if(arr[i]==arr[j]) {
			
				i++;
				j--;
			}
		else {
				
			if(arr[i]>arr[j]) {
				arr[j-1]+=arr[j];
				j--;
				ans++;
			}
			else{
				arr[i+1]+=arr[i];
				i++;
				ans++;
			}
		}
			
	}
		return ans;
	
 }
	
	}
