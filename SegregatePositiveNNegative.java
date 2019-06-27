
public class SegregatePositiveNNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {-1,3,3,-5,-6,2,6,9,-9,10,-2};
		seg(arr);
		

	}
	
	   public static void seg(int[]arr) {
		   int j=0;
		   int temp;
		   
		   for(int i=0;i<arr.length;i++) {
			   
			   if(arr[i]<0) {
				   if(i!=j) {

					   temp=arr[i];
					   arr[i]=arr[j];
					   arr[j]=temp;
				   }
				   j++;
			   }
			   
				   
			   }
		   for(int i:arr) {
			   System.out.print(i + " ");
		   }
			   
		   }
		
		
	}


