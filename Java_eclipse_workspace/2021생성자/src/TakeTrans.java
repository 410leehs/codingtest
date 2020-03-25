
public class TakeTrans {

	public static void main(String[] args) {
		Student studentChris=new Student("Chris",5000);//변수와 객체
		Student studentEmily=new Student("Emily",5000);
		Student studentDavid=new Student("David",11000);
		
		Bus bus100=new Bus(100);
		studentChris.takeBus(bus100);
		studentChris.showInfo();
		bus100.showInfo();
		
		Subway subwayGreen=new Subway("2호선");
		studentEmily.takeSubway(subwayGreen);
		studentEmily.showInfo();
		subwayGreen.showInfo();
		
		Taxi taxiKakao=new Taxi("Kakao");
		studentDavid.takeTaxi(taxiKakao);
		studentDavid.showInfo();
		taxiKakao.showInfo();
	}

}
