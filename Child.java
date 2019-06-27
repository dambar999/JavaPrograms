class parent{
	protected   void m1() {
		System.out.print("in parent m");
	}
}
public class Child extends parent {
	public void m1() {
		System.out.print("in child m");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    parent p= new Child();
    p.m1();
	}

}
