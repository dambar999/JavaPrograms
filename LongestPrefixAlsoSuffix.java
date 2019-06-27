
public class LongestPrefixAlsoSuffix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String str= "abkmncabkmn";
     longestPrexSuffix(str);
	}

	public static void  longestPrexSuffix(String str) {
	 
		int mid=str.length()/2;
		
		int left =mid-1;
		int right=(str.length()%2==0)?mid:mid+1;
		for(int l=0;l<mid;l++) {
			int le=left;
			int rt=str.length()-1;
		    while(le-l>=0 && str.charAt(le-l)==str.charAt(rt)){
			
		    	le--;
		    	rt--;
		   }
		if(le-l<=0) {
			System.out.println(mid-l);
			break;
		}
     }
		}
		
}
