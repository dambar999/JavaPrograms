package practise;

import java.util.ArrayList;
import java.util.HashMap;

public class CalculateAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String [][]marks= {{"Rohan","10"},{"suman","36"},{"josh","33"},{"suman","24"},{"Rohan","30"},{"Rohan","50"}};
       HashMap<String,ArrayList<Integer>>namemap= new HashMap<String,ArrayList<Integer>>();
       for(int i=0;i<marks.length;i++) {
    	   if(namemap.containsKey(marks[i][0])) {
    		   ArrayList<Integer> list= namemap.get(marks[i][0]);
    		   list.set(0 ,list.get(0)+Integer.parseInt(marks[i][1]));
    		   list.set(1,list.get(1)+1);
    		   namemap.put(marks[i][0], list);
    	   }
    	   else {
    		   int mar=Integer.parseInt(marks[i][1]);
    		   ArrayList<Integer>list= new ArrayList<Integer>();
    		   list.add(mar);
    		   list.add(1);
    		   namemap.put(marks[i][0], list);
    	   }
       }
       
       namemap.forEach((k,v)-> System.out.println(k+ " " +v.get(0)/v.get(1)) );
       
	}

}
