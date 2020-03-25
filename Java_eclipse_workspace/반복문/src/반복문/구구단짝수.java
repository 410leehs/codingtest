package 반복문;

public class 구구단짝수 {

	public static void main(String[] args) {
		int i;
		int j;
		int k=0;
		for(i=2;i<=10;i++) {	
			for(j=1;j<=10;j++) {		
				if((i*j) %2==1) {		
					continue;		
				}
				System.out.println(i*j);
			}
			} 
		}
		}

