package 하노이타워정답;

public class HanoisMain {
	public static void main(String [] args) {
		int tray=4;//4장의 접시를 준비한다
		Hanoi ha =new Hanoi(tray);
		int [][] a =ha.getRings();
		HanoisUtil.showHanoi(a);//접시4장에 대한 배열을 출력한다.
		HanoisUtil.moveHanoi(a,tray,'a','b','c');//접시이동과정을 배열로 출력한다.
	}
}
