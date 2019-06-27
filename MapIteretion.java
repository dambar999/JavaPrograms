import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;



public class MapIteretion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer>map= new HashMap<String,Integer>();
		map.put("abhi",28);
		map.put("rohan",31);
		map.put("sohan",23);
		Iterator itr= map.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry entry= (Entry) itr.next();
			System.out.println(entry.getKey() + ":"+ entry.getValue());
			
		}
		for(Map.Entry<String,Integer>entry:map.entrySet()) {
			System.out.println(entry.getKey() + ":"+ entry.getValue());
			
		}
		
		map.forEach((k,v)->System.out.println(k+":"+v ));

	}

}
