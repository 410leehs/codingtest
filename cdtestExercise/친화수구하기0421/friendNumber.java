package 친화수구하기0421;

public class friendNumber {

	
	   public static int dividesum(int a) { //약수의 합 구하는 메소드
	   int sum=0;
		   for(int j=1; j<a; j++) {
		      if(a%j==0) sum=sum+j;
		      }
		      return sum;
		   }
	   
	   public static void divideprint(int a) {
		      System.out.print("[");
		      for(int i=1; i<a; i++) {
		         if(a%i==0) {
		            System.out.print(i+",");
		         }
		      }
		      System.out.print(a+"]");
		      System.out.println(" ");
		   }
	   
	public static void insert(int a,int b) {
		//int a=8;//a
		//int j=1;//약수
		int k=1;//b

		int j2;
		 for(int i=a; i<=b; i++) { //a에서 b사이의 하나씩 비교
	         for(int j=i; j<=b; j++) {
	            if((i!=j) && (i==dividesum(j)) && (j==dividesum(i))){ //친화수 조건 만족
	               System.out.println("("+i+", "+j+")는 친화수");
	               divideprint(i);
	               divideprint(j);
	            }
	         }
	      }
	   }
	   
	   public static void main(String[] args) {
	      insert(2,10000);
	   }

}
