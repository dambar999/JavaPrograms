interface FunctionalInterfce {
	public void display(int i);
}
public class LamdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionalInterfce fi=(i)->System.out.println(i);
		fi.display(2);
	}

}
