public class CarTest {
	public static void main(String[] args) {//static: ���� Ŭ������� �� �޼ҵ带 �����ϰڴ�.
		System.out.println("=======���������ϴ� �ڵ���=======");
		Car myCar=new AICar();
		myCar.run();
		
		System.out.println("=======����� �����ϴ� �ڵ���=======");
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
