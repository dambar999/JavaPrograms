
public class MinCostPath {

	public static void main(String[] args) {
		 int cost[][] = { {1, 2, 3}, 
                 {4, 8, 2}, 
                 {1, 5, 3} }; 
                   
          System.out.println("Normal:"+minCost(cost, 0, 0)); 
          System.out.print("dynamic Programming :" +minCostDynamicP(cost, 0, 0)); 
          
	}
    public static int minCost(int [][]arr,int x,int y) {
    	if(x>2||x<0||y>2||y<0)
    		return Integer.MAX_VALUE;
    	else if(x==2&& y==2)
    		return arr[x][y];
	   
	   return min(minCost(arr,x+1,y),minCost(arr,x,y+1),minCost(arr,x+1,y+1))+arr[x][y];
	
       }
    
    public static int min(int x,int y,int z) {
    	if(x>y) {
    		return y<z?y:z;
    	}
    	else
    		return x>z?z:x;
    	
    }//dynamic programming
    public static int minCostDynamicP(int [][]arr,int x,int y) {
    	int m[][]=new int[2+1][2+1];
    	m[0][0]=arr[0][0];
    	for(int i=1;i<3;i++) {
    		m[0][i]=m[0][i-1]+arr[0][i];
    	}
    	for(int i=1;i<3;i++) {
    		m[i][0]=m[i-1][0]+arr[i][0];
    	}
    	for(int i=1;i<3;i++) {
    		for(int j=1;j<3;j++) {
    			m[i][j]=min(m[i][j-1],m[i-1][j],m[i-1][j-1])+arr[i][j];
    		}
    	}
    	return m[2][2];
    }
}
