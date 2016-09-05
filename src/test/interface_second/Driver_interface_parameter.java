package test.interface_second;

public class Driver_interface_parameter {

	public static void main(String[]args)
	{
		Driver driver = new Driver();
		
		       Bus   bus  = new Bus();
		       Taxi taxi  = new Taxi();
		  
		  /*  인터페이스의 파라미터로 받는다 !
		   *    인터페이스의 추상정보를 구체화한 녀석들을 고를 수 있기 때문이다!!!
		   * 
		   * 
		   *  객체를 이용하는 주체자가 탄다 !
		     무엇을? 
		     인터페이스로 관리할 수 있는 탈것이란 추상체를~ 
		     추상체를 구체화 한 택시나 버스 중 골라서~*/
		   driver.drive(bus);   
		   driver.drive(taxi);
 	}
}

	class Driver{
		
		public void drive(Vehicle vehicle)
		{
			vehicle.run();
		}
	}

		interface Vehicle{
		
			public void run();
		}

			class Bus implements Vehicle{
				@Override
				public void run() {
					// TODO Auto-generated method stub
			       System.out.println("BUS 가 달립니다.");		
				}
				public void speacial(){
					System.out.println("dhkd");
				}
			}
			
			class Taxi implements Vehicle{
				@Override
				public void run() {
					// TODO Auto-generated method stub
				   System.out.println("TAXI 가 달립니다.");	
				}
			}