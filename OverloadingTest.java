package Miscellanous;

import java.util.ArrayList;
import java.util.List;

public class OverloadingTest {
	public void m1(String s) { System.out.println("String");}
	public void m1(Object o) { System.out.println("Object");}

	
			
			
public static void main(String[] args) {
				OverloadingTest t = new OverloadingTest();
				t.m1(null); 		// String
				t.m1("A"); 		// String
				t.m1(""); 		// String
				t.m1(new StringBuffer("A"));	 	// Object
				t.m1(10); 			// Object
				t.m1(new Integer(10)); 	// Object
				List<Integer>list= new ArrayList<Integer>();
				int x=4;
				list.add(x);
				if(x==4)
				list.remove(x);

			}


		// TODO Auto-generated method stub

	}


