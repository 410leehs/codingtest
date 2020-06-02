package 하노이타워;

public class Hanoi {
	public int tray=3;//접시 수
	public int bar=3;//막대 수는 변경 불가능
	int [][] rings;
	int result;
	public Hanoi(int tray) {
		this.tray=tray;//접시 수 변경
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
			System.out.println("총 이동 횟수:"+result);
		}else {
			moveHanoi(tray-1,a,c,b);
			++count;
			System.out.printf(tray+":",+a+"에서"+c+"로");
			moveHanoi(tray-1,b,a,c);
		}
			
}
}