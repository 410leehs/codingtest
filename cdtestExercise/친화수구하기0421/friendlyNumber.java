package 친화수구하기0421;

public class friendlyNumber {
	
	public static void make(int a) {
		int suma=0;
		for(int i=1;i<a;i++){
			if(a%i==0){
				suma=suma+i;
			}
		}
		int b=suma;
		int sumb=0;
		for(int j=1;j<b;j++){
			if(b%j==0){
				sumb=sumb+j;
			}
		}
		int c=sumb;
		if(a==c){
			System.out.println(a+"와"+b+"는 친화수");
		
		}else {
			System.out.println("두 수는 친화수 아님");
		}
	}
	
	public static void main(String [] args) {
		friendlyNumber.make(220);

}
}

	