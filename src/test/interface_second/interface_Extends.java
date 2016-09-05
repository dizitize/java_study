package test.interface_second;

public class interface_Extends {

	public static void main (String[]args)
	{
       ImpleC impl = new ImpleC();
       
	       InterfaceA  iA = impl;
	       iA.methodA();
		   
       System.out.println("------------------구분자------------------------");
	       
	       InterfaceB  iB = impl;
		   iB.methodB();
		   
	   System.out.println("------------------구분자------------------------");
		   
		   InterfaceC  iC = impl;
		   iC.methodA();
		   iC.methodB();
		   iC.methodC();
	}
}


class ImpleC implements InterfaceC{
	
	@Override
	public void methodA() {
		// TODO Auto-generated method stub
         System.out.println("impleC -methodA() 실행");		
	}
	
	@Override
	public void methodB() {
		// TODO Auto-generated method stub
		System.out.println("impleC -methodB() 실행");
	}
	
	@Override
	public void methodC() {
		// TODO Auto-generated method stub
		System.out.println("impleC -methodC() 실행");
	}
}

interface InterfaceA{
	
	public void methodA();
}

interface InterfaceB{
	
	public void methodB();
}

interface InterfaceC extends InterfaceA , InterfaceB {

	public void methodC();
}