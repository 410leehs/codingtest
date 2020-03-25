public class customertest {
	public static void main(String[] args) {
		customer customerPark=new customer();
		
		customerPark.setCustomerName("박새로이");
		System.out.println(customerPark.customerName);
		System.out.println(customerPark.customerName+"님의 등급은"+customerPark.customerGrade+"이며,"
				+ "보너스 포인트는"+customerPark.BonusPoint(10000)+"입니다"+"  가격은"+customerPark.calcPrice(10000)+"입니다.");
		
		VIPCustomer customerYoon=new VIPCustomer();
		customerYoon.setCustomerName("윤새로");
		System.out.println(customerYoon.customerName);
		//System.out.println(customerYoon.customerName+"님의 등급은"+customerYoon.customerGrade+"이며,"
	//			+ "보너스 포인트는"+customerYoon.BonusPoint(9000)+"입니다"+"  가격은"+customerYoon.clacPrice(9000)+"입니다");
		
		Goldcustomer customerLee=new Goldcustomer();
		customerLee.setCustomerName("이현석");
		System.out.println(customerLee.showCustomerInfo());
		
		customer customer1=new customer(); ///확장성이 좋은 자바
		customer customer2=new VIPCustomer();
		customer2.setCustomerName("최현수");
		customer customer3=new Goldcustomer();
		customer3.setCustomerName("노건훈");
		System.out.println(customer2.showCustomerInfo());
		System.out.println(customer3.showCustomerInfo());
		System.out.println(customerYoon.showCustomerInfo());
	}
}
