package �ϳ���Ÿ������;

public class HanoisMain {
	public static void main(String [] args) {
		int tray=4;//4���� ���ø� �غ��Ѵ�
		Hanoi ha =new Hanoi(tray);
		int [][] a =ha.getRings();
		HanoisUtil.showHanoi(a);//����4�忡 ���� �迭�� ����Ѵ�.
		HanoisUtil.moveHanoi(a,tray,'a','b','c');//�����̵������� �迭�� ����Ѵ�.
	}
}
