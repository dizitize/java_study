package test.generic.method;


	class Box<T> 
	{
		  private T t;
		
		public void set(T t) { this.t= t; }
		public T get() { return t; }
    }

	

	public class GenericMethod {
	
		public static <T> Box<T> boxing(T type)
		{
			Box<T> box = new Box<T>();
			
			       box.set(type);
			
			return box;
		}
		
		
		
	  public static void main (String[]args)
	  {
		 /*명시적인 타입을 선언해서 사용 할 수 도 있다*/
			  GenericMethod.boxing(new Box<Integer>());
			  
			  Box<Integer> box1 = GenericMethod.<Integer>boxing(100);
	          
		      int intValue = box1.get();
	 
	  System.out.println(intValue);
		  
	  
		 /*컴파일러가 매개값의 타입을 보고 구체적인 타입을 추정 할수도 있다*/
			  GenericMethod.boxing(100);
	           
			  Box<String> box2 = boxing("홍길동");
	        
			  String strValue = box2.get();
		  
	   System.out.println(strValue);
		  
	  }
		
	}

	
	