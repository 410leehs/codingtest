
public class average_calculator_Grade_for_project {
	public static void main(String[] args) {
		int[] study = new int[4];
		int i=0;
		int sum=0;
		study[0]=100;
		study[1]=90;
		study[2]=80;
		study[3]=70;
		for(i=0;i<4;i++) {
			sum=sum+study[i];
			
		}
		double GPA = sum/(study.length);
		

		System.out.println("ЦђБе: " + GPA);
}
}