package 하노이타워;

public class HanoiMain {

	public static void main(String[] args) {
		int tray=3;
		
		Hanoi ha=new Hanoi(tray);
		ha.moveHanoi(tray,'a','b','c');

	}

}
