package Miscellanous;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern p = Pattern.compile("dam");
		Matcher m= p.matcher("dambar");
	System.out.println(m.find());	
	String s="jj";
	//s.compareTo(anotherString)
	 System.out.println(s.charAt(0)>=122);

	}

}
