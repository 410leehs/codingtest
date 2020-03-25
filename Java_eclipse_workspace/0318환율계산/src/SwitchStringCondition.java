//String switch
import java.util.Scanner;
public class SwitchStringCondition {
	public static double toMoney(String c) {
		double tot=0.0;
		switch(c) {
		case "USD":tot=1126.5;break;
		case "JNY":tot=110.6;break;
		case "CNY":tot=10.5;break;
		default:tot=1;break;
		}
		return tot;
	}

	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		String text=input.next();
		
		//String money="USD";
		
		double result=toMoney(text);
		
		System.out.printf("%s=>%f\n",text,result);
	}
}
