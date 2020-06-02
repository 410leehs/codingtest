package 홀수마방진;

public class OddMagicSquare {
	public static void OddMagicSquare(int odd) {
		int[][] arr = new int[odd][odd];
		int startx=0;		//공간
		int starty=(int) odd/2;	//공간
		
		int tempx=startx;		//숫자
		int tempy=starty;		//숫자
	
		for(int i=1; i<=odd*odd;i++){
		arr[startx][starty]=i;
		startx--;starty--;
		if(startx<0){//윗벽 만나면
		startx=odd;
		}
		if(starty<0){//왼벽 만나면
		starty=odd-1;
		}
		if(arr[startx][starty] !=0){//이미 값이 있다면
		startx++;
		}
		}
		
	    for(int i=0; i<odd; i++) {
	        for(int j=0; j<odd; j++) {
	           System.out.print(arr[i][j]+"  ");
	        }
	        System.out.println(" ");
	     }
	}
	   public static void main(String[] args) {
		      OddMagicSquare.OddMagicSquare(3);
	   }
}
