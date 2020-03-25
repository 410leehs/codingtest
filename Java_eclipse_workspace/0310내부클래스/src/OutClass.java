
class OutClass {
	private int num=10;
	private static int sNum=20;
	private InClass inClass;
	public OutClass() {
		inClass = new InClass();
	}
	class InClass{
		int inNum=100;
		//static int sinNum=20;
		void inTest() {
			System.out.println("OutClass num="+num+"(외부클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum="+sNum+"(외부클래스의 스태틱 변수)");
		}
		//static void sTest() {
			
		//}
	}
}
