
public class average_calculator_Grade_while_project {
	public static void main(String[] args) {
		int[] study = new int[4];
		int i=0;
		int sum=0;
		study[0]=100;
		study[1]=90;
		study[2]=80;
		study[3]=70;
		
		while(i<4) {
			sum=sum+study[i];
			i++;
		}
		System.out.println(i);
		double GPA = sum/study.length;

		System.out.println("ЦђБе: " + GPA);
	}
}
