
public class Drink {

	public static void main(String[] args) {
		workman workmanVicky=new workman("Vicky",5000);
		workman workmanSpencer=new workman("Spencer",6000);
		
	
	Coffee americano=new Coffee("Starbucks");
	workmanVicky.starbucks(americano);
	workmanVicky.showInfo();
	americano.showInfo();
	
	Coffee latte=new Coffee("CoffeeBean");
	workmanSpencer.coffeebean(latte);
	workmanSpencer.showInfo();
	latte.showInfo();
}
}