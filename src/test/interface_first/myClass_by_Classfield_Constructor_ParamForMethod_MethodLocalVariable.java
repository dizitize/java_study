package test.interface_first;

public class myClass_by_Classfield_Constructor_ParamForMethod_MethodLocalVariable {

	/*class field 로서 구현체 개발코드 사용 가능*/
	RemoteControl rc = new Television_RemoteControl_Imple();
	
	/*Constructor 로서 구현체 개발코드 사용 가능*/
	public myClass_by_Classfield_Constructor_ParamForMethod_MethodLocalVariable(RemoteControl rc) {
    
		this.rc = rc;
	}
	
	/*메소드의 Local Variable 로서 구현체 개발코드 사용 가능*/
	public void method1()
	{
		RemoteControl rc = new Audio_remoteControl_imple();
		
		  rc.setMute(false);
	}
	
	/*메소드 Parameter for Method 로서 구현체 개발코드 사용 가능*/
	public void method2(RemoteControl rc)
	{
		
	}
	
}
