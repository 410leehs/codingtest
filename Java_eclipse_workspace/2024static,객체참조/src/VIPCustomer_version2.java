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
      return customerName + "님의 등급은 "+ customerGrade + "이고, 보너스 포인트는 " + bonusPoint + "입니다.";
   }
   
   public static void main(String[] args) {
      customer cust1 = new customer();
      VIPCustomer_version2 cust2 = new VIPCustomer_version2();
      
      cust1.customerName = "연초코";
      cust2.customerName = "연주은";
      
      System.out.println(cust1.customerName + "님이 지불해야 하는 금액은 "+cust1.calcPrice(10000)+"원 입니다.");
      System.out.println(cust2.customerName + "님이 지불해야 하는 금액은 "+cust2.calcPrice2(10000)+"원 입니다.");
      
      System.out.println(cust1.showCustomerInfo());
      System.out.println(cust2.showCustomerInfo2());
      
      
      System.out.println("회원의 이름을 입력하세요.");
      Scanner input1 = new Scanner(System.in);
      String name = input1.next();
      
      System.out.println("회원의 등급을 입력하세요.(일반등급 : 1, Vip : 2)");
      Scanner input2 = new Scanner(System.in);
      int grade = input2.nextInt();
      
      System.out.println("구매 가격을 입력하세요.");
      Scanner input3 = new Scanner(System.in);
      int price = input3.nextInt();
      
      
      if(grade == 1) {
         customer cust11 = new customer();
         cust11.customerName=name;
         int calPrice = cust11.calcPrice(price);
         System.out.println(name + "님이 지불해야 하는 금액은 "+calPrice+"원 입니다.");
         System.out.println(cust11.showCustomerInfo());
         }
      else if (grade == 2){
         VIPCustomer_version2 cust22 = new VIPCustomer_version2();
         cust22.customerName=name;
         int calPrice = cust22.calcPrice(price);
         System.out.println(name + "님이 지불해야 하는 금액은 "+calPrice+"원 입니다.");
         System.out.println(cust22.showCustomerInfo2());
      }
      else {
         System.out.println("잘못입력하셨습니다.");
      }
      
   }

}