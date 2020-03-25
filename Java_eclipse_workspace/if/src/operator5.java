
public class operator5 {
	public static void main(String[] args) {
		int num1=10;
		int num2=2;
		int answer=0;
		char operator='+';
		switch (operator) {
		case '+' : answer=num1+num2;
			break;
		case '-' : answer=num1-num2;
			break;
		case '*' : answer=num1*num2;
			break;
		case '/' : answer=num1/num2;
			break;

	}
		System.out.println(answer);
	}
}
