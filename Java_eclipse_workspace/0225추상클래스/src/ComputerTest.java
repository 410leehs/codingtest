
public class ComputerTest {
	public static void main(String[] args) {
	//Computer c1 = new Computer();//추상클래스는 인스턴스화 하지 못한다.
	Computer c2 = new DeskTop();
	//Computer c3 = new NoteBook();
	Computer c4 = new MyNoteBook();
	}
}
