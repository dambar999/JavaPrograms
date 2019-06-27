

class Entry<K,V>{
	K key;
	V value;
	Entry<K,V> Next;
	Entry (K key,V value){
		this.key=key;
		this.value=value;
		Next=null;
	}
	
	
}


public class MyCustomHashMap<K,V> {
	Entry<K,V>[]entryList;
	int capacity=0;
	int size=0;
	
	MyCustomHashMap(){
		MyCustomHashMap(16);
		
	}
      MyCustomHashMap(int n){
    	  entryList=new Entry[n];
    	  capacity=n;
		
	}
      public void put(K key,V value) {
    	  int hashcode=key.hashCode()%capacity;
    	   int flag=0;
    	  if(entryList[hashcode]==null) {
    		  entryList[hashcode]=new Entry(key,value);
    		  
    		   size=size++;
    	  }
    		  
    	  else {
    		  while(entryList[hashcode].Next!=null) {
    			  if(entryList[hashcode].key==key) {
    				  entryList[hashcode].value=value;
    				  flag++;
    				  break;
    			  }
    			  entryList[hashcode].Next= entryList[hashcode].Next.Next;
    			  
    		  }
    		  if(flag==0) {
    			  entryList[hashcode].Next =new Entry(key,value);
    			  size++;
    		  }
    		  
    	  }
    	  
    	  
    	  
    	  
      }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
