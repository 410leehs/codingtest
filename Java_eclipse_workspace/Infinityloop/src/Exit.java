import java.util.*;

public class Exit {
	public static void main(String[] args) {
		int i=0;
		String[] group = new String[4];
		group[0]="현수";
		group[1]="건훈";
		group[2]="현석";
		group[3]="재은";
		Scanner input = new Scanner(System.in);
				for(;;) {
					String text=input.next();
					if (text.equalsIgnoreCase("exit")) {
						break;
					}
					else if(text.equalsIgnoreCase("1조")) {
						
						System.out.println(group[0]);
						
					}
					else if(text.equalsIgnoreCase("2조")) {
						
						System.out.println(group[1]);
						
					}
				}
	}
}
