
public class operation4 {
	public static void main(String[] args) {
		int num1=10;
		int num2=2;
		int answer=0;
		char operator='+';
		if(operator=='+') {
			 answer= num1+num2;
		}
		else if(operator=='-') {
			answer=num1-num2;
		}
		else if(operator=='*') {
		 answer=num1*num2;
		}
		else if(operator=='/') {
			answer=num1/num2;
		}
		
		System.out.println(answer);
	}
}
