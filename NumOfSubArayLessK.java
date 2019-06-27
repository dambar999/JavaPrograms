
public class NumOfSubArayLessK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {1,2,3,4};
		System.out.println(numberOfSubarrayLessThanK(arr,10));

	}
//
	public static int numberOfSubarrayLessThanK(int []arr,int k) {
		

		int counter=0;
		int product=1;
		for(int start=0,end=0;end<arr.length;end++) {
			product*=arr[end];
			while(start<end && product>=k) {
				product/=arr[start++];
			}
			
			counter+=end-start+1;
			
			
		}
				return counter;
    }
}
