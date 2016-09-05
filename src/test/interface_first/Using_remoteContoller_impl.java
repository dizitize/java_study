package test.interface_first;

public class Using_remoteContoller_impl {

	public static void main (String[]args)
	{
		RemoteControl rc;
		
		rc = new Television_RemoteControl_Imple();
		rc.setVolume(530);    
		
		rc = new Audio_remoteControl_imple();
	    
		
		
		SmartTV_Searchable_imple_Remote_imple 
		
		smartTv = new SmartTV_Searchable_imple_Remote_imple();
		
		smartTv.search("http://localhost:8080/jhuck");
		

		
		System.out.println("구분자~~~~");
		/*인터페이스로 생성*/
		
		RemoteControl remoteController;
	   
		 /*리모컨에 audio를 조정 할 수 있도록 기능 장착*/
		remoteController = new Audio_remoteControl_imple();
		remoteController.turnOn();
		
		/*리모컨에 TV 를 조정 할 수 있도록 기능 장착*/
		remoteController = new Television_RemoteControl_Imple();
		remoteController.turnOn();
		/*smart tv를 조절 할 수 있는 능력을 가지게 되었습니ㅏㄷ.*/
		remoteController = new SmartTV_Searchable_imple_Remote_imple();
		remoteController.turnOn();
	} 
	
}
