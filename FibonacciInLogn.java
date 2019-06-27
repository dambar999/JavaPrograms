package ImprovedComplexity;

public class FibonacciInLogn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   System.out.println(fib(25));
   System.out.println(FibInConsTime(25));
	}
	
	public static int  fib(int n) {
		int F[][]= {{1,1},{1,0}};
		if(n==0)
			return -1 ;
		power(F,n-1);
		
		return F[0][0];
		
	}
 public static void  power(int[][]F,int n) {
	 int M[][]= {{1,1},{1,0}};
	 if(n==0||n==1)
		 return ;
	 
	 power(F,n/2);
	 multiply(F,F);
	 if(n%2!=0) {
		 multiply(F,M);
	 }
	
 }
   public static void  multiply(int [][]F,int [][]M) {
	 int x=F[0][0]*M[0][0]+F[0][1]*M[1][0];
	 int y=F[0][0]*M[1][0]+F[0][1]*M[1][1];
	 int z=F[1][0]*M[0][0]+F[1][1]*M[1][0];
	 int w=F[1][0]*M[0][1]+F[1][1]*M[1][1];
	 
	 F[0][0]=x;
	 F[0][1]=y;
	 F[1][0]=z;
	 F[1][1]=w;
	 
	 
  }
   
  //using direct formula
   
   public static int FibInConsTime(int n) {
	   
	  double temp= (Math.sqrt(5)+1)/2;
	 double pow= Math.pow(temp, n);
	 double fib= Math.round(pow/(Math.sqrt(5)));
	 return (int)fib;
	  
   }
}
