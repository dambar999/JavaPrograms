
public class Findingposition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findPosition(7));

	}
///only even position is selected from queue successively
	public static int findPosition(int n) {
		
		if(n==1) {
			return 1;
		}
		else
			return findPosition(n/2)*2;
	
		 
	}
}
