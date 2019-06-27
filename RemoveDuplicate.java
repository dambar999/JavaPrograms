import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,4,5,5,6,6};
		int count=0;
		Set set= new HashSet();
		StringBuilder builder= new StringBuilder();
		WeakReference<StringBuilder>weak= new WeakReference<StringBuilder>(builder);
		
		for(int i:arr) {
			
			if(set.contains(i)) {
				count++;
			}
			set.add(i);
		}
		set.forEach((i)->System.out.println(i));
		System.out.println("Count "+ count);

	}

}
