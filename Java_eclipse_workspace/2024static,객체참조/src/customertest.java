public class customertest {
	public static void main(String[] args) {
		customer customerPark=new customer();
		
		customerPark.setCustomerName("�ڻ�����");
		System.out.println(customerPark.customerName);
		System.out.println(customerPark.customerName+"���� �����"+customerPark.customerGrade+"�̸�,"
				+ "���ʽ� ����Ʈ��"+customerPark.BonusPoint(10000)+"�Դϴ�"+"  ������"+customerPark.calcPrice(10000)+"�Դϴ�.");
		
		VIPCustomer customerYoon=new VIPCustomer();
		customerYoon.setCustomerName("������");
		System.out.println(customerYoon.customerName);
		//System.out.println(customerYoon.customerName+"���� �����"+customerYoon.customerGrade+"�̸�,"
	//			+ "���ʽ� ����Ʈ��"+customerYoon.BonusPoint(9000)+"�Դϴ�"+"  ������"+customerYoon.clacPrice(9000)+"�Դϴ�");
		
		Goldcustomer customerLee=new Goldcustomer();
		customerLee.setCustomerName("������");
		System.out.println(customerLee.showCustomerInfo());
		
		customer customer1=new customer(); ///Ȯ�强�� ���� �ڹ�
		customer customer2=new VIPCustomer();
		customer2.setCustomerName("������");
		customer customer3=new Goldcustomer();
		customer3.setCustomerName("�����");
		System.out.println(customer2.showCustomerInfo());
		System.out.println(customer3.showCustomerInfo());
		System.out.println(customerYoon.showCustomerInfo());
	}
}
