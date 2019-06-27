
public class MinCoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int coins[] = {9, 6, 5, 1}; 
        int m = coins.length; 
        int V = 11; 
        System.out.println ( "Minimum coins required is " 
                            + minCoins(coins, m, V)); 

	}
public static int minCoins(int []coins,int m,int V) {
	int table[]=new int[V+1];
	table[0]=0;
	//int min=Integer.MAX_VALUE;
	for(int k=1;k<=V;k++) {
		table[k]=Integer.MAX_VALUE;
	}
	
	for(int i=1;i<=V;i++) {
		for(int j=0;j<m;j++) {
			if(coins[j]<=i) {
				int min=table[i-coins[j]];
				if(min!=Integer.MAX_VALUE && min+1<table[i]) {
					table[i]=min+1;
				}
				
			}
			
		}
	}
	return table[V];
	
}
}
