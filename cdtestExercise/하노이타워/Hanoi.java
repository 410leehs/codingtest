package �ϳ���Ÿ��;

public class Hanoi {
	public int tray=3;//���� ��
	public int bar=3;//���� ���� ���� �Ұ���
	int [][] rings;
	int result;
	public Hanoi(int tray) {
		this.tray=tray;//���� �� ����
		rings=new int [tray][bar];
	}
	int count=0;
	public char a;
	public char b;
	public char c;
	public void moveHanoi(int tray, char a,char b, char c) {
		this.a=a;
		this.b=b;
		this.c=c;
		this.tray=tray;
		if(tray==1) {
			result=1;
			count++;
			System.out.println("�� �̵� Ƚ��:"+result);
		}else {
			moveHanoi(tray-1,a,c,b);
			++count;
			System.out.printf(tray+":",+a+"����"+c+"��");
			moveHanoi(tray-1,b,a,c);
		}
			
}
}