package test.interface_first;

public interface RemoteControl {

	public int MAX_VOLUME = 20;
	public int MIN_VOLUME = 1;
	
	/*추상메소드 */
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	/*디폴트 메소드*/
	default void setMute(boolean mute)
	{
		if(mute)
		{
			System.out.println("무음 처리 합니다.");
		}
		else
		{
			System.out.println("무음 해제 합니다.");
		}
		
	}

   /*정적메소드*/
    static void changeBattery()
    {
       System.out.println("건전지를 교체 합니다.");     	
    }
	
}
