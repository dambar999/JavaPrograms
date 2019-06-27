
public class RectangleOverlap {
	
	static class Point{
		int x,y;
	}

	public static void main(String[] args) {
       Point l1= new Point();
       Point r1= new Point();
       Point l2= new Point();
       Point r2= new Point();
       l1.x=0;l1.y=10; r1.x=6;r1.y=0; 
       l2.x=5;l2.y=5; r2.x=15;r2.y=0; 
       System.out.println("Dooverlap:"+doOverlap(l1,r1,l2,r2) );
	}  
	 static  boolean doOverlap(Point l1, Point r1, Point l2, Point r2) {
		if(r1.x<l2.x||r2.x<l1.x) {
			return false;
		}
		else if(r1.y>l2.y||r2.y>l1.y) {
			return false;
		}
		else {
			return true;
		}
		
	 }

}
