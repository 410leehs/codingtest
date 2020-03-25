public class VIPCustomer extends customer {
	
	double saleRatio;
	
	public VIPCustomer() {
		super();//하위 클래스에서 상위 클래스에 접근할 때 사용하는 예약어, 안해도 호출함
		customerGrade="VIP";
		bonusRatio=0.05;
		saleRatio=0.1;
	}
	public int calcPrice(int price) {
		bonusPoint +=price*bonusRatio;
		return price -(int)(price*saleRatio);
	}
	public int BonusPoint(int price) {
		price -=(int)(price*saleRatio);
		return bonusPoint +=price*bonusRatio;
		
	}
	public String showCustomerInfo(){ //메소드 오버라이딩
		return customerName+"님의 등급은"+customerGrade+"이며, 보너스 포인트는"
				+BonusPoint(10000)+"입니다.  가격은"+ calcPrice(10000)+"입니다";
	}
}
