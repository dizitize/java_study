package test.interface_first;

public class StaticMethod_not_using_Imple_using_interface {

	public static void main (String[]args)
	{
	  /*changeBattery method는 staticMethod 로서 인터페이스로 바로 호출이 가능하다.*/
		RemoteControl.changeBattery();
	}
}
