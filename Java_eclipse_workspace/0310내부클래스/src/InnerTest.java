
public class InnerTest {
	public static void main(String [] args) {
		//외부 클래스 생성하지 않고 바로 정적 내부 클래스 생성
		//OutClass.InStaticClass sinClass =new OutClass.InStaticClass();
		System.out.println("정적 내부 클래스 일반 메서드 호출");
		//sinClass.inTest();
		
		System.out.println();
		
		System.out.println("정적 내부 클래스의 스태틱 메서드 호출");
		//OutClass.InStaticClassTest();
	}
}
