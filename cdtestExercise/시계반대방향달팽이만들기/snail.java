package �ð�ݴ��������̸����;

public class snail {
	public static void process(int a) {
		int[][] arr = new int[a][a];
		int startx=1;//���� ����
		int i=0;//���󰡴� ��
		int j=0;//��
		int count=a*a;//������ ����
		int width=a;//�ø��ų� �����ϴ� ��
		int length=a-1;//�ø��ų� �����ϴ� ��
		//i ����,j ����, i����, j ���� �ݺ� 
		while(startx<=count) {
			for(int k=0;k<width;k++) {
				arr[i][j]=startx;
				i++;startx++;
			}width--;i--;j++;//width=6,i=6,j=1
			
			for(int k=0;k<length;k++) {
				arr[i][j]=startx;
				j++;startx++;//j=7
			}length--;i--;j--;//length=5,i=5,j=6
			
			for(int k=0;k<width;k++) {
				arr[i][j]=startx;
				i--;startx++;//i=0
			}width--;i++;j--;//width=5,i=1,j=5
			
			for(int k=0;k<length;k++) {
				arr[i][j]=startx;
				j--;startx++;//j=0
			}length--;i++;j++;//length=4,i=2,j=1
			
		}
		for(i=0;i<arr.length;i++) {
			for(j=0;j<arr[i].length;j++) {
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
	     	snail.process(7);
	}
}
