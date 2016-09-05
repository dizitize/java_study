package test.generic.extendx;

class Util {
	
	               /*      T extends (bounded type parameter)
	                * 
	                *  선언 방법 : 타입파라미터 뒤 extends 키워드 붙이고 상위 타입을 명시 
	                *  
	                *extends : 구체적인 타입을 제한 할 필요가 있을때 사용한다*/
	public static <T extends Number> int compare(T t1 , T t2 )
	{                      /*Number :  타입 혹은 하위 클래스 타입 인스턴스만 가져야 한다. 
	                                                          하위 클래스 타입(Byte,Short,Integer,Long,Double)*/
			double v1 = t1.doubleValue();
			double v2 = t2.doubleValue();
		
		return Double.compare(v1, v2);
	}

	
	public static <T extends Number> String transfer2String(T t1 , T t2 )
	{
		double v1 =t1.doubleValue();
		double v2 =t2.doubleValue();
		
		int r = Double.compare(v1, v2);
		
			switch(r)
			{
			  case  1 : return "첫번째 값이 큽니다."; 
			  case  0 : return "두 값은 같습니다.";  
			  case -1 : return "두번째 값이 더 큽니다.";
			}
			
        return "수행 되지 못 하였습니다.";
	}
}

public class BoundedTypeParam {

	public static void main(String[]args)
	{
		int result2 = Util.compare(1, 3.5);
		System.out.println(result2);
		
			System.out.println("1번: "+Util.transfer2String(1, 0));
			System.out.println("2번: "+Util.transfer2String(1,3.5));
	}
}
