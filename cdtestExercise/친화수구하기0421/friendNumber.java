package ģȭ�����ϱ�0421;

public class friendNumber {

	
	   public static int dividesum(int a) { //����� �� ���ϴ� �޼ҵ�
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
		//int j=1;//���
		int k=1;//b

		int j2;
		 for(int i=a; i<=b; i++) { //a���� b������ �ϳ��� ��
	         for(int j=i; j<=b; j++) {
	            if((i!=j) && (i==dividesum(j)) && (j==dividesum(i))){ //ģȭ�� ���� ����
	               System.out.println("("+i+", "+j+")�� ģȭ��");
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
