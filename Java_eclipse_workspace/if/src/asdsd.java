
public class asdsd {
	public static void main(String [] args) {
		int age=27;
		String price="";
		if(age<8) {
			price="1000";
		}
		else if(age<14 && age>=8) {
			price="2000";
		}
		else if(age<20) {
			price="2500";
		}
		else if(age>=20 && age<60) {
			price="3000";
		}
		else if(age>=60) {
			price="0";
		}
		System.out.println(price+"¿ø");
	}
}
