package test.inheritance;

public class PolymorphoismCasting {
	
   /* ----- 강제 타입변환   부모 타입을 자식타입으로 변환 ------*/
	
  public static void main (String[]args)
  {
	  
	/*부모 타입으로서 자식의 필드와 메소드를 사용 할 수가 없다.*/ 
	  
	  Parent parent = new Child();
	  
	  parent.field1 ="data1";
	  
	  parent.method1();
	  parent.method2();

	 /*하지만 강제 casting 을 통해서 사용 할 수가 있다.*/
	  
	  Child child =(Child) parent;
	  
	  child.field2 ="강제 casting 된 부모 타입";
	  child.method3();
	  
  }
	
}

	class Parent {
		
		public String field1;
		
		public void method1()
		{
			System.out.println("Parent-method1()");
		}
		
		public void method2()
		{
			System.out.println("Parent-method2()");
		}
	}

	class Child extends Parent{
		
	  public String field2;
	  
	  public void method3()
	  {
		   System.out.println("Child-method3()");
	  }
	}
