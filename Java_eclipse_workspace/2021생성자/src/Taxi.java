
public class Taxi {
	String taxiNumber;
	int passengerCount;
	int money;
	
	public Taxi(String taxiNumber) {
		this.taxiNumber=taxiNumber;
	}
	public void take(int money) {
		this.money+=money;
		passengerCount++;
	}
	public void showInfo() {
		System.out.println(taxiNumber+"택시의 승객은"+passengerCount+"명이고, 수입은"+money+"입니다.");
}
}
