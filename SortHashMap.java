package SortingSearching;

import java.util.HashMap;
import java.util.*;

public class SortHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer>hm=new HashMap<String,Integer>();
		hm.put("java",5);
		hm.put("c",2);
		hm.put("ruby",1);
		hm.put("python",4);
		List<Map.Entry<String,Integer>>list = new ArrayList<Map.Entry<String,Integer>>(hm.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<String,Integer>>(){
			public int compare(Map.Entry<String,Integer>e1,Map.Entry<String,Integer> e2) {
				return e1.getValue()-e2.getValue();
				
			}
		});
		
		Map<String,Integer>lhm=new LinkedHashMap<String,Integer>();
		
		for(Map.Entry<String,Integer>entry:list) {
			lhm.put(entry.getKey(), entry.getValue());
		}

		for(Map.Entry<String,Integer>entry1:lhm.entrySet()) {
			System.out.println(entry1.getKey() + " : " + entry1.getValue());
		}
	}

}
