import java.util.Scanner;
public class VIPCustomer_version2 extends customer{
   double saleRatio;
   
   public VIPCustomer_version2() {
      super();
      customerGrade = "VIP";
      bonusRatio = 0.05;
      saleRatio = 0.1;
   }
   
   public int calcPrice2(int price) {
      bonusPoint += price * bonusRatio;
      return price-(int)(price*saleRatio);
   }
   
   public String showCustomerInfo2() {
      return customerName + "���� ����� "+ customerGrade + "�̰�, ���ʽ� ����Ʈ�� " + bonusPoint + "�Դϴ�.";
   }
   
   public static void main(String[] args) {
      customer cust1 = new customer();
      VIPCustomer_version2 cust2 = new VIPCustomer_version2();
      
      cust1.customerName = "������";
      cust2.customerName = "������";
      
      System.out.println(cust1.customerName + "���� �����ؾ� �ϴ� �ݾ��� "+cust1.calcPrice(10000)+"�� �Դϴ�.");
      System.out.println(cust2.customerName + "���� �����ؾ� �ϴ� �ݾ��� "+cust2.calcPrice2(10000)+"�� �Դϴ�.");
      
      System.out.println(cust1.showCustomerInfo());
      System.out.println(cust2.showCustomerInfo2());
      
      
      System.out.println("ȸ���� �̸��� �Է��ϼ���.");
      Scanner input1 = new Scanner(System.in);
      String name = input1.next();
      
      System.out.println("ȸ���� ����� �Է��ϼ���.(�Ϲݵ�� : 1, Vip : 2)");
      Scanner input2 = new Scanner(System.in);
      int grade = input2.nextInt();
      
      System.out.println("���� ������ �Է��ϼ���.");
      Scanner input3 = new Scanner(System.in);
      int price = input3.nextInt();
      
      
      if(grade == 1) {
         customer cust11 = new customer();
         cust11.customerName=name;
         int calPrice = cust11.calcPrice(price);
         System.out.println(name + "���� �����ؾ� �ϴ� �ݾ��� "+calPrice+"�� �Դϴ�.");
         System.out.println(cust11.showCustomerInfo());
         }
      else if (grade == 2){
         VIPCustomer_version2 cust22 = new VIPCustomer_version2();
         cust22.customerName=name;
         int calPrice = cust22.calcPrice(price);
         System.out.println(name + "���� �����ؾ� �ϴ� �ݾ��� "+calPrice+"�� �Դϴ�.");
         System.out.println(cust22.showCustomerInfo2());
      }
      else {
         System.out.println("�߸��Է��ϼ̽��ϴ�.");
      }
      
   }

}