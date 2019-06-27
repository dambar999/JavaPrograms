package arrays;

import java.util.ArrayList;

class BuySell{
	
	int buy, sell;
}

public class SockBuySell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int price[] = {100, 180, 260,80,70, 310, 40, 535, 695}; 
	        int n = price.length; 
	  
	        // fucntion call 
	       stockBuySell(price,n); 

	}
	public static void  stockBuySell(int[]price,int n) {
		//BuySell stock= new BuySell();
		ArrayList<BuySell>list= new ArrayList<BuySell>();	
		int i=0;
		while(i<n) {
			BuySell stock= new BuySell();
		while(i<n-1 && price[i+1]<price[i]) {
			i++;
		}
	     
	     stock.buy=i;
	     while(i<n-1 && price[i+1]>price[i]) {
				i++;
			}
	     stock.sell=i;
	     i++;
	     list.add(stock);
	    }
		for(BuySell st:list) {
			System.out.println("buy in day  " + st.buy + "Sell in day"+ st.sell);
		}
    }
 }
