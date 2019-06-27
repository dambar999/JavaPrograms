package practise;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
	
	
public  static int rollDice() {
	Random r= new Random();
	
	int n=r.nextInt(7);
	return (n==0)?1:n;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int playerNumber= -1;
		String str;
		Scanner s= new Scanner(System.in);
		str= s.next();
		
		do {
			System.out.println(playerNumber==-1?"\nFirst player":"\nSecond Player");
			System.out.println("Please press r to roll dice");
			int diceValue= rollDice();
			if(playerNumber==-1) {
				
				
			}
			
		}while("r".equals(str));
		

	}

}
