
public class Coffee{
	int money;
	int Coupon;
	String brand;
	int passengerCount;
	
	public Coffee(String brand) {
		this.brand=brand;
	}
	public void take(int money) {
		this.money+=money;
		passengerCount++;
	}
	public void showInfo() {
		System.out.println(brand+"Ŀ���������� ����"+passengerCount+"���̰�, ������"+money+"�Դϴ�.");
}
}
