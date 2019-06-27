package String;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LargestNumberFormed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>arr= new ArrayList<String>();
		arr.add("54"); 
        arr.add("546"); 
        arr.add("548"); 
        arr.add("60"); 
        Collections.sort(arr, new Comparator<String>() {
        	@Override
        	public int compare(String s1,String s2) {
        		String s3=s1+s2;
        		String s4=s2+s1;
        		return s3.compareTo(s4)>0?-1:1;
        		
        	}
        	
        });
        for(String s:arr) {
        	System.out.print(s);
        }

	}
	

}
