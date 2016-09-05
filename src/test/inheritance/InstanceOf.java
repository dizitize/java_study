package test.inheritance;
import test.inheritance.PolymorphoismCasting;

@SuppressWarnings("unused")
public class InstanceOf {

	public static void method1(Parent parent)
	{
		if(parent instanceof Child)
		{
			Child child =(Child) parent;
			
			System.out.println("method1 - Child로 변환 성공");
		}
		else
		{
			System.out.println("method1 - Child로 변환 되지 않음.");
		}
	}
	
	
   /*Class Exception 발생할 가능성 있음*/
	public static void method2(Parent parent)
	{
		Child child = (Child) parent;
		
		System.out.println("method2 - Child로 변환 성공");
	}

	
	
	public static void main (String[]args)
	{
	/*	Parent  parent  =  new Child();
				parent.field1 = "d";
			    parent.method1();	
			    
			    Child child  = (Child)parent;
			    
			    child.field2="3";
			    
			    
	  if(parent instanceof Child)
	  {
		  System.out.println("자식 객체 입니다.");
		  
	  }
	  else
	  {
		  System.out.println("부모 객체 입니다.");
	  }*/
	  
	  
      Parent p1 = new Child();
      method1(p1);
      method2(p1);
      
      Parent p2 = new Parent();
      method1(p2);
      method2(p2);
	  
	}
}
