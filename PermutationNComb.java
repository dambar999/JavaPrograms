
public class PermutationNComb {
	static int size=3;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		permutate("","ABC");
		System.out.println("Combination");
		computate("","ABC");

	}
	
	public static void permutate(String pre,String str) {
		
		//if(pre.length()==size) {
			System.out.println(pre);
			
		//}
		for( int i=0;i<str.length();i++) {
		permutate(pre+str.charAt(i),str.substring(0, i)+str.substring(i+1));
		// A,BC
		//AB,C
		//
		}
		
	}
public static void computate(String pre,String str) {
		
		//if(pre.length()==size) {
			System.out.println(pre);
			
		//}
		for( int i=0;i<str.length();i++) {
		permutate(pre+str.charAt(i),str.substring(i+1));
		// A,BC
		//AB,C
		//
		}
		
	}

}
