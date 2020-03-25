
public class MyDate {
   private int day;
   private int month;
   private int year;
   
   
   public int getDay() {
      return day;
   } // 날짜를 반환받는 메소드
   public void setDay(int day) {
      this.day = day;
   } //날짜를 입력하는 메소드
   
   
   public int getMonth() {
      return month;
   } //월을 반환받는 메소드
   public void setMonth(int month) {
      this.month = month;
   } //월을 입력하는 메소드
   
   
   public int getYear() {
      return year;
   } //연도를 받환받는 메소드
   public void setYear(int year) {
      this.year = year;
   } //연도를 입력하는 메소드
   
   
   //날짜 유효성을 확인하는 메소드
   public boolean isValid() {
      boolean result = true;
      
      if(this.month>12 || this.month<1 || this.day<1 || this.day>31) {
         result = false;
         System.out.println("날짜가 유효하지 않습니다");
         }
      else if(this.day ==31 && (this.month!= 1 && this.month!=3 && this.month!=5 && this.month!=7 
            && this.month!=8 && this.month!=10 && this.month!=12)) {
         System.out.println("날짜가 유효하지 않습니다.");
         result = false;
      }
      else if(this.month==2 && this.day>28) {
         System.out.println("날짜가 유효하지 않습니다.");
         result = false;
      }
      else {
         System.out.println("입력하신 날짜는 유효합니다.");
      }
      return result;
      }
   
   //생성자 메소드
   public MyDate(int day, int month, int year) {
      this.setYear(year);
      this.setMonth(month);
      this.setDay(day);
      System.out.println("입력하신 날짜는 "+ year +"년"+ month+"월"+day+"일 입니다.");
   }
   
   

}