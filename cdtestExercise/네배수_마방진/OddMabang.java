package �׹��_������;

public class OddMabang {
	public static void solution(int n) {
		int[][] answer=new int[n][n];
		int startx=0;
		int starty=(int) n/2;
		
		for (int i=1;i<=n*n;i++) {
			answer[startx][starty]=i;
            int tempx=startx; //�ǵ��� �� x
            int tempy=starty; //�ǵ��� �� y
			startx--;starty--;
			if(startx<0) {
				startx=n-1;
			}
			if(starty<0) {
				starty=n-1;
			}
			if(answer[startx][starty]!=0) {
	               startx=tempx;
	               starty=tempy;
	               startx=startx+1;
				
				if(startx>n) startx=0;
			}
			if(i==n*n+1) break;
		}
		
		

	   	
	      for(int i=0;i<n;i++) {
	    	  for(int j=0;j<n;j++) {
		         System.out.print(answer[i][j]+" ");
		      }
		      System.out.println();
	      }
	}
	  public static void main(String[] args) {
	      OddMabang.solution(3);
	  }

}

