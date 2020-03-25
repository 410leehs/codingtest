package asd;

public class Calculator {
	private int a;
	private int b;
	public Calculator() {//생성자:
		a=10;
		b=50;
	}
	public Calculator(int a, int b) {//생성자
		this.a=a;
		this.b=b;
	}
	public int f(int x) {//메소드
		return a*b+x;
	}
	public static void main(String[] a) {
		Calculator calc1=new Calculator();//인스턴스1
		Calculator calc2=new Calculator(2,10);//인스턴스2
		int result=calc1.f(2);
		System.out.println(result);
		System.out.println(calc2.f(3));
	}
}
