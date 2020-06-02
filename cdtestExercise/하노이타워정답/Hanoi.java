package �ϳ���Ÿ������;

public class Hanoi {
	private int tray=3;
	private int bar=3;
	int[][] rings;
	
	//���� ���� �����ϰ� ������ ũ�⸦ ǥ���ϱ� ���� 2���� �迭�� 1,3,5�� �����ϴ� ������
	public Hanoi(int tray) {//�Ķ���� �Ѱܹޱ�
		this.tray=tray;
		rings=new int[tray][bar];
		for (int i=0 ;i<rings.length;i++) {
			int x=2*i+1;
			rings[i][0]=x;
			
		}
	}
	//�ܺο� ������ ũ�⸦ ǥ���ϴ� �迭�� ��ȯ
	public int [][] getRings(){
		return rings;
	}
	//���ü�num,�����̸� 3���� �Է¹޴´�
	public void moveHanoi(int num,char ringA,char ringB,char ringC) {
		//���ð� 1���� ���� A���뿡�� B����� ���� ū ���ø� �ű�� ��찡 �� �� �߻��Ѵ�. �׷��Ƿ� ��Ͱ� ������
		//������ ���ð� 1���� ���̴�.
		if (num==1) {
			System.out.println(ringA+"bar �ʿ� �ִ� ����"+ringB+"bar������ �̵�");
		}else {
			//���ð� 2�� �̻��� ���� ���ø� 1�� �ٿ��� �����ؾ��Ѵ�. �׷��Ƿ� n-1�� �ȴ�.
			//�׸��� C����� ���ø� �ű�� ������ �־���ϹǷ� moveHanoi�� �ٽ� ȣ���Ѵ�.
			moveHanoi(num-1,ringA,ringC,ringB);
			//A���뿡�� B����� �ű�� ���� ��ǥ�̹Ƿ� ���� ����� �ű� ���븦 ����Ѵ�.
			System.out.println(ringA+"bar �ʿ� �ִ� ����"+ringB+"bar������ �̵�");
			//�ٸ� ��͵� �ʿ��ѵ� C���뿡�� B����� �̵��ؾ� �Ѵ�.
			moveHanoi(num-1,ringC,ringB,ringA);
		}
	}
}
