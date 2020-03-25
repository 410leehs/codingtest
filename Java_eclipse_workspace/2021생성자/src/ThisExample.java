class BirthDay{
	int day;
	int month;
	int year;
	public void setYear(int year1) {//태어난 연도를 지정하는 메소드
		this.year=year1;
	}
	public void printThis() {
		System.out.println(this);//this 출력
	}
}
public class ThisExample {

	public static void main(String[] args) {//void main()함수가 들어간 클래스를 파일의 이름으로 해야한다
		BirthDay bDay= new BirthDay();		//이때 public클래스는 하나다.
		bDay.setYear(2000);		//년도를 2000으로 지정
		System.out.println(bDay);//참조변수를 출력
		bDay.printThis();		// this출력 메소드를 호출

	}

}
//출력값이 같다. 즉, 같은 곳을 바라보는 것이다.