package test.interface_first;

public class Audio_remoteControl_imple implements RemoteControl {

	private int volume ;
	/*interface default method 를 오버라이딩 받아서 구현체만의 메소드로 재 정의하기위한 필드 */
	
	@Override
	public void turnOn() {
        System.out.println("Audio turn ON!");
	}

	@Override
	public void turnOff() {
        System.out.println("Audio turn OFF!");
	}

	@Override
	public void setVolume(int volume) {

		if(volume > RemoteControl.MAX_VOLUME)
		{
			this.volume = RemoteControl.MAX_VOLUME;
		}
		else if(volume < RemoteControl.MIN_VOLUME)
		{
			 this.volume = RemoteControl.MIN_VOLUME;
		}
		else
		{
			this.volume = volume;
		}
		
		System.out.println("현재 Audio 볼륨은 "+this.volume+"입니다.");
	}
	
	/*Interface 의 default method 를 오버라이딩 받아서 구현체만의 메소드로 재 정의한다.*/
	@Override
	public void setMute(boolean mute) {
		
     
		  if(mute)
		  {
			  System.out.println("Audio 무음 처리 합니다.");
		  }
		  else
		  {
			  System.out.println("Audio 무음 해제 합니다.");
		  }
	}
	
}