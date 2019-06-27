
public class JosephsuCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(getPosition(5,2));
		
		//1 2 3 4 5 
		//1 3 4 5 
		//1 3  5
		//3  5
		//3
		
   // return values  1 ,2%2+1,2%3+1,4%4+1,2%5+1= 3
    
 }
    
	public static int getPosition(int n ,int k) {
    	if(n==1) {
    		return 1;
    	}
          return (getPosition(n-1,k)+k-1)%n+1;
    }
}
