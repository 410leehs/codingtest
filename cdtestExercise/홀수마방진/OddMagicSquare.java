package Ȧ��������;

public class OddMagicSquare {
	public static void OddMagicSquare(int odd) {
		int[][] arr = new int[odd][odd];
		int startx=0;		//����
		int starty=(int) odd/2;	//����
		
		int tempx=startx;		//����
		int tempy=starty;		//����
	
		for(int i=1; i<=odd*odd;i++){
		arr[startx][starty]=i;
		startx--;starty--;
		if(startx<0){//���� ������
		startx=odd;
		}
		if(starty<0){//�޺� ������
		starty=odd-1;
		}
		if(arr[startx][starty] !=0){//�̹� ���� �ִٸ�
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
