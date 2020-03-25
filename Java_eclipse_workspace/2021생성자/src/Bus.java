
public class Bus {
	int busNumber;
	int passengerCount;
	int money;
	
	public Bus(int busNumber) {//버스 번호를 매개변수로받는 생성자
		this.busNumber=busNumber;
	}
	public void take(int money) {//승객이 낸 돈을 받음 메소드
		this.money+=money;//버스 수입의 증가
		passengerCount++;//승객의 수 증가
	}
	public void showInfo() {
		System.out.println("버스"+busNumber+"번의 승객은"+passengerCount+"명이고, 수입은"+money+"입니다.");
}
}