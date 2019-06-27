package MatrixRelated;

public class Transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  A[][] = { {1, 1, 1, 1}, 
                       {2, 2, 2, 2}, 
                       {3, 3, 3, 3}, 
                       {4, 4, 4, 4}}; 
		int row=A.length;
		int col= A[0].length;
		         
		for(int i=0;i<row;i++) {
			 for (int j = col-1; j>i; j--) {
				 int temp=A[i][j];
				 A[i][j]=A[j][i];
				 A[j][i]=temp;
				
			}
		}
		for(int i=0;i<row;i++) {
			 for (int j = 0; j<col; j++) {
				 System.out.print(A[i][j]);
		       }
			System.out.println(" ");
		}

 	}

}
