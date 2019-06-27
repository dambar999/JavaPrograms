package fbok;

public class WordBoggle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dictionary[] = {"GEEKS", "FOR", "QUIZ", "GO"};
    char boggle[][]   = {{'G', 'I', 'Z'},
                    {'U', 'E', 'K'},
                    {'Q', 'S', 'E'}};
    
    System.out.println(isWordPresentUtil(boggle,"GIZKEU"));
	}
	
	static boolean isWordPresentUtil(char [][]boggle,String word) {
		
		for(int i=0;i<boggle.length;i++) {
			for(int j=0;j<boggle[0].length;j++) {
				if(boggle[i][j]==word.charAt(0)) {
					if(isWordPresent(boggle,i,j,word.substring(1)))
						return true;
					
				}
					
				}
			}
		return false;
		}
	public static boolean isSafe(int row, int col) {
		
		if(row>=0 && row<=2 && col>=0&& col<=2)
			return true;
		return false;
	}
		
		
	
  static boolean isWordPresent(char[][]boggle,int row, int col,String word) {
		
	  int x[]= {-1,-1,-1,0,0,1,1,1};
	  int y[]= {-1,0,1,-1,1,-1,0,1};

	  for(int k=0;k<8;k++) {
		 int  r=row+x[k];
		 int  c=col+y[k];
		  if(isSafe(r,c)){
			  if(boggle[r][c]==word.charAt(0)) {
				  if(word.length()==1) {
					  return true;
				  }
				  else {
					return   isWordPresent(boggle,r,c,word.substring(1));
				  }
					  

				  }

			  }
		  
	  }
	  return false;
			
		}
	

}
