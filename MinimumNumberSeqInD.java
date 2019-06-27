import java.util.Stack;

public class MinimumNumberSeqInD {
 static String r;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="DDIDDIID";
		//findNumberSeq(str,"");
		System.out.println(getMinNuber4Patt(str));
		

	}
	public static String getMinNuber4Patt(String str) {
		Stack<Integer>stk= new Stack<Integer>();
		String result="";
		for (int i = 0; i <=str.length(); i++) {
			stk.push(i+1);
			if(str.length()==i||str.charAt(i)=='I') {
				while(!stk.isEmpty()) {
					result+=stk.pop();
				}
			}
		}
		return result;
		
	}
// not working index
	public static String findNumberSeq(String str,String result) {
		if(str.length()==0) {
		r=result;
		return r;
		}
    String r="";
		for(int i=1;i<=9;i++) {
			String s;
			if(str.charAt(0)=='I') {
				
				if(result.length()==0) {
					s=Integer.toString(i);
					 s+=Integer.toString(i+1);
				}
				else {
					 s=Integer.toString(i+1);
				}
			    
			    	if(i+1>9) {
			    		result="";
			    	}
			    	else {
			       r=  findNumberSeq(str.substring(1),result+s);
			           }
			}
			else {
				
				if(result.length()==0) {
					s=Integer.toString(i);
					 s+=Integer.toString(i-1);
				 }
				 else {
					 s=Integer.toString(i+1);
				  }
				 
				
				if(i-1<1) {
				    	result="";
				        }
				    else {
				    	r=	findNumberSeq(str.substring(1),result+s);
				    	 }
				 
				}
			if(r.length()==9)
				break;
			}
		return r;
		}
		
		//return r;
			
		

}
