
public class Goldcustomer extends customer{
	double saleRatio;
	
	public Goldcustomer() {
		super();//���� Ŭ�������� ���� Ŭ������ ������ �� ����ϴ� �����, ���ص� ȣ����
		customerGrade="Gold";
		bonusRatio=0.03;
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
