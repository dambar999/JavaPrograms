package dynamicprograming;

import java.util.ArrayList;

class Interval {
	int buy;
	int sell;
}
public class StockBuySell {
static ArrayList<Interval>stock= new ArrayList<Interval>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int price[] = {100, 180, 260, 310, 40, 535, 695}; 
        int n = price.length; 
        maximizeProfit(price,n);
        
	}
    public static void maximizeProfit(int[]price,int n) {
    	int i=0;
    	while(i<n) {
    		while(i<n-1 && price[i+1]<=price[i]) {
    			i++;
    		  }
    		 if (i == n - 1) 
                 break; 
    			Interval in = new Interval();
    			in.buy=i++;
    			
    			while(i<n && price[i]>price[i-1]) {
    				i++;
    			}	
    				
    			in.sell=i-1;
    			stock.add(in);
    			
    			
    		}
    	for(Interval k:stock) {
    		System.out.println(price[k.buy]+" "+price[k.sell] );
    	}
    	}
	
  

}
