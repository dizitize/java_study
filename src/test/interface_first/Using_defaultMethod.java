package test.interface_first;

public class Using_defaultMethod {

	public static void main(String[]args)
	{
	  
      /*리모컨 interface 타입으로 선언해서 구현체를 장착 할 수 있는 변수를 생성*/
		RemoteControl rc = null;
		
	  /*리모컨 인터페이스는 리모트 컨트롤러의 인터페이스의 구현체로서 
	   *rc변수는 이제 TV 를 관리할 수 있는 리모컨이 된다.*/ 	
	  rc = new Television_RemoteControl_Imple();
	  
	  rc.turnOn();
	  
	  /*setMute() 메소드는 DEAFAULT Method 로서
	      재정의한 메소드가 호출 되거나 없다면 인터페이스에서 정의한 메소드가 호출 된다.
	    없다면 그냥 "무음 해제 합니다" 가 뜬다.  
	      */
	  rc.setMute(false);
	  
	  /*rc 리모컨을 Audio를 관리하는 리모컨으로 재장착 하였다.*/
	  rc= new Audio_remoteControl_imple();
	  
	  /*setMute는 interface의 default method 이다.
	   * remoteControl 인터페이스를 구현한 audio remotecontrol 이 
	   * setMute를 재 정의 하였다면 "Audio 무음 해제 합니다."라는
	   * 재정의 메소드가 호출 된다. 
	   * */
	  rc.setMute(false);
	}
}
