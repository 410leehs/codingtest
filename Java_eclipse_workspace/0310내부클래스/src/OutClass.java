
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
			System.out.println("OutClass num="+num+"(�ܺ�Ŭ������ �ν��Ͻ� ����)");
			System.out.println("OutClass sNum="+sNum+"(�ܺ�Ŭ������ ����ƽ ����)");
		}
		//static void sTest() {
			
		//}
	}
}
