public class VIPCustomer extends customer {
	
	double saleRatio;
	
	public VIPCustomer() {
		super();//���� Ŭ�������� ���� Ŭ������ ������ �� ����ϴ� �����, ���ص� ȣ����
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
	public String showCustomerInfo(){ //�޼ҵ� �������̵�
		return customerName+"���� �����"+customerGrade+"�̸�, ���ʽ� ����Ʈ��"
				+BonusPoint(10000)+"�Դϴ�.  ������"+ calcPrice(10000)+"�Դϴ�";
	}
}
