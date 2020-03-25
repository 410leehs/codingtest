
public class PriorityAllocation implements Scheduler{
	public void getNextCall() {
		System.out.println("상담전화를 순서대로 대기열에서 가져옵니다.");
	}
	public void sendCallToAgent() {
		System.out.println("등급이 높은 고객 먼저 할당합니다");
	}

}
