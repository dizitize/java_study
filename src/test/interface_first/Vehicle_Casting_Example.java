package test.interface_first;

public class Vehicle_Casting_Example {

	public static void main (String[]args)
	{
		Vehicle v = new Bus();
		
		v.run();
		/*사용 불가   v.checkFare();*/
		/*승차요금을 확인 해봐야하는데  인터페이스(설명서)에 명시 되어있던 내용이 아니기에
		  캐스팅을 통해 확인해 봐야한다.
		  안 그러면 잘못 하여 다른 구현체의 강제 캐스팅이 이뤄 지면 바로
		 Class casting Exception 이 발생 한다.
		  */
		
		if(v instanceof Bus)
		{
			Bus fareCheck = (Bus) v;
			fareCheck.checkFare();
		}
		else if(v instanceof Taxi)
		{
			Taxi fareCheck =(Taxi) v;
		    fareCheck.checkFare();
		} 
		
	}
}

 interface Vehicle
 {
	 public void run();
 }
 
 class Bus implements Vehicle{
	 
	 @Override
	public void run() {
		// TODO Auto-generated method stub
	  System.out.println("BUS 가 달립니다.");	
	}
	 
	 public void checkFare()
	 {
		 System.out.println("BUS 승차 요금을 확인 합니다.");
	 }
 }
 
 class Taxi implements Vehicle{
	 
	 @Override
	public void run() {
		// TODO Auto-generated method stub
	   System.out.println("TAXI 가 달립니다.");	
	}
	 
	 public void checkFare()
	 {
		 System.out.println("TAXI 승차 요금을 확인 합니다.");
	 } 
 }
 