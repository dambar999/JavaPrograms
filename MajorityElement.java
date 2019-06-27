
public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {3, 3, 4, 2, 4, 4, 2, 4, 4,2};
	   findMajority(arr);
		

	  }
	
	
	public static void  findMajority(int[]arr)
	{
		int maj_index=0;
		int count=1;
		int k=0;
		for (int i = 1; i < arr.length; i++) {
			if(arr[maj_index]==arr[i]) {
				count++;
			}
			else
			{
				count--;
				if(count==0) {
					maj_index=i;
					count=1;
				}
			}
			
		}
		if(count>1) {
			
		
		    for (int i = 0; i < arr.length; i++) {
			  if(arr[maj_index]==arr[i])
				  k++;
				
			
		    }
		    if(k>arr.length/2) {
		    	System.out.println("Majority elemenet " + arr[maj_index]);
		    	return ;
		    }
		   
		
	      }
		System.out.println("No Majority elemenet exist");
	}
}
