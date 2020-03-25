import java.util.Scanner;

public class MyDateTest {
   public static void main(String[] args) {
      Scanner today = new Scanner(System.in);

      for (;;) {
         System.out.println("날짜를 입력해주세요.");
         
         System.out.print("연도 : ");
         int y = today.nextInt();
         
         System.out.print("월 : ");
         int m = today.nextInt();
         
         System.out.print("일 : ");
         int d = today.nextInt();
         
         if (d == 0 && m == 0 && y == 0) {
            System.out.println("프로그램을 종료합니다.");
            break;
         } else {
            MyDate date = new MyDate(d, m, y);
            date.isValid();
            System.out.println(" ");

         }
      }

   }

}