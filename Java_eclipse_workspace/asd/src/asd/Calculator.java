package asd;

public class Calculator {
	private int a;
	private int b;
	public Calculator() {//������:
		a=10;
		b=50;
	}
	public Calculator(int a, int b) {//������
		this.a=a;
		this.b=b;
	}
	public int f(int x) {//�޼ҵ�
		return a*b+x;
	}
	public static void main(String[] a) {
		Calculator calc1=new Calculator();//�ν��Ͻ�1
		Calculator calc2=new Calculator(2,10);//�ν��Ͻ�2
		int result=calc1.f(2);
		System.out.println(result);
		System.out.println(calc2.f(3));
	}
}
