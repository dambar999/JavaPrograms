class GCF {
	public static void main (String[] args) {
		//code
		int[]arr= {1,2,3,4,5,6,7,8,9,10,11,12};
		rotate(arr,3);
		for(int i:arr) {
			System.out.println(i);
		}
		
		
	}
	
	public static  void rotate(int[]arr,int d){
	    for(int i=0;i<d;i++){
	        
	        int t= arr[i];
	        int j;
	        for( j=0;j<arr.length-2*d+1;j=j+d){
	            arr[j+i]=arr[j+d+i];
	            
	        }
	        arr[j+i]=t;
	    }
	    
	}
}