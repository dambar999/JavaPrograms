class Parent{
	public  int m() {
		System.out.println("�n parent");
		return 6;
	}
	
}
 public class StaticChild extends Parent {
	public static int m() {
		System.out.println("�n child");
		return 7;
  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}
