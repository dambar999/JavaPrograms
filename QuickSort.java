package SortingSearching;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {4,5,1,2,5,8,9,29,5};
		quickSort(arr,0,8);
		for(int i:arr) {
			System.out.println(i);
			
		}
		}
  
	public static int findPartition(int[]arr,int low,int high){
		int pivot=arr[high];
		int i=low-1;
		for(int j=low;j<high;j++) {
			if(arr[j]<=pivot) {
				i++;
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
			}
		}
		int t=arr[i+1];
		arr[i+1]=pivot;
		arr[high]=t;
		
    return i+1;	 
     }
	public static void quickSort(int arr[],int l ,int h) {
		int p;
		if(l<h) {
			p= findPartition(arr,l,h);
		  quickSort(arr,l,p-1);
		  quickSort(arr,p+1,h);
				
		}
		
	}
}
