import java.io.IOException;
public class SchedulerTest {
	public static void main(String[] args) throws IOException{
		System.out.println("��ȭ ��� �Ҵ� ����� �����ϼ���");
		System.out.println("R: �Ѹ� ���ʷ� �Ҵ�");
		System.out.println("L: ���� �ְų� ��Ⱑ ���� ���� �������� �Ҵ�");
		System.out.println("P: �켱������ ���� �� ���� �Ҵ�");
		System.out.println("A: ���� ������ �ʿ��� �� ���� ��ȭ��û");
		int ch=System.in.read();
		Scheduler scheduler=null;
		//System.out.println(ch);
		
		if(ch=='R' ||ch=='r') {
			scheduler = new RoundRobin();
		}
		else if(ch=='L' ||ch=='l') {
			scheduler = new LeastJob();
		}
		if(ch=='P' ||ch=='p') {
			scheduler = new PriorityAllocation();
		}
		if(ch=='A' ||ch=='a') {
			scheduler = new AgentCall();
		}
		else {
			System.out.println("�������� �ʴ� ����Դϴ�");
			return;
		}
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
	}
	
}
