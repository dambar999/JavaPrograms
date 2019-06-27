package dynamicprograming;
class sum{
	static int sum;
}
public class SubsetSumProblem {

	public static void main(String[] args) {
		int set[] = {3, 34, 4, 12, 5, 2}; 
        int sum = 9; 

           System.out.println(findSubsetSum(set,sum,5));
	}
	public static boolean findSubsetSum(int []arr,int k ,int index) {
		if(k==0) {
		
			return true;
		}
		if(k<0|| index<0)
			return false;
		
		else
			return (findSubsetSum(arr,k-arr[index],index-1) ||findSubsetSum(arr,k,index-1));
	}	
		
		 
	
//dynamic programmimg
public static boolean findSubsetSumDynamic(int []arr,int k ,int index) {
	if(k==0) {
	
		return true;
	}
	if(k<0|| index<0)
		return false;
	
	else
		return (findSubsetSum(arr,k-arr[index],index-1) ||findSubsetSum(arr,k,index-1));
      }	
	
	 
   }


