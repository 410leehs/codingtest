
public class Bus {
	int busNumber;
	int passengerCount;
	int money;
	
	public Bus(int busNumber) {//���� ��ȣ�� �Ű������ι޴� ������
		this.busNumber=busNumber;
	}
	public void take(int money) {//�°��� �� ���� ���� �޼ҵ�
		this.money+=money;//���� ������ ����
		passengerCount++;//�°��� �� ����
	}
	public void showInfo() {
		System.out.println("����"+busNumber+"���� �°���"+passengerCount+"���̰�, ������"+money+"�Դϴ�.");
}
}