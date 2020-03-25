public class CarTest {
	public static void main(String[] args) {//static: 하위 클래스들과 이 메소드를 공유하겠다.
		System.out.println("=======자율주행하는 자동차=======");
		Car myCar=new AICar();
		myCar.run();
		
		System.out.println("=======사람이 운전하는 자동차=======");
		Car hisCar=new ManualCar();
		hisCar.run();
	}
}
		
		
		/*Bus bus=new Bus();
		AutoCar autoCar=new AutoCar();
		
		bus.run();
		autoCar.run();
		bus.refuel();
		autoCar.refuel();
		
		bus.takePassenger();
		autoCar.load();
		
		bus.stop();
		autoCar.stop();
	}
}*/
