package �ϳ���Ÿ��;
import java.util.Scanner;
public class Hanoii {
	int count=0;
	public static int tray;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int tray=sc.nextInt();
		
		Hanoii ha=new Hanoii();
		
		ha.moveHanoii(tray,"first","center","last");
		ha.showResult();
	}
	public void moveHanoii(int tray ,String first,String center,String last) {
	
		if (tray==1) {
			++count;
			System.out.println(tray+":"+first+"����"+last);
		}else {
			moveHanoii(tray-1,first,last,center);
			++count;
			System.out.println(tray+":"+first+"����"+last);
			moveHanoii(tray-1, center,first,last);
		}
	}
	public void showResult() {
		System.out.println("�� �̵� Ƚ����"+count);
	}
}
