package test.inheritance;


public class DriveExample {

	public static void main(String[]args)
	{
    
    /*----- 매게 변수의 다형성 ----*/  
		Drive   drive   = new Drive();
		
		Vehicle vehicle    = new Vehicle();
		        Bus  bus   = new Bus();
		        Taxi taxi  = new Taxi();
		drive.drive(vehicle);
		drive.drive(bus);
		drive.drive(taxi);
	}
	
}

class Drive {

	void drive(Vehicle vehicle)
	{
		vehicle.run();
	}
	
}

class Vehicle{
	
	void run()
	{
		System.out.println("운송수단 달립니다.");
	}
}
class Bus extends Vehicle{

	@Override
	void run() {
		
		System.out.println("버스가 달립니다.");
	}
	
	/* 오직 구현체 자신만이 사용 할 수 있는 메소드 부모?! interface 타입으로 정의 된 구현체는 
	    인터페이스 명세에 없는 내용이기에 사용 할 수 없다.*/
	void onlyBusDriverUse()
	{
		System.out.println("버스가 더욱 빠르게 달립니다.");
	}
}
class Taxi extends Vehicle{
	
	@Override
	void run() {
        System.out.println("택시가 달립니다.");
	 }
}