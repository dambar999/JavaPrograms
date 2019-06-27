package String;

public class FirstNonRepeatingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "geeksforgeeks"; 
		int n=nonRepeating(str);
		if(n==-1) {
			System.out.println("All are repeating");
		}
		else
		{
			System.out.println("The first non repeating character is "+ str.charAt(n));
		}

	}
  public static int nonRepeating(String str) {
	  int count[]=new int [256];
	 int index=-1;
	  for(int i=0;i<str.length();i++) {
		 count[str.charAt(i)]++; 
	  }
	
	  for(int i=0;i<str.length();i++) {
			 if(count[str.charAt(i)]==1) {
				 //return str.charAt(i);
				 index=i;
				 break;
			 }
		  }
	  return index;
   }

}
