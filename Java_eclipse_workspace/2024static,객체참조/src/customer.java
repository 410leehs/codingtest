public class customer {
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	public customer() {
		customerGrade="Silver";
		bonusRatio=0.1;
	}
	public int BonusPoint(int price) {
		
		return bonusPoint +=price*bonusRatio;
	}
	public int calcPrice(int price) {
		bonusPoint +=price*bonusRatio;
		return price;
	}
	
	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
		this.customerGrade = customerGrade;
	}

	/*public int getCustomerID() {					//GET
		return customerID;
	}

	public void setCustomerID(int customerID) {     //SET
		this.customerID = customerID;
	}*/

	public String showCustomerInfo(){
		return customerName+"���� �����"+customerGrade+"�̸�. ���ʽ� ����Ʈ��"
				+bonusPoint+"�Դϴ�.";
	}
}
