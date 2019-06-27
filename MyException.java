package Miscellanous;

public class MyException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Exception related Question :
			try {
			System.out.println("Hello");
			Class.forName("a");
			}
			catch (ClassNotFoundException e) {  
			}

		//	Output : // Compile-Time error This exception is never thrown from the try statement body

	}

}
