package dynamicprograming;

public class WordBreak {
  static String []dict= {"i","like","coffe","banana","dont"};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sen="ilikecoffebanana";
		System.out.println(canSentenceBeBroken(sen));

	}
	
	public static  boolean wordExist(String w) {
		for(int i=0;i<dict.length;i++) {
			if(dict[i].equals(w))
				return true;
		}
		return false;
	}
	
	public static boolean canSentenceBeBroken(String sentence) {
		if(sentence.length()==0)
			return true;
		
		for(int i=0;i<sentence.length();i++) {
			if(wordExist(sentence.substring(0, i+1)) && canSentenceBeBroken(sentence.substring(i+1)))
				return true ;
		}
		return false;
		
	}
	public static boolean canSentenceBeBrokenDynamic(String sentence) {
		if(sentence.length()==0)
			return true;
	   
		boolean  dp[]= new boolean[sentence.length()+1];
		for(int i=0;i<sentence.length()+1;i++) {
			dp[i]=false;
		}
	
		
		for(int i=0;i<sentence.length();i++) {
			
			
		}
		
		for(int i=0;i<sentence.length();i++) {
			if(wordExist(sentence.substring(0, i+1)) && canSentenceBeBroken(sentence.substring(i+1)))
				return true ;
		}
		return false;
		
	}

 }
