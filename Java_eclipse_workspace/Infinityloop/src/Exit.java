import java.util.*;

public class Exit {
	public static void main(String[] args) {
		int i=0;
		String[] group = new String[4];
		group[0]="����";
		group[1]="����";
		group[2]="����";
		group[3]="����";
		Scanner input = new Scanner(System.in);
				for(;;) {
					String text=input.next();
					if (text.equalsIgnoreCase("exit")) {
						break;
					}
					else if(text.equalsIgnoreCase("1��")) {
						
						System.out.println(group[0]);
						
					}
					else if(text.equalsIgnoreCase("2��")) {
						
						System.out.println(group[1]);
						
					}
				}
	}
}
