package test.interface_second;


public class Tire_impleClassz_with_CarMainClass {

	public static void main(String[]args)
	{
      /*자동차를 구입했음*/
	  Car car = new Car();
        
	   car.run();  
	   car.inforRunNum();
	    /*자동차 오른쪽 바퀴를 한국 타이어로 교체함*/
         car.tires[ Car.BACK_RIGHT_TIRE ] = new HankookTire();
        /*모의 주행*/
     System.out.println(" 뒤쪽 오른쪽 한국 타이어 교체 후 시험 주행 시작 ");
     car.run();
     System.out.println(" 뒤쪽 오른쪽 한국 타이어 교체 후 시험 주행 끝 ");
    
     System.out.println("****** 앞 오른쪽 금호 타이어로 교체 ********");
     car.tires[ Car.FRONT_RIGHT_TIRE ] = new KumhoTire();
     car.run();
		     System.out.println(" 모두 한국타이어 교체 \r 1회 주행 하겠습니다(1회에 10바퀴 굴러감)~ ");
		     car.tires[Car.FRONT_LEFT_TIRE] = new HankookTire();
		     car.tires[Car.FRONT_RIGHT_TIRE] = new HankookTire();
		     car.tires[Car.BACK_LEFT_TIRE] = new HankookTire();
		     car.tires[Car.BACK_RIGHT_TIRE] = new HankookTire();
		     
		     System.out.println("--------------- 10 회 주행 시작---------------"); 
		     for(int a = 0 ; a< 10 ; a++)
		     {
		    	 car.run();
		     }
		     System.out.println("---------------10 회 주행 완료---------------");
		     
		         car.inforRunNum();
	}
}

class Car {
	
	static final int    FRONT_RIGHT_TIRE  = 0;
	static final int     FRONT_LEFT_TIRE  = 1;
	static final int     BACK_RIGHT_TIRE  = 2;
	static final int      BACK_LEFT_TIRE  = 3;
	static final String[] TIRE_BATCH_STR  = {  "앞 오른쪽" , "앞 왼쪽  " , "뒤 오른쪽" , "뒤 왼쪽  " };
	
	private int             roundRollNum  = 0;
	
    Tire [] tires = { new NormalTire() , new NormalTire() , new NormalTire() , new NormalTire() }; 
    		          
	     void run()
	    {
		        for( int a = 0 ; a < tires.length ; a++ )
		        {
		        	System.out.print(TIRE_BATCH_STR[a]+" ");
		        	tires[a].roll();
		        }
		    	 System.out.println();
		    	 roundRollNum++;
        }
	     
	    public void inforRunNum()
	    {
	       System.out.println("현재 자동차 주행 정보 :"+roundRollNum+" 회 주행 했음\r");
	    }
}

interface Tire {

	public void roll();
}

class NormalTire implements Tire{
	
		@Override
		public void roll() {
			
		  System.out.println("일반 타이어가 굴러갑니다.");	
		}
}

class HankookTire implements Tire{
	
		@Override
		public void roll() {
			
		  System.out.println("한국 타이어가 굴러갑니다.");	
		}
}

class KumhoTire implements Tire{
	
		@Override
		public void roll() {
			
		  System.out.println("금호 타이어가 굴러갑니다.");	
		}
}