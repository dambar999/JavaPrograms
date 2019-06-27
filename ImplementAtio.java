
public class ImplementAtio {

	public static void main(String[] args) {
		String str = "112"; 
		int n = str.length();
		//printf("%d", myAtoiRecursive(str, n)); 
		System.out.println(myAtoiRecursive(str,n));

		
		
		
public static int myAtoiRecursive(String str, int n) 
		{ 
			// Base case (Only one digit) 
			if (n == 1) 
				return str - '0'; 
		  

			// If more than 1 digits, recur for (n-1), multiplu result with 10 
			// and add last digit 
			return (10 * myAtoiRecursive(str, n - 1) + str.charAt(n-2) - '0'); 
		} 

		
	}

}
