package JavaEx;

public class OddMagicSquare {
	public static void make(int odd) {
	      int[][] m = new int[odd][odd];
	         int startx=0;
	         int starty= (int) odd/2;
	         
	         for(int n=1; n<=odd*odd; n++) {
	            m[startx][starty] = n;
	            int tempx=startx; //되돌아 올 x
	            int tempy=starty; //되돌아 올 y
	            startx--;
	            starty--;
	            if(startx<0) { //윗벽 넘으면
	               startx=odd-1;
	            }
	            if(starty<0) { //왼쪽 벽 넘으면
	               starty=odd-1;
	            }
	            
	            if(m[startx][starty]!=0) { //이미 값 있으면
	               startx=tempx;
	               starty=tempy;
	               startx=startx+1;
	               if(startx>odd) startx=0;
	            }
	            if(n==odd*odd+1) break;
	         }

	         
	      for(int i=0; i<odd; i++) {
	         for(int j=0; j<odd; j++) {
	            System.out.print(m[i][j]+"  ");
	         }
	         System.out.println(" ");
	      }
	   }
	   public static void main(String[] args) {
	      OddMagicSquare.make(3);
	      OddMagicSquare.make(5);
	   }

}
