
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
		System.out.println(brand+"커피전문점의 고객은"+passengerCount+"명이고, 수입은"+money+"입니다.");
}
}
