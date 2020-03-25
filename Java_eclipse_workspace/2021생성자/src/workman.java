
public class workman {
	public String workmanName;
	public int money;
	
	public workman(String workmanName, int money) {
		
		this.workmanName=workmanName;
		this.money=money;
	}
	public void starbucks(Coffee americano) {
		americano.take(4000);
		this.money-=4000;
	}
	public void coffeebean(Coffee latte) {
		latte.take(4500);
		this.money-=4500;
	}
	public void showInfo() {
		System.out.println(workmanName+"¥‘¿« ≥≤¿∫ µ∑¿∫"+money+"¿‘¥œ¥Ÿ");
	}
}
